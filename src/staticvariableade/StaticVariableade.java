/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticvariableade;

/**
 *
 * @author Ade Sopian
 */

class Display{
    static String type = "Display";
    private String name;
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        // type = typeInput; // alternatif 1
        // this.type = typeInput; // alternatif 2
        Display.type = typeInput; // alternatif 3 (lebih direkomendasikan karena memakai nama class
    }
    
    void show(){
        System.out.println("Display name = " + this.name);
    }
}
public class StaticVariableade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();
        
        Display display2 = new Display("Smartphone");
        display2.show();
        
        System.out.println("=====================================");
        
        // tampilkan static variable atau class variable
        
        // kita coba mengganti variable staticnya
        display1.setType("Monitor");
        
        System.out.println("Menampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
        
        
    }
    
}
