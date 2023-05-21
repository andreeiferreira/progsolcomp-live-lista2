/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do ProgramaFaça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.: 
* Data: 14/05/2023
*/
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = input.nextInt();

        double precoDiaria = 60.0;
        double taxaServico;

        if (numDiarias > 15) {
            taxaServico = 5.5;
        } else if (numDiarias == 15) {
            taxaServico = 6.0;
        } else {
            taxaServico = 8.0;
        }

        double precoTotal = numDiarias * precoDiaria + numDiarias * taxaServico;

        System.out.printf("O preço total da hospedagem é R$ %.2f\n", precoTotal);

        input.close();
    }
}