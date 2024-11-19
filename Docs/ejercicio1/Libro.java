/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.Taller1.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Libro {
   
    String titulo;
    String autor;
    String NumeroPaginas;       
    
    public Libro() {
     
        this.titulo = "titulo establecido";
        this.autor = "autor establecido";
        this.NumeroPaginas = "150";
        
    }
    
    public Libro(String titulo, String autor, int NumeroPaginas){
        
        System.out.println("titulo:"+ this.titulo);
        System.out.println("autor:"+ this.autor);
        System.out.println("Numero de paginas:"+ this.NumeroPaginas);
    }
    
    
}
