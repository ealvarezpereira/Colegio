/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author quique
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Codifica un programa y haz el correspondiente diagrama de clases de la siguiente manera
        //1.- Tenemos una clase estudiante con los atributos nombre, direccion, nombrecolegio y nivel
        //2.- Tenemos una clase profesor con nombre, direccion y materia
        //3.- Tenemos una clase erasmus con nombre, direccion, nombrecolegio, nivel y pais
        //En cada clase debe llevar constructor, getters y seterrs y toString
        //En la clase principal crea un objeto de tipo estudiante, profesor y erasmus y visualiza todos los atributos
        //Cambia el nivel al estudiante y cambiale la materia al profesor
        
        Estudiante estudiante1 = new Estudiante("Reno","Calle falsa 123","Cuspedrinos",1);
        System.out.println("Estudiante ->>  "+estudiante1.toString());
        
        Erasmus erasmus1 = new Erasmus ("Alce","Calle verdadera 123","Reboleiros",2,"España la Vieja");        
        System.out.println("Erasmus ->>  "+erasmus1.toString());
        
        Profesor profesor1= new Profesor ("Ganso","Calle sin más 123","Nihilismo Existencial");      
        System.out.println("Profesor ->>  "+profesor1.toString());
    }
    
}
