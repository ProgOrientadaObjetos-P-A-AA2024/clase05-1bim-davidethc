
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo4 {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion[] calificaciones = new Calificacion[2];
        Profesor profesor1 = new Profesor("Franco", "nombramiento");
        Profesor profesor2 = new Profesor("Richard", "nombramiento");
        Calificacion c = new Calificacion(10, "Computación",profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica",profesor2);

        calificaciones[0] = c;
        calificaciones[1] = c2;

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor (%s-%s)\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), objetoCalificacion.obtenerProfesor().obtenerNombre(),objetoCalificacion.obtenerProfesor().obtenerTipo());
            //Se esta llamando a un objeto y dentro de ese objeto tengo otro el cual tambien se llama pero se le da los parametros dentro del primero
           ;
        }

    }
}
