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
public abstract class Decorador implements Informe{
    protected Informe docEditado;

    public Decorador(Informe docEditado) {
        this.docEditado = docEditado;
    }
    @Override
    public void personalizeInforme() {
       docEditado.personalizeInforme();
    }
    @Override
    public void saveInforme(){
        docEditado.saveInforme();
    }
    @Override
    public void viasualizeInforme(){
        docEditado.viasualizeInforme();
    }
}
