package org.semana02.modelos;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionLibros {

    private ArrayList<Libro> libros;

    public ColeccionLibros() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    // Crea los métodos solicitados en el enunciado del ejercicio

    //1. Obtener la cantidad de libros con más de 500 páginas
    public int cantidadLibrosMas500Paginas() {
        return 0;
    }

    //2. Obtener la cantidad de libros con menos de 300 páginas
    public int cantidadLibrosMenos300Paginas() {
        return 0;
    }

    //3. Listar el título de todos aquellos libros con más de 500 páginas.
    public ArrayList<String> listarLibrosMas500Paginas() {
        return null;
    }

    //4. Obtener el título de los 3 libros con mayor número de páginas.
    public ArrayList<String> listarTresLibrosMasPaginas() {
        return null;
    }


    //5. Obtener la suma total de las páginas de todos los libros.
    public int sumaTotalPaginas() {
        return 0;
    }

    //6. Obtener todos aquellos libros que superen el promedio en cuanto a número de páginas se refiere.
    public ArrayList<Libro> listarLibrosMasPaginasPromedio() {
        return null;
    }

    //7. Obtener los autores de todos los libros, sin repetir nombres de autores.
    public ArrayList<String> listarAutores() {
        return null;
    }

    //8. Obtener el libro con mayor número de páginas.
    public Libro libroMasPaginas() {
        return null;
    }

    //9. Obtener una colección con todos los títulos de los libros.
    public ArrayList<String> listarTitulos() {
        return null;
    }

    //10. Obtener los autores que tengan más de 1 libro listado.
    public ArrayList<String> listarAutoresConMasDeUnLibro() {
        return null;
    }
}