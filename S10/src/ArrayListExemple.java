import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExemple {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            System.out.println("nome");
            String nome = sc.nextLine();

            nomes.add(nome);
        }

        System.out.println(nomes);
    }
}