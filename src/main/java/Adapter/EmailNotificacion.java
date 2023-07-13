/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdisenio;

import java.io.FileOutputStream;

/**
 *
 * @author marle
 */
public class EmailNotificacion implements ReportNotification{
 
    @Override
    public void sendNotification(FileOutputStream file ) {
        //logica para enviar
        System.out.println("Sending by email");
    }
}
