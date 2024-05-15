
package paquete02;

import java.util.Scanner;
import paquete01.LibretaCalificacion;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "Rene Elizalde";
        double []notas={10,9,8,10};
 LibretaCalificacion libreta = new LibretaCalificacion(nombre,
                notas);
 //si comentoo la linea 17 no llama al metodo por lo tanto no se podra saber su valor 
 libreta.establecerPromedio();
 libreta.establecerPromedioCualitativo();
 System.out.printf("\n%s\n", libreta);
        
 
        
    }
    
}
