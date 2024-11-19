/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.Taller1;

/**
 *
 * @author JESUS DAVID
 */

public class MAIN {
    public static void main(String[] args){
        
        
        System.out.println("JESUS DAVID CAMPO YUNES");
        System.out.println("7502410028");
        System.out.println("************************");
       
  
    }
    //ejercicio final
    
    class Libro {
        String titulo;
        String fecha;        
        
   
    public Libro(String titulo, String fecha){
        
        this.titulo = titulo;
        this.fecha = fecha;       
    }
        
    @Override
    public String toString(){
        
      return "Libro{" + "titulo='" + titulo +", fecha='" + fecha +
                '}';
    
    
    }
    {
     
        
        class Estudiante {
            
           String nombre; 
           String edad;
           
           public Estudiante (String nombre, String edad){
               
               this.edad = edad;
               this.nombre = nombre;
               
               
           }
           @Override
           public String toString(){
               
               return "Estudiante{" + "nombre='" + nombre + "edad='" + edad + '}';
     
           }
           
           
           class CuentaBancaria {
               
              String tipoCuenta; 
              String saldo; 
              
              public CuentaBancaria (String tipoCuenta, String saldo){
                  this.saldo = saldo;
              this.tipoCuenta = tipoCuenta;
                      
           }
              
              @Override
              public String toString(){
                  
                 return "CuentaBancaria{" + "tipoCuenta='" + tipoCuenta + "saldo='" + saldo + "}"; 
                  
              }
              
        }
        
        
    }}{
        
    }}
    
    }
    
    
    