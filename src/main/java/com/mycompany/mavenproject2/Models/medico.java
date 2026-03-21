/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Models;

/**
 *
 * @author ESTUDIANTE
 */
public class medico extends Persona{
    private String especialidad;
    private String tarjetaProfesional;

    public medico(String especialidad, String tarjetaProfesional, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public medico(String especialidad, String tarjetaProfesional) {
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public medico() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
   public void atender(consulta c){
       
   }

    @Override
    public String toString() {
        return "medico{" + "especialidad=" + especialidad + ", tarjetaProfesional=" + tarjetaProfesional + '}';
    }
   
   
}
