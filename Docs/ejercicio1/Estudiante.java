
package co.edu.udec.s2.Taller1.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Estudiante {
    String Nombre;
    String edad;
    String curso;
    
    public Estudiante (){
        
     this.Nombre = "Nombre del estudiante";  
     this.curso = "curso establecido";   
     this.edad = "edad del estudiante";

    }
    
    public Estudiante (String curso){
        
       this.curso = curso; 
    }
           
    
    
    public Estudiante (String nombre, String edad, String curso){
      this(curso);  
      this.Nombre = nombre;
      this.edad = edad;
      
        
    }
           
    

    
    
    
}
