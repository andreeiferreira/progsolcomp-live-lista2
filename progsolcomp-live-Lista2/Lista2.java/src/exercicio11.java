/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que imprima todos os números pares de 1
a 100 na ordem inversa
* Data: 14/05/2023
*/
public class exercicio11 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}