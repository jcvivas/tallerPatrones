/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reportsender;

import Builder.Director;
import Builder.Excel;
import Builder.ExcelBuilder;
import Builder.Informe;
import Decorator.Fuente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author USUARIO
 */
public class ReportMaker {

    public static void main(String[] args) throws FileNotFoundException {
        Director d= Director.getInstance("Director");
        ExcelBuilder ebuilder=new ExcelBuilder();
        d.makeExcelReport(ebuilder);
        Excel excel=ebuilder.getResult();
        Fuente fuente=new Fuente(excel);
        fuente.personalizeInforme();
        
        FileOutputStream fout=generarReporte(excel);
        
        
    }
    public static FileOutputStream generarReporte(Informe i) throws FileNotFoundException{
        File file=new File("");
        FileOutputStream fo=new FileOutputStream(file);
        //Logica para convertir el informe en un objeto que se pueda exportar a otras plataformas
        System.out.println("Enviado");
        return fo;
    }
}
