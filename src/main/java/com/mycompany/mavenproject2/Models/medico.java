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
    private int consultorio;

    public medico(String especialidad, String tarjetaProfesional, int consultorio, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
        this.consultorio = consultorio;
    }

    public medico(String especialidad, String tarjetaProfesional, int consultorio) {
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
        this.consultorio = consultorio;
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
    
   public void atender(hospital h1){
       if(h1.getConsulta().isEmpty())   {
           System.out.println("No hay consultas disponibles");
       }else    {
           System.out.println("El medico " +this.getNombre() + " esta ocupado atendiendo la consulta en el consultorio "+this.getConsultorio());
       }
   }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }
    
    public void presentarse()   {
        System.out.println("\n\tPresentacion");
        System.out.println("Nombre "+this.getNombre());
        System.out.println("Edad "+this.getEdad());
        System.out.println("Cedula "+this.getCedula());
        System.out.println("Especialidad "+this.getEspecialidad());
        System.out.println("Tarjeta Profesional "+this.getEspecialidad());
        System.out.println("Consultorio "+this.getConsultorio());
    }

    @Override
    public String toString() {
        return "medico{" + "especialidad=" + especialidad + ", tarjetaProfesional=" + tarjetaProfesional + ", consultorio=" + consultorio + '}';
    }

  
   

}
