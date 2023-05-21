/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
* Data: 14/05/2023
*/
public class exercicio12 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}