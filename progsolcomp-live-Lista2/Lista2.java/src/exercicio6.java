/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data: 14/05/2023
*/

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){
        executarPrograma();
        System.exit(0);
    }
    public static void executarPrograma(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira o nome do aluno:");
        String studentName = userInput.nextLine();
        System.out.println("Insira a nota do aluno:");
        int grade = Integer.parseInt(userInput.nextLine());

        resultado(studentName, grade);
        userInput.close();
    }
    private static void resultado(String studentName, int grade) {
        if(grade == 0 && grade < 50){
            System.out.printf("O conceito de %s é insuficiente, sua nota foi %d.", studentName, grade);
        } else if(grade < 0){
            System.out.printf("Nota inválida. Não utilize números negativos.", studentName, grade); 
        } else if(grade < 65){
            System.out.printf("O conceito de %s é regular, sua nota foi %d.", studentName, grade);
        } else if(grade < 85){
            System.out.printf("O conceito de %s é bom, sua nota foi %d.", studentName, grade);
        } else {
            System.out.printf("O conceito de %s é ótimo, sua nota foi %d.", studentName, grade);
        }
    }
}