
package Biblioteca;

import java.util.Scanner;

public class Libro {
    
    // ATRIBUTOS

    private int ISBN, numPags;
    private String Titulo, Autor;
    
    // CONSTRUCTORES

    public Libro() {     // Por defecto
    }

    public Libro(int ISBN, String Titulo, String Autor, int numPags) {  // Con parametros
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPags = numPags;
    }

    // SETTERS
    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    // GETTERS

    public int getISBN() {
        return ISBN;
    }

    public int getNumPags() {
        return numPags;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }
    
    // METODOS

    public void pedirDatos () {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println("Bienvenido/a, por favor ingrese el titulo del libro ");
        setTitulo(leer.next());
        
        System.out.println("Ahora, ingrese su ISBN ");
        setISBN(leer.nextInt());
        
        System.out.println("A continuacion, ingrese su autor ");
        setAutor(leer.next());
        
        System.out.println("Por ultimo, ingrese la cantidad de paginas que contiene el libro");
        setNumPags(leer.nextInt());
        
    }

    public String mostrarDatos () {
        return "El libro titulado '" + Titulo + "', con ISBN " + ISBN + ", creado por el autor " + Autor + ", contiene " + numPags + " paginas";
    }
    
    
//    @Override
//    public String toString() {
//        return "El libro titulado '" + Titulo + "', con ISBN " + ISBN + ", creado por el autor " + Autor + ", contiene " + numPags + " paginas";
//    }
    
    
}


