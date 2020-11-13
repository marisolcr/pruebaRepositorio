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
public class ClassA {
 
 // Refactorización field   
    public void method (){
        int x =new_field;
        int y =new_field+3;
        System.out.print(new_field);
    }
    private final int new_field = 3+3;
    
    public void method2(){
        int x= new_field;
        String constExpr = "CONST";
    }
    
    public static void method3 () {
        String s ="Text";
    }
    
    String konst ="a";
}
