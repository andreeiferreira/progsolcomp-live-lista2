/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação.
Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão" 
* Data: 14/05/2023
*/
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        executarPrograma();
        System.exit(0);
    }

    public static void executarPrograma(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira um número entre 1 a 12, os quais correspondem a um mês do ano:");
        int numberMonth = userInput.nextInt();

        mesEstacaoAtual(numberMonth);

        userInput.close();
    }

    private static void mesEstacaoAtual(int numberMonth) {
        switch (numberMonth){
            case 1:
                System.out.println("Mês: Janeiro - Estação: Verão");
                break;
            case 2:
                System.out.println("Mês: Fevereiro - Estação: Verão");
                break;
            case 3:
                System.out.println("Mês: Março - Estações: Verão e Outono");
                break;
            case 4:
                System.out.println("Mês: Abril - Estação: Outono");
                break;
            case 5:
                System.out.println("Mês: Maio - Estação: Outono");
                break;
            case 6:
                System.out.println("Mês: Junho - Estações: Outono e Inverno");
                break;
            case 7:
                 System.out.println("Mês: Julho - Estação: Inverno");
                break;
            case 8:
                System.out.println("Mês: Agosto - Estação: Inverno");
                break;
            case 9:
                System.out.println("Mês: Setembro - Estações: Inverno e Primavera");
                break;
            case 10:
                System.out.println("Mês: Outubro - Estação: Primavera");
                break;
            case 11:
                System.out.println("Mês: Novembro - Estação: Primavera");
                break;
            case 12:
                System.out.println("Mês: Dezembro - Estações: Primavera e Verão");
                break;
            default: System.out.print("Tente novamente.");
        }
    }
}