/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

/**
 *
 * @author LENOVO
 */
public class Asignatura {
    
    
    int codigo; 
    String nombre;
    int hora;
    String nombreDocente;
    double costoHora;
    boolean vigente;
    
    String mostrarInformacion(){
        var retorno = "La asignacion: " + this.nombre + " el docente " + this.nombreDocente + "la asignatura cuesta: " + this.calcularCosto();
        return retorno; 
    
}
    
    double calcularCosto(){
        var retorno = this.costoHora + this.hora;
        return retorno;
    }
    
}
