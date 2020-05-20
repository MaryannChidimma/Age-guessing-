/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ageguessingsystem;

import java.util.Scanner;

/**
 *
 * @author 840g3
 */
public class AgeGuessingSystem {

    public static void main(String[] args) {
      int answer;

      
        
       String setnumber1 = "1 3  5  7\n" +
                           "9 11 13 15\n" +
                           "17 19 21 23\n" +
                           "25 27 29 31";
       String setnumber2 = "2  3  6  7\n" +
                           "10 11 14 15\n" +
                           "18 19 22 23\n" +
                           "26 27 30 31";
       String setnumber3 = "4 5  6  7\n" +
                           "12 13 14 15\n" +
                           "20 21 22 23\n" +
                           "28 29 30";
       String setnumber4 = "8  9  10 11\n" +
                           "12 13 14 15\n" +
                           "24 25 26 27\n "+
                           "28 29 30 31";
       String setnumber5 = "16 17 18 19\n" +
                           "20 21 22 23\n" +
                           "24 25 26 27\n" +
                           " 28 29 30 31";
       
       
       int day = 0;
       
        Scanner input = new Scanner(System.in);
    System.out.println("date of birh in the set of number below");
    System.out.println(setnumber1 );
    System.out.println("Enter '1' for yes and '0' for No");
    
     answer = input.nextInt();
   // if (answer != 1 || answer !=0){
   //  System.out.println("Enter a valid number") ;
  //  }
        
     if(answer == 1){
        day +=1;
      }
    System.out.println("date of birh in the set of number below");
    System.out.println(setnumber2);
     System.out.println("Enter '1' for yes and '0' for No");
      answer = input.nextInt();
    
     if(answer == 1){
        day +=2;
      }
   System.out.println("date of birh in the set of number below");
   System.out.println(setnumber3);
    System.out.println("Enter '1' for yes and '0' for No");
     answer = input.nextInt();
    
     if(answer == 1){
        day +=4;       
    }
    System.out.println("date of birh in the set of number below");
    System.out.println(setnumber4);
     System.out.println("Enter '1' for yes and '0' for No");
     answer = input.nextInt();
    
     if(answer == 1){
        day +=8;
    
}
      System.out.println("date of birh in the set of number below");
    System.out.println(setnumber5);
    System.out.println("Enter '1' for yes and '0' for No");
      answer = input.nextInt();
    
     if(answer == 1){
        day +=16;
     }
     
     System.out.println("Your birhday is " + day );
    }
}