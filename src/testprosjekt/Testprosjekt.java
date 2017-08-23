/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprosjekt;

import java.util.ArrayList;
/**
 *
 * @author Ben
 */
public class Testprosjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("Kristiansand");
        locations.add("Bergen");
        locations.add("Trondheim");
        locations.add("Lakselv");
        for (String location : locations) {
            System.out.println("Greetings from " + location);
        }
    }
    
}
