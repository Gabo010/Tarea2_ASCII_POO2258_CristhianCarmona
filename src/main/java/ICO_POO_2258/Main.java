package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = "Introduce una cadena: ";
        System.out.println(frase);

        Scanner teclado = new Scanner (System. in);
        String cadena = teclado.nextLine();

        char uno = cadena.charAt(0);
        int dec1 = (int) uno;
        char dos = cadena.charAt(1);
        int dec2 = (int) dos;
        char tres = cadena.charAt(2);
        int dec3 = (int) tres;


        if ((dec1+1==dec2) && (dec2+1==dec3)){
            System.out.println("la cadena " +cadena +" SI es secuencial");
        }
        else {
            System.out.println("La cadena " +cadena+ " NO es secuencial");
        }
    }

}