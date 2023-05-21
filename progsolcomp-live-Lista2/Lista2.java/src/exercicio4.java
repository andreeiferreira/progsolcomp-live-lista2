/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo. 
* Data: 14/05/2023
*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();
            

            
            if (numero % 2 == 0) {
                System.out.print("O número é par ");
            } else {
                System.out.print("O número é ímpar ");
            }
            
            if (numero >= 0) {
                System.out.print("e positivo.");
            } else {
                System.out.print("e negativo.");
            }
        }
    }
}