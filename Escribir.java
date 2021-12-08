/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_9;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luis
 */

public class Escribir {

    FileWriter flwriter = null;
        Alumnos alm[]=new Alumnos[3];

        public void escribirA(Alumnos[] alumno){
            try {
                //crea el flujo para escribir en el archivo
                flwriter = new FileWriter("C:\\Users\\Luis\\Desktop\\Semestre4\\POO\\Lab\\Alumno.txt");
                //Se crea un buffer antes de que escribamos en el archivo
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i=0; i<alumno.length;i++) {
                    bfwriter.write( "\n Nombre: "+alumno[i].nombre + "\n" +"  Matricula: "+alumno[i].matricula+"\n"+"Promedio: "+alumno[i].prom+"\n");
                    for (int j=0; j<7;j++) {
                        bfwriter.write("\n"+alumno[i].calificaciones[j]);
                    }
                }
                //Se cierra el bufer
                bfwriter.close();
                System.out.println("El archivo se creo correctamente");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (flwriter != null) {
                    try {//cerramos el flujo
                        flwriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }