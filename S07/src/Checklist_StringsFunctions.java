import java.util.Scanner;

public class Checklist_StringsFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String phraseUser = sc.nextLine();

        String phraseConvertSystem = phraseUser.toLowerCase();
        System.out.print("toLowerCase: "+ phraseConvertSystem + "\n");

        phraseConvertSystem = phraseUser.toUpperCase();
        System.out.print("toUpperCase: "+ phraseConvertSystem + "\n");

        phraseConvertSystem = phraseUser.trim();
        System.out.print("trim: "+ phraseConvertSystem + "\n");

        phraseConvertSystem = phraseConvertSystem.substring(2);
        System.out.print("substring[i=2]: "+ phraseConvertSystem + "\n");

        phraseConvertSystem = phraseConvertSystem.substring(2,4);
        System.out.print("substring[i=2]: "+ phraseConvertSystem + "\n");

        // ----//----

        int index = phraseConvertSystem.indexOf("m");
        System.out.print("index: "+ index + "\n");

        int indexLast = phraseConvertSystem.lastIndexOf("m");
        System.out.print("index: "+ indexLast + "\n");


    }
}