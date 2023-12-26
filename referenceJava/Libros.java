/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referenceJava;

/**
 *
 * @author cerrchus
 */
public class Libros {
    private String titulo;
    private String autor;
    private String genero;
                             
    private int idDeLibros; // it is best practice to use private variables
                            // wherever possible
    
    
    public Libros(String titulo, String autor, String genero, int idDeLibros){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.idDeLibros = idDeLibros;
    }
    
    public void infoDeLibros(){
        System.out.println("ID de Libro:" +idDeLibros);
        System.out.println("Libro informacion, Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero);
    }
    
    public int getId(){
        return this.idDeLibros;
    }
    
    public void setId(int idDeLibros){
        this.idDeLibros = idDeLibros;
    }
}
