/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Models;

import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class hospital {
    private String nombre;
    private String ciudad;
    private List<consulta>consulta;

    public hospital(String nombre, String ciudad, List<consulta> consulta) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consulta = consulta;
    }

    public hospital() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<consulta> getConsulta() {
        return consulta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setConsulta(List<consulta> consulta) {
        this.consulta = consulta;
    }
    
}
