/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageA;

/**
 *
 * @author marisolcardonarosales
 */
public class ClassA {
    
    double field;
    
    public ClassA() {
    }
    
    public class SubClass{
        double subfield;
        public void subMethod(){
        }
    }
    
    private SubClass g_variable;
    
    public void noReturn() {
        displaySum();
    }
    // Refactor Método
    private void displaySum() {
        int a=0;
        int b=0;
        
        System.out.println(a+b);
    }
    
    public void singleOutput() {
        int a=0;
        int b=0;
        int c=0;
        if (a==c) c=0;
        System.out.println("c= "+c);
    }
    
    public void loop (int a){
        String s= "";
        while(--a>0) {
            
            if (a%3 != 0) {
                s=s+"--, ";
                continue;
            }
            
            s=s+a+", ";
        }
        
        if(s.endsWith(", ")) s=s.substring(0,s.length()-2);
        System.out.println(s);
        return;
           
    }
    
    public SubClass global(){
        g_variable=new SubClass();
        return g_variable;
    }
    // Refactor de parametro
    public static void printSum(int a){
        int b=2;
        
        System.out.println(a+b);
   
    }
    
    public int existing (int xx, int yy){
        return 0;
    }
    
    public double existing2(int xx, int yy){
        return 0.0;
    }
    
    public int existing3 (int xx, int yy, int zz){
        return 0;
    }
    
}

