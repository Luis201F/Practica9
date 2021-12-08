/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_9;


/**
 *
 * @author Luis
 */
public class Alumnos{
     String nombre;
   String matricula;
    float calificaciones[]=new float[7];
    float prom;

    public Alumnos(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void promedio(){
        prom=0;
        for(int i=0;i<calificaciones.length;i++){
            prom+=calificaciones[i];
        }
        prom/=calificaciones.length;
    }
    public void imprimirDatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Matricula:"+matricula);
        System.out.println("Calificaciones: ");
        for(int i=0;i<calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("Promedio: " + prom);
        
    }
}
