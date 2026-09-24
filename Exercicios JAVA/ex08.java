import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(Scanner.in);
        System.out.print("Digite um númerp inteiro: ");
        int numero = entrada.nextInt();

        if (numero %2 == 0) {
            System.out.println(numero + "é par.");
        } else {
            System.out.println(numero + "é impar.");
        }

        entrada.close();
    }
}