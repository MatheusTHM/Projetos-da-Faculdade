//Representar o número 32 em Valor decimal e em caracter ASCII
package binario;

public class Binario {
    public static void main(String[] args) {
        char c = 32;
        for(int i = 32; i <= 255; i++){
            System.out.println("Valor decimal: "+i);
            System.out.println("Caracter ASCII: "+c);
            c++;
        }
    }
    
}
