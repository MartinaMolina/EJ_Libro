
package Principal;

import Biblioteca.Libro;
import Servicio.LibroService;

public class MainLibro {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        
        libro1.pedirDatos();
        
        System.out.println(libro1.mostrarDatos());
        
        
//        LibroService libroServ = new LibroService();
//        
//        Libro nuevoLibro = libroServ.diseñoLibro();
//        
//        System.out.println(nuevoLibro);
    }
    
}
