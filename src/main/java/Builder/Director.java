/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author USUARIO
 */
public class Director {
   private static Director instance;
   public String value;
   private Director(String Value){
       this.value=value;
   }
   public static Director getInstance(String value){
       if (instance==null){
           instance=new Director(value);
       }
       return instance;
   }
   public void makePdfReport(Builder b){
       b.setReportType(ReportType.PDF);
       b.setTitle("Pdf");
       b.setContent("Cuerpo Pdf");
   }
      public void makeWordReport(Builder b){
       b.setReportType(ReportType.WORD);
       b.setTitle("Word");
       b.setContent("Cuerpo Word");
   }
      public void makeExcelReport(Builder b){
       b.setReportType(ReportType.EXCEL);
       b.setTitle("Excel");
       b.setContent("Cuerpo Excel");
   }
}
