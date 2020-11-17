package unidad3_pilas_tarea;

import java.util.Scanner;

public class Unidad3_Pilas_Tarea {

    public static void main(String[] args) {
        Scanner V = new Scanner(System.in);
        Pila p = new Pila();
        boolean salir = false;
        int dato;
        do {
            salir = false;
            System.out.println(
                    "Metodo de una pila"
                    + "\n[1]insertar"
                    + "\n[2]sacar"
                    + "\n[3]mostrar cima"
                    + "\n[4]generar numeros random"
                    + "\n[5]vacia pila"
                    + "\n[6]mostrar si la pila esta vacia"
                    + "\n[7]mostrar pila"
                    + "\n[8]Mostrar tamaño de la pila"
                    + "\n[9]salir");
            int opc = V.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un numero");
                    dato = V.nextInt();
                    p.push(dato);
                    break;
                case 2:
                    if (!p.isEmpty()) {
                        System.out.println("Numero elimidado: " + p.pop());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 3:
                    if (!p.isEmpty()) {
                        System.out.println("Ultimo numero agregado: " + p.peek());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4:
                    p.Random();
                    System.out.println("Numeros random generados");
                    break;
                case 5:
                    p.Empty();
                    break;
                case 6:
                    if (p.isEmpty()) {
                        System.out.println("La pila esta vacia");
                    } else {
                        System.out.println("La pila tiene " + p.size());
                    }
                    break;
                case 7:
                    if (!p.isEmpty()) {
                        p.Mostrar();
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 8:
                    System.out.println("Tamaño de la pila: " + p.size());
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("");
        } while (!salir);

    }

}
