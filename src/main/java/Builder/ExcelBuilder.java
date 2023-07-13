/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author USUARIO
 */
public class ExcelBuilder implements Builder{
    Excel excel;
    private ReportType rt;
    private  String title;
    private String content;
    @Override
    public void setReportType(ReportType rt) {
        this.rt=rt;
    }

    @Override
    public void setTitle(String s) {
       this.title=s;
    }

    @Override
    public void setContent(String s) {
        this.content=s;
    }
    public Excel getResult(){
        return new Excel(rt, title, content);
    }
    
    
}
