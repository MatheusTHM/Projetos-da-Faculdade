//Receba uma letra e a coloque em maiúsculo e em minúsculo usando AND e OR
package letra;
import java.util.Scanner;

public class Letra {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a letra a ser modificada: ");
        int c;
        int minusculo = 32;
        int maiusculo = 223;
        c = ler.next().charAt(0);
        char letra_minuscula = (char) (c | minusculo);
        char letra_maiuscula = (char) (letra_minuscula & maiusculo);
        System.out.println("Letra minúscula: "+letra_minuscula);
        System.out.println("Letra maiúscula: "+letra_maiuscula);
    }
    
}
