import java.util.Scanner;

import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Bienvenido!");
        System.out.println("");
        System.out.println("Operaciones de calculadora que puede realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División entera");
        System.out.println("5. Potencias");
        System.out.println("Teclee un valor numérico diferente para salir");
        System.out.println("");

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el número de la operación que desea realizar:");
        int menu = scn.nextInt();

        switch (menu){
            case 1:
                if (menu==1){
                    System.out.println("Has seleccionado la operación suma");
                    System.out.println("");
                    System.out.println("Ingrese el valor del primer número a sumar :");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el valor del segundo número a sumar :");
                    int num2 = scn.nextInt();
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma de " +num1 + " y " +num2+ " es : " + suma);
                }
                break;

            case 2:
                if (menu==2){
                    System.out.println("Has seleccionado la operación resta");
                    System.out.println("");
                    System.out.println("Ingrese el valor del primer número a restar :");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el valor del segundo número a restar :");
                    int num2 = scn.nextInt();
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta de " +num1 + " y " +num2+ " es : " + resta);
                }
                break;

            case 3:
                if (menu==3){
                    System.out.println("Has seleccionado la operación multiplicación");
                    System.out.println("");
                    System.out.println("Ingrese el valor del primer número a multiplicar :");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el valor del segundo número a multiplicar :");
                    int num2 = scn.nextInt();
                    int multi = num1 * num2;
                    System.out.println("El resultado de la suma de " +num1 + " y " +num2+ " es : " + multi);
                }
                break;

            case 4:
                if (menu==4){
                    System.out.println("Has seleccionado la operación División entera");
                    System.out.println("");
                    System.out.println("Ingrese el valor del primer número a dividir :");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el valor del segundo número a dividir :");
                    int num2 = scn.nextInt();
                    int divi = (num1/num2);
                    System.out.println("El resultado de la división entera de " +num1 + " y " +num2+ " es : " + divi);
                }
                break;

            case 5:
                if (menu==5){
                    System.out.println("Has seleccionado la operación de potencias");
                    System.out.println("");
                    System.out.println("Ingrese el valor del número :");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el valor de la potencia :");
                    int num2 = scn.nextInt();
                    double poten = Math.pow(num1,num2);
                    System.out.println("El resultado de la potencia de " +num1 + " a la " +num2+ " es : " + poten);
                }
                break;

            default:
                System.out.println("Adiós!! :D");
        }
    }
}