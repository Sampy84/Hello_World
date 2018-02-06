/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printers;

/**
 *
 * @author Federica
 */
public class SimplePrinter {
    
    String name;
    
    public SimplePrinter(String str) {
    
        this.name=str;
        
        System.out.println("Hi, I'm "+this.name+", a SimplePrinter!");
    }
    
    public void printSecretMessage(String message){
    
        System.out.println("The secret message is: "+ message+ "\n");

    }
    
}
