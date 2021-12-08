/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Luis
 */
public class Leer {
    public int calificaciones[]=new int [21];

    public void leer (){
        Path filePath = Paths.get("C:\\Users\\Luis\\Desktop\\Semestre4\\POO\\Lab\\practica9.csv"); //Archivo a leer
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosDeLinea = linea.split(",");
                datosDeLinea[0] = String.valueOf(datosDeLinea[0].charAt(1)) + String.valueOf(datosDeLinea[0].charAt(2));
              //Se iran guardando las calificaciones
                for (int i = 0; i < datosDeLinea.length; i++) {
                    calificaciones[i] = Integer.parseInt(datosDeLinea[i]);
                }
                //datos.add(datosTemporal);
            }

        } catch(FileNotFoundException ex){  //Si no se encuentra el archivo nos saldra el mensaje de error
            System.out.println("Error el archivo no fue encontrado" + ex);

        } catch(IOException e){
            System.out.println("Error" + e);
        }
   
        }
    }
