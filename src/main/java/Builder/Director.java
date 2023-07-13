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
   
}
