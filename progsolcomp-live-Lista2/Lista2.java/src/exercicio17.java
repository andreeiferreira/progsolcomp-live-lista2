/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)

* Data: 15/05/2023
*/
public class exercicio17 {
    public static void main(String[] args) {
        int numero = -7;
        
        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero > -1000);
        
    }
}