/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Um determinado gás duplica seu volume a cada segundo.
Dada um volume inicial, em centímetros cúbicos, digitado pelo
usuário faça um programa que determine o tempo necessário para
que esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data: 15/05/2023
*/
import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o volume inicial em centímetros cúbicos: ");
            int volumeInicial = scanner.nextInt();

            int volumeAtual = volumeInicial;
            int tempo = 0;

            while (volumeAtual <= 1000) {
                volumeAtual *= 2;
                tempo++;
            }

            System.out.println("O volume atingirá mais de 1000 cm³ após " + tempo + " segundos.");
        }
        
    }
}