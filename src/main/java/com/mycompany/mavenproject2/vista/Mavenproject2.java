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
        
        h1.registrarConsulta("12-02-2026", "Malestar General", "Gripe", 10);
        h1.registrarConsulta("22-04-2024", "Sarpullido", "Alergias", 25);
        h1.registrarConsulta("03-07-2024", "Fractura", "Fractura de tobillo", 40);
        
        medico m1 = new medico("Cardiologia","12",1,"Mario",32,"1234");
        medico m2 = new medico("Dermatologia","13",2,"Juana",29,"5678");
        
        m1.atender(h1);
        m2.atender(h1);
    }
}
