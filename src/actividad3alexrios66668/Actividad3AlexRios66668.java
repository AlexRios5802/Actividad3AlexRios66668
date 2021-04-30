package actividad3alexrios66668;

import java.util.Scanner;

public class Actividad3AlexRios66668 {

    public static void Datos() {
        System.out.println("Alex Omar Ríos Pérez");
        System.out.println("Matricula: 66668");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Capus V");
    }

    public static void space() {
        System.out.println(" ");
    }

    public static void frontera() {

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

    }

    public static void Actividad3_1() {

        System.out.println("Actividad 3.1 // Suma consecutiva del 0 al 10");

        int valor1 = 10;
        int nume = 0;
        int suma = 0;

        for (int i = valor1; i >= 0; i--) {
            suma = suma + nume;
            nume++;
        }
        System.out.println("La suma de los numeros consecutivos de: " + valor1 + " es " + suma);

    }

    public static void Actividad3_2() {

        System.out.println("Actividad 3.2 // Calcular el factorial de 10");

        int factorial = 1;
        int numero = 10;

        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + "  es: " + factorial);

    }

    public static void Actividad3_3() {

        System.out.println("Actividad 3.3 // Factorial de un numero introducido por el usuario");

        int numero2 = 0;
        System.out.println("Ingrese el numero de su factorial");
        Scanner fac = new Scanner(System.in);
        numero2 = fac.nextInt();

        int factorial2 = 1;

        for (int i = numero2; i > 0; i--) {
            factorial2 = factorial2 * i;
        }
        System.out.println("El factorial de " + numero2 + "  es: " + factorial2);
    }

    public static void Actividad3_4() {

        System.out.println("Actividad 3.4 // Calcular la media del 0 al numero que el usuario ingrese ");

        System.out.println("Ingresa tu valor");
        Scanner leer = new Scanner(System.in);
        int valor2 = leer.nextInt();

        int nume = 0;
        int suma = 0;

        for (int i = valor2; i >= 0; i--) {
            suma = suma + nume;
            nume++;
        }
        double media = suma / valor2;
        System.out.println("la media es:" + media);
    }

    public static void Actividad3_5() {

        System.out.println("Actividad 3.5 // Sacar el promedio, cual es el más grande y cuanto es la diferencia de la que se llevan");

        System.out.println("Ingresa la cantidad de numeros, ingresa los valores, sacar promedio, cual es mayor y el menor  de ellos ");

        int valor3 = 0;
        int valor4 = 0;

        System.out.print("Ingresa el primer valor: ");
        Scanner ingre = new Scanner(System.in);
        valor3 = ingre.nextInt();

        System.out.print("Ingresa el primer valor: ");
        Scanner ingre2 = new Scanner(System.in);
        valor4 = ingre2.nextInt();

        double prom = (valor3 + valor4) / 2;
        int vs = valor3 - valor4;
        int vs2 = valor4 - valor3;

        System.out.println("El promedio de " + valor3 + " y " + valor4 + " es " + prom);
        if (valor3 > valor4) {
            System.out.println(valor3 + " es mayor que " + valor4);
            System.out.println("Por lo tanto " + valor4 + " es menor que " + valor3);
            System.out.println("La cantidad de unidades que se llevan es de: " + vs);
        }
        if (valor4 > valor3) {
            System.out.println(valor4 + " es mayor que " + valor3);
            System.out.println("Por lo tanto " + valor3 + " es menor que " + valor4);
            System.out.println("La cantidad de unidades que se llevan es de: " + vs2);
        }
        if (valor3 == valor4) {
            System.out.println(valor3 + " y " + valor4 + " son iguales");
            System.out.println("Por lo tanto ninguno es mayor ni menor que el otro ");
            System.out.println("La cantidad de unidades que se llevan es cero ");
        }
    }

    public static void Actividad3_6() {

        System.out.println("Actividad3.6 // Imprir los dias de la semana por medio de Array");

        String dias[] = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";

        for (int i = 0; i < 7; i++) {
            System.out.println(dias[i]);
        }
    }

    public static void Actividad3_7() {

        System.out.println("Actividad 3.7 // Imprimir los nombre de los personajes de Star Wars por medio de matrices");

        String aPersonajes[][] = new String[16][3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male";

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("/" + aPersonajes[i][j]);
            }
        }
    }

    public static void Actividad3_8() {

        String Gato[][] = new String[3][3];
        Gato[0][0] = "X";
        Gato[0][1] = " ";
        Gato[0][2] = " ";
        Gato[1][0] = "O";
        Gato[1][1] = "X";
        Gato[1][2] = " ";
        Gato[2][0] = "O";
        Gato[2][1] = "O";
        Gato[2][2] = "X";

        for (int i = 0; i < 3; i++) {
            System.out.println("│" + Gato[i][0] + "│" + Gato[i][1] + "│" + Gato[i][2] + "│");
        }
    }

    public static void main(String[] args) {

        int tarea = 0;
        System.out.println("Para ver las actividades, ingrese un número que esté entre el 1 hasta el 8");
        Scanner elegir = new Scanner(System.in);
        tarea = elegir.nextInt();

        if (tarea >= 1 && tarea <= 8) {
            switch (tarea) {
                case 1:
                    Actividad3_1();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 2:
                    Actividad3_2();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 3:
                    Actividad3_3();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 4:
                    Actividad3_4();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 5:
                    Actividad3_5();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 6:
                    Actividad3_6();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 7:
                    Actividad3_7();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                case 8:
                    Actividad3_8();
                    space();
                    Datos();
                    space();
                    frontera();
                    space();
                    break;
                default:
                    System.out.println("Este numero no está en el rango establecido");
            }
        }
    }
}
