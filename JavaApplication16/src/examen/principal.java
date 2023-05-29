/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author oscar
 */
public class principal {

    String matricula;
    String nombre;
    String correo;
    
    public void author62291(){
        matricula = "62291";
        nombre = "Oscar Omar Quijano Cruz"; 
        correo = "al062291@uacam.mx";        
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo electronico: " + correo );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        principal princ = new principal();
        princ.author62291();
    }
    
}
