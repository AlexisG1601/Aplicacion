/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

/**
 *
 * @author LENOVO
 */
public class Principal {
    
    
   public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        var progra = new Asignatura();
        progra.codigo=1;
        progra.costoHora=3;
        progra.hora=160;
        progra.nombre="Programacion Orientada ";
        progra.nombreDocente="Mauricio";
        progra.vigente=true;
        System.out.println(progra.mostrarInformacion());
        
        
        
        System.out.println("---------------Materia 2------");
        
        var calculo = new Asignatura();
        calculo.codigo=2;
        calculo.costoHora=5;
        calculo.hora=160;
        calculo.nombre="Calculo de Varias Variables";
        calculo.nombreDocente="JUan Lopez ";
        calculo.vigente=true;
        System.out.println(progra.mostrarInformacion());
        
        
         System.out.println("---------------Materia 3------");
        
        var electronica = new Asignatura();
        electronica.codigo=3;
        electronica.costoHora=5;
        electronica.hora=200;
        electronica.nombre="Electronica";
        electronica.nombreDocente="Pedro Matute  ";
        electronica.vigente=true;
        System.out.println(progra.mostrarInformacion());
    }
}
