/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que determine o fatorial de um número.
Para este problema, tem-se como entrada o valor do número do
qual se deseja calcular o fatorial. O fatorial de 0 é igual a
1. O fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
* Data: 15/05/2023
*/
import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            long fatorial = 1;
            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}