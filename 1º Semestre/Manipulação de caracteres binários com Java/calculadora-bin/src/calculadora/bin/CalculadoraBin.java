//Utilizando o Scanner do Java, receber um número decimal e o transforme para binário
package calculadora.bin;
import java.util.Scanner;

public class CalculadoraBin {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o número a ser tranformado para binário: ");
        int num = ler.nextInt();
        int[] resultado = {0,0,0,0,0,0,0,0};
        int a;
        for (int i = 7; i >= 0; i--){
            a = num%2;
            num = num/2;
           resultado[i] = a;
        }
        System.out.println("Valor em binário: ");
        for(int resul : resultado){
            System.out.print(resul);
        }
        System.out.println(); //Espaço extra por estética do código
    }
    
}