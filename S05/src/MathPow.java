import java.util.Scanner;
import java.lang.Math;

public class MathPow {
    public static void main(String[] args) {
        double numValueFirst = 0;
        double numValueSecond = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        numValueFirst = sc.nextDouble();
        System.out.println("Agora, digite o segundo valor: ");
        numValueSecond = sc.nextDouble();

        sc.close();

        System.out.println("O Resultado entre " + numValueFirst + " elevado em " + numValueSecond + " = " + Math.pow(numValueFirst, numValueSecond));
    }
}