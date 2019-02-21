/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaoftriangle;

import javax.swing.JOptionPane;

/**
 *
 * @author asson2417
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, C;
        String myInput;
        myInput = JOptionPane.showInputDialog("What is the value of" + " a");
        a = Double.parseDouble(myInput);
        myInput = JOptionPane.showInputDialog("What is the value of" + " b");
        b = Double.parseDouble(myInput);
        myInput = JOptionPane.showInputDialog("What is the value of" + " c");
        c = Double.parseDouble(myInput);
        myInput = JOptionPane.showInputDialog("What is the value of" + " C" + " in degrees");
        C = Double.parseDouble(myInput);
        double area;
        area = (a + b + Math.sin(c)) / 2;
        
        System.out.println("a = " + myInput);
        System.out.println("b = " + myInput);
        System.out.println("c = " + myInput);
        System.out.println("C = " + myInput);
        System.out.println("The area of the triangle is " + area);
    }
    
}
