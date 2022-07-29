package org.catsharks.backend.application.utils;

import java.util.Random;
import java.util.Scanner;
/**
 * Utilidades aritmeticas y logicas para el desarrolador.
 */
public class Arithmetic {
    /**
     * Número PI reducido a 8 decimales
     */
    public static final double PI = 3.14159265;
    /**
     * Número E reducido a 6 decimales
     */
    public static final double E = 2.71828;
    /**
     * Instanciación de la clase Random para sobrescribir sus métodos.
     */
    private static final Random RND = new Random();
    /**
     * Instanciación de Scanner para recibir inputs internos.
     */
    private static final Scanner sc = new Scanner(System.in);
    /**
     * Constructor privado para evitar instanciaciones de la clase {@code Arithmetic}
     */
    private Arithmetic() {}
    /**
     * Método que devuelve si un número es pár.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    /**
     * Método que devuelve si un número es inpár.
     */
    public static boolean isOdd(int value) {
        return !isEven(value);
    }
    /**
     * Método que devuelve el valor absoluto de un valor.
     */
    public static int abs(int value) {
        return value < 0 ? -value : value;
    }
    /**
     * Método que devuelve la media de una serio de argumentos.
     */
    public static double avg(double... ops) {
        var sum = 0;
        for (var op : ops) {
            sum += op;
        }
        return sum / ops.length;
    }
    /**
     * Método que devuelve el valor maximo de una serio de argumentos.
     */
    public static int max(int... ops) {
        var value = Integer.MIN_VALUE;
        for (var op : ops) {
            if (value < op) {
                value = op;
            }
        }
        return value;
    }
    /**
     * Método que devuelve el valor mínimo de una serio de argumentos.
     */
    public static int min(int... ops) {
        //Integer.MAX_VALUE;
        int value = max(ops);
        for (var op : ops) {
            if (value > op) {
                value = op;
            }
        }
        return value;
    }
    /**
     * Método que devuelve el valor máximo de una serio de argumentos.
     */
    public static double maxim(double op1, double op2, double... ops) {
        var max = (op1 >= op2) ? op1 : op2;
        for (var op : ops) {
            max = (op >= max) ? op : max;
        }
        return max;
    }
    /**
     * Método que devuelve el valor mínimo de una serio de argumentos.
     */
    public static double minim(double op1, double op2, double... ops) {
        var min = (op1 <= op2) ? op1 : op2;
        for (var op : ops) {
            min = (op <= min) ? op : min;
        }
        return min;
    }
    /**
     * Método que devuelve un número entero entre 0 y el valor del argumento.
     */
    public static int nextInt(int bound) {
        return RND.nextInt(bound + 1);
    }
    /**
     * Método que valida números enteros.
     */
    public static int valInt(String msg, Integer ini, Integer fin) {
        int number;
        if (fin == null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number < ini);
        } else if (ini == null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number > fin);
        } else if (ini != null && fin != null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number < ini || number > fin);
        } else {
            System.out.println(msg);
            number = sc.nextInt();
        }
        return number;
    }
    /**
     * Método que devuelve true si el valor es validado por la condición.
     */
    public static boolean valInt(int value, Integer min, Integer max){
        boolean aux = true;
        if (max == null && value > min) {
            aux = true;
        } else if (min == null && value > max) {
            aux = true;
        } else if (max == null && value < min) {
            aux = false;
        } else if (min == null && value < max){
            aux = false;
        }
        return aux;
    }
    /**
     * Método que ordena un *array de enteros DES.
     */
    public static int[] orderDes(int[] number) {
        int i, j, aux;
        for (i = 0; i < number.length; i++) {
            for (j = i + 1; j < number.length; j++) {
                if (number[j] > number[i]) {
                    aux = number[i];
                    number[i] = number[j];
                    number[j] = aux;
                }
            }
        }
        return number;
    }
    /**
     * Método que ordena un *array de enteros ASC.
     */
    public static int[] orderAsc(int[] number) {
        int i, j, aux;
        for (i = 0; i < number.length; i++) {
            for (j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    aux = number[i];
                    number[i] = number[j];
                    number[j] = aux;
                }
            }
        }
        return number;
    }
    /**
     * Método que devuelve un número entero entre 0 y el valor del argumento.
     */
    public static boolean findInt(int[] number, int aux2) {
        int i;
        boolean trobat = false;
        for (i = 0; (i < number.length) && (!trobat); i++) {
            if (number[i] == aux2) {
                trobat = true;
            }
        }
        return trobat;
    }
    /**
     * Método printa por consola un array.
     */
    public static void showArray(int[] number) {
        int i;
        System.out.print("[");
        for (i = 0; i < number.length; i++) {
            if(i % 10 == 0 && i != 0){
                System.out.print("\n");
            }
            if (i != number.length - 1) {
                System.out.printf("%d, ", number[i]);
            } else {
                System.out.printf("%d", number[i]);
            }
        }
        System.out.println("]");
    }
    /**
     * Métode que retorna un array ompler de nombres naturals aleatoris d'un rang.
     */
    public static int[] fillArray(int[] number, int rnd) {
        int i;
        for (i = 0; i < number.length; i++) {
            number[i] = nextInt(rnd);
        }
        return number;
    }
}
