/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppersona;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Nati
 */
public class AppPersona extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AppPersona ap= new AppPersona();
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ap.setSize(400,300);
        ap.setTitle("Saludo de AppPersona");
      
     
       Persona persona1 = new Persona("Manolo", 15);
       ap.add(new JTextField(persona1.saludo()));
       ap.setVisible(true);
       
       /**
        *   System.out.println("Sexo: " +persona1.getSexo());
       persona1.setSexo('H');
       if (persona1.getSexo()=='H')
           System.out.println("Hola chico");
       else 
           System.out.println("Hola chica");
        */
       
       /**
        * System.out.println("Nombre: "+persona1.getNombre()); 
       System.out.println("Edad: "+persona1.getEdad());
       System.out.println("Sexo: "+persona1.getSexo());
       persona1.setNombre("Pepe");
       System.out.println("Nombre: "+persona1.getNombre());
        */
       
       
       
       
       
    }
    
}
