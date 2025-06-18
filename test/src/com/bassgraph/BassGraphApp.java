package com.bassgraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    // Interface para o downloader de áudio do YouTube
    interface IYoutubeAudioDownloader {
        AudioStream downloadAudio(String youtubeLink) throws Exception;
    }

    // Implementação concreta usando yt-dlp como processo externo
    class YoutubeDownloader implements IYoutubeAudioDownloader {
        private static final String OUTPUT_DIR = "." + File.separator + "downloads";

        @Override
        public AudioStream downloadAudio(String youtubeLink) throws Exception {
            File outputDirectory = new File(OUTPUT_DIR);
            if (!outputDirectory.exists()) {
                outputDirectory.mkdirs();
            }

            String outputFileNameTemplate = "%%(title)s.%%(ext)s";
            String infoFileNameTemplate = "%%(title)s.%%(ext)s.info.txt";

            List<String> command = new ArrayList<>(Arrays.asList(
                    "yt-dlp",
                    "-x",
                    "--audio-format", "mp3",
                    "--print-to-file", infoFileNameTemplate,
                    "-o", OUTPUT_DIR + File.separator + outputFileNameTemplate,
                    youtubeLink
            ));

            System.out.println("Executando comando: " + String.join(" ", command));

            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.redirectErrorStream(true); // Redirect error stream to input stream
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuilder output = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new RuntimeException("yt-dlp exited with error code " + exitCode + ":\n" + output.toString());
            }

            // Extract the downloaded filename from the yt-dlp output
            Pattern pattern = Pattern.compile("\\[download\\] Destination: (.+)");
            Matcher matcher = pattern.matcher(output.toString());
            String downloadedFilePath = null;
            while (matcher.find()) {
                downloadedFilePath = matcher.group(1);
            }

            if (downloadedFilePath == null) {
                throw new RuntimeException("Could not determine downloaded file path from yt-dlp output.");
            }

            System.out.println("Áudio baixado com sucesso. Caminho: " + downloadedFilePath);
            return new AudioStream(downloadedFilePath);
        }
    }

    // Classe para representar o fluxo/arquivo de áudio
    class AudioStream {
        private String filePath; // Ou poderia ser byte[] audioData

        public AudioStream(String filePath) {
            this.filePath = filePath;
        }

        public String getFilePath() {
            return filePath;
        }
        // Outros métodos para acessar os dados do áudio
    }

    // Interface para o processador de áudio
    interface IAudioProcessor {
        BassData extractBassData(AudioStream audioStream) throws Exception;
    }

    // Implementação concreta usando uma biblioteca de processamento de áudio (ex: TarsosDSP)
    class AudioSignalProcessor implements IAudioProcessor {
        @Override
        public BassData extractBassData(AudioStream audioStream) throws Exception {
            // Lógica para carregar o áudio do AudioStream
            // Aplicar FFT e analisar as frequências graves
            // Retorna um objeto BassData
            System.out.println("Processando áudio de: " + audioStream.getFilePath());
            // Simulação: retorna dados de grave fictícios (intensidade ao longo do tempo)
            return new BassData(new double[]{0.5, 0.7, 0.6, 0.8, 0.5});
        }
    }

    // Classe para representar os dados do grave extraídos
    class BassData {
        private double[] intensityOverTime; // Intensidade do grave em diferentes pontos no tempo

        public BassData(double[] intensityOverTime) {
            this.intensityOverTime = intensityOverTime;
        }

        public double[] getIntensityOverTime() {
            return intensityOverTime;
        }
    }

    // Interface para o gerador de gráficos
    interface IBassGraphGenerator {
        void generateGraph(BassData bassData);
    }

    // Implementação para gerar um gráfico simples no console
    class ConsoleBassGraphGenerator implements IBassGraphGenerator {
        @Override
        public void generateGraph(BassData bassData) {
            System.out.println("\n--- Gráfico de Graves (Console) ---");
            double[] intensities = bassData.getIntensityOverTime();
            for (double intensity : intensities) {
                int barLength = (int) (intensity * 50); // Escala para o console
                for (int i = 0; i < barLength; i++) {
                    System.out.print("*");
                }
                System.out.println(" (" + String.format("%.2f", intensity) + ")");
            }
            System.out.println("----------------------------------\n");
        }
    }

    // Classe principal da aplicação
    public class BassGraphApp {
        private IYoutubeAudioDownloader audioDownloader;
        private IAudioProcessor audioProcessor;
        private IBassGraphGenerator graphGenerator;

        public BassGraphApp(IYoutubeAudioDownloader downloader, IAudioProcessor processor, IBassGraphGenerator generator) {
            this.audioDownloader = downloader;
            this.audioProcessor = processor;
            this.graphGenerator = generator;
        }

        public void createBassGraphFromYoutubeLink(String youtubeLink) {
            try {
                System.out.println("Iniciando processo para o link: " + youtubeLink);
                AudioStream audio = audioDownloader.downloadAudio(youtubeLink);
                BassData bassInfo = audioProcessor.extractBassData(audio);
                graphGenerator.generateGraph(bassInfo);
                System.out.println("Processo concluído.");
            } catch (Exception e) {
                System.err.println("Ocorreu um erro: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            // Configuração com as implementações concretas (injeção de dependência)
            IYoutubeAudioDownloader downloader = new YoutubeDownloader();
            IAudioProcessor processor = new AudioSignalProcessor();
            IBassGraphGenerator consoleGenerator = new ConsoleBassGraphGenerator();

            BassGraphApp app = new BassGraphApp(downloader, processor, consoleGenerator);

            // Exemplo de uso
            String youtubeLink = "https://www.youtube.com/watch?v=exemploVideoComGraves";
            app.createBassGraphFromYoutubeLink(youtubeLink);
        }
    }

}
