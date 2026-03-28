/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2.vista;

import com.mycompany.mavenproject2.Models.hospital;
import com.mycompany.mavenproject2.Models.medico;


/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        hospital h1 = new hospital("Clinica Santa Marta","Cartagena");
        
        System.out.println("\\tRegistar consultas");
        h1.registrarConsulta("12-02-2026", "Malestar General", "Gripe", 10);
        h1.registrarConsulta("22-04-2024", "Sarpullido", "Alergias", 25);
        h1.registrarConsulta("03-07-2024", "Fractura", "Fractura de tobillo", 40);
        
        medico m1 = new medico("Cardiologia","12",1,"Mario",32,"1234");
        medico m2 = new medico("Dermatologia","13",2,"Juana",29,"5678");
        
        System.out.println("\n");
        m1.atender(h1);
        m2.atender(h1);
        
        
        m1.presentarse();
        m2.presentarse();
        
        
        m1.setTelefono("9876");
        m2.setTelefono("4678");
        m1.setEdad(22);
        
        System.out.println("\n\tImprimir Objetos directamente");
        System.out.println(m1);
        System.out.println(m2);
    }
}
