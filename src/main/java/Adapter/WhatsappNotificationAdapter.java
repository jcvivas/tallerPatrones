/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import Builder.Informe;
import java.io.FileOutputStream;

/**
 *
 * @author marle
 */
public class WhatsappNotificationAdapter {
    private WhatsappNotification adaptee;
    private Informe informe;

    public WhatsappNotificationAdapter(TelegramNotification telegram, Informe informe) {
        this.adaptee = adaptee;
        this.informe = informe;
    }

    public void sendNotification(FileOutputStream file) {
        adaptee.sendMessage(file);
        //logica para enviar
    }
}
