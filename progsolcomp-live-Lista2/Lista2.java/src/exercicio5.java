/* Nome do Aluno: ANDRÊEI FERREIRA PESSOA DA SILVA
* RA: 12723128471
* Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em
* anos, e a naturalidade (cidade de nascimento) de uma pessoa.
* Depois, o programa deve dar a seguinte opção “Deseja
* visualizar dados completos?”. Se o caractere digitado pelo
* usuário for ‘S’ o programa deve imprimir na tela Nome,
* Sobrenome, idade e naturalidade. Se o caractere digitado pelo
* usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
* o caractere não for nenhuma das outras opções acima o programa
* deve imprimir “Digitação errada. Tente Novamente”.
* Data: 14/05/2023
*/
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        executarPrograma();
        System.exit(0);
    }

    public static void executarPrograma(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = userInput.nextLine();
        System.out.println("Qual seu sobrenome?");
        String surname = userInput.nextLine();
        System.out.println("Quantos anos você têm?");
        int age = Integer.parseInt(userInput.nextLine());
        System.out.println("Qual cidade você nasceu?");
        String placeOfBirth = userInput.nextLine();
        System.out.println("Deseja visualizar dados completos? Responda com S ou N:");
        char menuAnswer = userInput.nextLine().charAt(0);
        
        resultado(name, surname, age, placeOfBirth, menuAnswer);
        userInput.close();
    }

    private static void resultado(String name, String surname, int age, String placeOfBirth, char menuAnswer) {
        if(String.valueOf(menuAnswer).equalsIgnoreCase("s")){
            System.out.printf("Seu nome completo é %s %s, você têm %d ano(s) e é natural da(o) %s.", name, surname, age, placeOfBirth);
        } else if(String.valueOf(menuAnswer).equalsIgnoreCase("n")) {
            System.out.printf("Seu nome é %s, você têm %d ano(s).", name, age);
        } else {
            System.out.print("Digitação Errada. Tente novamente.");
        }
    }
}