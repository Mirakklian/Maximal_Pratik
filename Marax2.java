/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marax2;

/**
 *
 * @author Pratik Dutta
 */
import java.util.*;
public class Marax2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the Date: ");
        s=sc.next();
        //int x=(int)s.charAt(1);
        int x=Character.getNumericValue(s.charAt(3));
        //System.out.println(x);
       // int y=Integer.parseInt(s.charAt(4));//String to integer
         int y=Character.getNumericValue(s.charAt(6));
        //System.out.println(y);
        int date=10*x+y;
        System.out.println(30-date);
        
        
    }
    
}

