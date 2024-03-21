import java.util.Scanner;

public class Lab1{


    // Declaracion de funciones
        // Suma
    public static int suma(int Num1, int Num2){
        return Num1 + Num2;
    }
        // Resta
    public static int resta(int Num1, int Num2){
        return Num1 - Num2;
    }
        // Multiplicacion
    public static int Multiplicacion(int Num1, int Num2){
        return Num1 * Num2;
    }
        // Division
    public static float division(float Num1, float Num2){
        if(Num2 == 0){
            System.out.println("No se puede dividir entre cero");
            return 0;
        }else{
            return Num1 / Num2;
        }
    }
    public static void main(String[] args) {
        // Declaracion de la variable de entrada
        Scanner scanner = new Scanner(System.in);
        // Declaracion de las variables de uso
        int Num1;
        int Num2;
        int selection = 1;
        int op;

        // Inicio de bucle
        do {
            System.out.println("Ingrese el primer valor");
            Num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo valor");
            Num2 = scanner.nextInt();
            System.out.println("Ingrese el numero de la operacion que desea usar");
            System.out.println("1)Suma 2)resta 3)Multiplicacion 4)Division");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    // Llamar a la funcion de suma
                    System.out.println(suma(Num1, Num2));
                    break;
                case 2:
                    // Llamar a la funcion de resta
                    System.out.println(resta(Num1, Num2));
                    break;
                case 3:
                    // Llamar a la funcion de multiplicacion
                    System.out.println(Multiplicacion(Num1, Num2));
                    break;
                case 4:
                    // Llamar a la funcion de division
                    System.out.println(division(Num1, Num2));
                    break;
                default:
                    break;
            }
            System.out.println("Desea volver a usar la calculadora? \n1)Si 2)No");
            selection = scanner.nextInt();
        } while(selection != 2); // Fin del bucle
        scanner.close(); // Esta linea cierra la variable de entrada de datos para evitar filtraciones
    }
}