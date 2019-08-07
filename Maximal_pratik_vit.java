/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximl_pratik_vit;
import java.util.*;

/**
 *
 * @author Pratik Dutta
 */

public class Maximal_pratik_vit {

    /**
     * @param args the command line arguments
     */
   public int getLength(String str) {
    int preInd = 0, currInd = 0, maxLen = 0;
    int strLen = str.length();
    HashSet<Character> characterSet = new HashSet<>();

    while (currInd < strLen) {
      if (characterSet.contains(str.charAt(currInd))) {
        characterSet.remove(str.charAt(preInd));
        preInd++;
      } 
      else {
        characterSet.add(str.charAt(currInd));
        currInd++;
        maxLen = Math.max(maxLen, currInd - preInd);
      }
    }
    return maxLen;
  }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //HashSet<Character> h = new HashSet(); 
        
        String s;
        System.out.println("Enter the String: ");
        s=sc.next();
        Maximal_pratik_vit obj=new Maximal_pratik_vit();
        System.out.println(obj.getLength(s));
   }
}