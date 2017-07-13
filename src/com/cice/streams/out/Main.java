/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.streams.out;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author cice
 */
public class Main {
    
    public static void main (String [] args) throws FileNotFoundException{
        
        PrintStream ps = new PrintStream("/Volumes/USB DISK/datos2.txt");
        ps.print("hola me llamo Luis");
        ps.close();
        
        
    }    
}
