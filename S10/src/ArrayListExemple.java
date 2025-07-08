import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListExemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] v = new double[n]; // vetores

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + v[i];
        }

        double avg = soma / n;

        System.out.println("AVERAGE HIGH: " + avg);
    }
}