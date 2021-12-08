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
public class Main {
       public static void main(String[] args) {

        Leer lec = new Leer();
        Alumnos alumno[] = new Alumnos[3];
        Escribir crearArchivo=new Escribir();
        lec.leer();
        int a = 0;

        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumnos(CapturaEntrada.capturarCadena("Ingresa el nombre "), CapturaEntrada.capturarCadena("Ingresa la matricula"));
            for (int j = 0; j < 7; j++) {
                alumno[i].calificaciones[j] = lec.calificaciones[a];
                alumno[i].promedio();
                a++;
            }

        }
        for (int i = 0; i < alumno.length; i++) {
            alumno[i].imprimirDatos();
        }

        crearArchivo.escribirA(alumno);

    }
}