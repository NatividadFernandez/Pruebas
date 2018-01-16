/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppersona;

/**
 * Clase que contiene información de una persona 
 *@version 0.0 
 * @author Nati
 */
public class Persona {
  //Atributos
    
    /**
    * Nombre de la persona 
    */
    private String Nombre;
    /**
     * Edad de la persona
     */
    private int Edad;
    /**
     * Sexo de la persona
     */
    private char Sexo;
    
    /**
     * Constructor de la clase Persona
     * @author Mar
     * @param Nombre Nombre de la persona
     * @param Edad Edad de la persona
     */
    
    public Persona(String Nombre, int Edad){
        this.Nombre=Nombre;
        this.Edad=Edad;
        
        
    }
    /**
     * Establece el Nombre de la persona
     * @param Nombre 
     */
    public void setNombre (String Nombre){
        this.Nombre=Nombre;
            
    }
    /**
     * Obtiene el Nombre de la persona
     * @return Nombre de la persona 
     */
    public String getNombre(){
        return Nombre;
    }
    
    public void setEdad (int Edad){
        this.Edad=Edad;
       

    }
   
    public int getEdad (){
        return Edad;
    }
    
    public void setSexo(char Sexo){
        this.Sexo=Sexo;
        
    }
    public char getSexo(){
        return Sexo;
    }
 /**
  * Método para saludar a persona 
  * @return String con saludo
  */
    public String saludo(){
     return "Hola " +getNombre();
 }
}