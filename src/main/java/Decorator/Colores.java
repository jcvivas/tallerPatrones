/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import Builder.Informe;

/**
 *
 * @author USUARIO
 */
public class Colores extends Decorador{
    public Colores(Informe docEditado) {
        super(docEditado);
    }
    @Override
    public void personalizeInforme() {
       docEditado.personalizeInforme();
        System.out.println(" Estilo cambiado");
    }
}
