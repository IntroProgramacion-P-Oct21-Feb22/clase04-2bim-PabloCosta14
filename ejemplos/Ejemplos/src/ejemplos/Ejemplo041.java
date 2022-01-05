/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int primerValor;
        int segundoValor;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el primer valor");
        primerValor = entrada.nextInt();
        System.out.println("Ingrese el primer valor");
        segundoValor = entrada.nextInt();

        obtenerMultiplicacion(primerValor, segundoValor); // se invoca al método (procedimiento) obtenerSuma

    }

    public static void obtenerMultiplicacion(int a, int b) {
        int mul;
        mul = a * b;
        System.out.printf("El valor de la multiplicacion es: %d\n", mul);

    }

}
