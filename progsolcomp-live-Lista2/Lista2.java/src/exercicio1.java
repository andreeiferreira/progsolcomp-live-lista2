/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior
deles.
* Data: 14/05/2023
*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        try (Scanner imput = new Scanner(System.in)) {
            System.out.print("Digite o valor de A: ");
            int a = imput.nextInt();
            
            System.out.print("Digite o valor de B: ");
            int b = imput.nextInt();
            
            if (a > b) {
               System.out.println("O maior número é: " + a);
            } else if(b > a){
                System.out.println("O maior número é: " + b);
            }else {
                System.out.println("Os números são iguais");
            }
        }
        
    }
}