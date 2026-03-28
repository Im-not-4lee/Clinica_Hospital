/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Models;

/**
 *
 * @author ESTUDIANTE
 */
public class consulta {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private int duracionMinutos;

    public consulta(String fecha, String motivo, String diagnostico, int duracionMinutos) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.duracionMinutos = duracionMinutos;
    }
    
    public consulta() {
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "consulta{" + "fecha=" + fecha + ", motivo=" + motivo + ", diagnostico=" + diagnostico + ", duracionMinutos=" + duracionMinutos + '}';
    }
    
    
    
}
