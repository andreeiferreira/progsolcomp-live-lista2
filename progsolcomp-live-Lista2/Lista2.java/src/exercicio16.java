/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize
while)
* Data: 15/05/2023
*/
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        executarPrograma();
    }

    public static void executarPrograma() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;
        while(userInput >= 0) {
            System.out.println("Insira um número abaixo:");
            userInput = scanner.nextInt();
        }
        scanner.close();
    }   
}