/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageB;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author marisolcardonarosales
 */

//Refactorización constante
public class ClassB {
    List l = new LinkedList();
    String s = my_TEXT;
    private static final String my_TEXT = "text";
    
    public void method(){
        String local = my_TEXT;
    } 
    
    public static int statMethod() {
        int c=3;
        System.out.print(c);
        return 3;
    }
}
