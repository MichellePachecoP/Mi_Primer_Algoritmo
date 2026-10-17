package com.mycompany.miprimeralgoritmo;
import java.util.Scanner;

public class MiPrimerAlgoritmo {

    /**public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Ingrese un primer dato");
        int valor1 = valor.nextInt();
        
        System.out.println("Ingrese un segundo dato");
        int valor2 = valor.nextInt();
        
        int resultado = valor1 + valor2;
        
        System.out.println("El resultado de la suma entre " + valor1 + " y " + valor2 + " es " + resultado);
    }
} **/
    /**public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Bienvenido al Teatro Moro");
        System.out.println("A continuacion, se presentan los precios por entrada:");
        int preferencial = 4000;
        int regular = 5000;
        System.out.println("Entrada regular = $" + regular);
        System.out.println("Entrada preferencial = $" + preferencial);
        
        System.out.println("Favor, indique la cantidad de entradas regulares que necesita");
        int eregular = valor.nextInt();
        System.out.println("Favor, indique la cantidad de entradas preferenciales que necesita");
        int epreferencial = valor.nextInt();
        
        int rregular = regular * eregular;
        int rpreferencial = preferencial * epreferencial;
        int resultado = rregular + rpreferencial;
        System.out.println("El valor a pagar es de = $" + resultado);
    }
} **/
    
    /**public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al Teatro Moro");
        
        System.out.println("Favor, ingrese la cantidad de asientos vendidos: ");
        int asientosvendidos = entrada.nextInt();
        
        int asientos = 325;
        double porcentaje = asientosvendidos * 100.0 / asientos;
        
        System.out.println("El porcentaje de asientos vendidos es: " + porcentaje + "%");
    }
}**/
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al Teatro Moro");
        
        System.out.println("Favor, ingrese la cantidad de asientos que desea: ");
        int asientos = entrada.nextInt();
        
        if (asientos % 2 == 0) {
            System.out.println("La cantidad de asientos que usted desea corresponden a un numero par.");
        } else { 
            System.out.println("La cantidad de asientos que usted desea corresponden a un numero impar.");
        }
    }
}
                