/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7% 
* Data: 14/05/2023
*/
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        executarPrograma();
        System.exit(0);
    }

    public static void executarPrograma(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira o valor da venda?");
        double valorVenda = Double.parseDouble(userInput.nextLine());
        System.out.println("Escolha as condições de pagamento no menu abaixo (selecione inserindo os números ao lado esquerdo da forma de pagamento):\n[1] - Venda a Vista - desconto de 10%\n[2] - Venda a Prazo 30 dias - desconto de 5%\n[3] - Venda a Prazo 60 dias - mesmo preço\n[4] - Venda a Prazo 90 dias - acréscimo de 5%\n[5] - Venda com cartão de débito - desconto de 8%\n[6] - Venda com cartão de crédito - desconto de 7%");
        int condPagamento = Integer.parseInt(userInput.nextLine());
        userInput.close();
        
        valorParaPagar(valorVenda, condPagamento);
    }

    private static void valorParaPagar(double valorVenda, int condPagamento) {
        switch(condPagamento){
            case 1:
                valorVenda = valorVenda * 0.90;
                System.out.printf("O valor a ser pago é: R$ %.00f", valorVenda);
                break;
            case 2:
                valorVenda = valorVenda * 0.95;
                System.out.printf("O valor a ser pago é: R$  %.00f", valorVenda);
                break;
            case 3:
                System.out.printf("O valor a ser pago é: R$  %.00f", valorVenda);
                break;
            case 4:
                valorVenda = valorVenda * 1.05;
                System.out.printf("O valor a ser pago é: R$  %.00f", valorVenda);
                break;
            case 5:
                valorVenda = valorVenda * 0.92;
                System.out.printf("O valor a ser pago é: R$  %.00f", valorVenda);
                break;
            case 6:
                valorVenda = valorVenda * 0.93;
                System.out.printf("O valor a ser pago é: R$  %.00f", valorVenda);
                break;
        }
    }
}