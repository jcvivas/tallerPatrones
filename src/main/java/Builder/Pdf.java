/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author USUARIO
 */
public class Pdf implements Informe{
   private ReportType rt;
    private  String title;
    private String content; 

    public Pdf(ReportType rt, String title, String content) {
        this.rt = rt;
        this.title = title;
        this.content = content;
    }

    public ReportType getRt() {
        return rt;
    }

    public void setRt(ReportType rt) {
        this.rt = rt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
     @Override
    public void saveInforme() {
        System.out.println("Pdf Guardado");
    }

    @Override
    public void viasualizeInforme() {
        System.out.println("Visualizando Pdf");
    }

    @Override
    public void personalizeInforme() {
        System.out.println("Pdf personalizado");
    }
    
    
}

