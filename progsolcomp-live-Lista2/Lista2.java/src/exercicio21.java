/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
* Data: 15/05/2023
*/
import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número positivo: ");
            int numero = scanner.nextInt();

            for (int i = 1; i <= numero; i++) {
                System.out.println("Tabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }
    }
}