package Guia5;

//import java.util.Random;
import java.util.Scanner;

/**
  Recorrer un vector de N enteros contabilizando cuántos números son de 1
  dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {

//    public static void main(String[] args) {
//        Random random = new Random();
//
//        int[] vec = new int[10];
//        //LLENAR VECTOR
//        for (int i = 0; i < vec.length; i++) {
//            vec[i] = random.nextInt(10000 - 1 + 1);
//        }
//        //MOSTRAR VECTOR
//        for (int i = 0; i < vec.length; i++) {
//            System.out.print(vec[i] + " - ");
//        }
//        // CUANTOS DE 1, 2, 3, 4, 5 DIGITOS
//        String numApalabra;
//        int unDigt = 0;
//        int dosDigt = 0;
//        int tresDigt = 0;
//        int cuatroDigt = 0;
//        int cincoDigt = 0;
//        for (int i = 0; i < vec.length; i++) {
//            numApalabra = String.valueOf(vec[i]);
//            switch (numApalabra.length()) {
//                case 1:
//                    unDigt++;
//                    break;
//                case 2:
//                    dosDigt += 1;
//                    break;
//                case 3:
//                    tresDigt += 1;
//                    break;
//                case 4:
//                    cuatroDigt += 1;
//                    break;
//                case 5:
//                    cincoDigt += 1;
//                    break;
//            }
//        }
//        System.out.println("");
//        System.out.println("Un Digito: " + unDigt);
//        System.out.println("dos Digito: " + dosDigt);
//        System.out.println("tres Digito: " + tresDigt);
//        System.out.println("cuatro Digito: " + cuatroDigt);
//        System.out.println("cinco Digito: " + cincoDigt);
//    }
//}

public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        int cont = 0;
        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()* 20000);
        }    
        for (int i = 0; i < vector.length; i++) {
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                cont++;
            }
            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
            cont = 0;
        }
        System.out.println("Hay " + cont1 + " numeros con 1 digito");
        System.out.println("Hay " + cont2 + " numeros con 2 digito");
        System.out.println("Hay " + cont3 + " numeros con 3 digito");
        System.out.println("Hay " + cont4 + " numeros con 4 digito");
        System.out.println("Hay " + cont5 + " numeros con 5 digito");
    }
 }