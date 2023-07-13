/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

import java.io.FileOutputStream;

/**
 *
 * @author marle
 */
package Adapter;

import Builder.Informe;
import java.io.FileOutputStream;

public class TelegramNotificationAdapter {
   private TelegramNotification adaptee;
    private Informe informe;

    public TelegramNotificationAdapter(TelegramNotification telegram, Informe informe) {
        this.adaptee = adaptee;
        this.informe = informe;
    }

    public void sendNotification(FileOutputStream file) {
        adaptee.sendMessage(file);
        //logica para enviar
    }
}
