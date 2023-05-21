/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa:Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50
* Data: 14/05/2023
*/
public class exercicio14 {
    public static void main(String[] args) {
        int[] vet = new int[50];

        for(int i = 0; i < 50; i++){
            vet[i] = 0;
        }

        for(int i = 0; i < 50; i++){
            System.out.print(vet[i] + " ");
        }
    }
}