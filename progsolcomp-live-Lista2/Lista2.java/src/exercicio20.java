/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Escreva um programa que, dada a carga máxima de um
elevador e a quantidade máxima de pessoas digitadas pelo
usuário, leia o peso de cada pessoa, também digitada pelo
usuário, que entra no elevador até que a carga máxima seja
atingida ou o número máximo de pessoas seja atingido (utilize
do /while).
* Data: 15/05/2023
*/
import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a carga máxima do elevador em kg: ");
            int cargaMaxima = scanner.nextInt();

            System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
            int quantidadeMaxima = scanner.nextInt();

            int pesoTotal = 0;
            int quantidadePessoas = 0;

            do {
                System.out.print("Digite o peso da pessoa em kg: ");
                int peso = scanner.nextInt();

                if (pesoTotal + peso <= cargaMaxima && quantidadePessoas + 1 <= quantidadeMaxima) {
                    pesoTotal += peso;
                    quantidadePessoas++;
                } else {
                    System.out.println("Limite de carga ou quantidade de pessoas atingido. Não é possível adicionar mais pessoas.");
                    break;
                }
            } while (true);

            System.out.println("No elevador há " + quantidadePessoas + " pessoas, com um peso total de " + pesoTotal + " kg.");
        }
        
    }
}