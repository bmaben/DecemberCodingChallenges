package com.example.practiceadventure.Practice.Advanture;
import java.io.InputStream;
import java.util.Scanner;

public class WalkThrough {

    Scanner hitEnter = new Scanner(System.in);
        System.out.println("A DAILY TASK LIST WALK THROUGH");
        System.out.println("Tip: " + "When you see '...' hit enter to move on.");
    public void enterKey(){
        String enter = hitEnter.nextLine();
    }
   public static void main(String[] args) {

        //method for enter button to make it more accessible?





       // public void  enterKey(){
       //     String enter = hitEnter.nextLine();
       // }
        ///variables

      //  private static final String INTRO = "WELCOME TO YOUR ADVENTURE! /n" + "Tip: When you see '....' hit enter to move on";





        System.out.println("*************");
        System.out.println(".....");
        String empty = hitEnter.nextLine();
        System.out.println("Good Morning!");
        System.out.println(".....");
        hitEnter.nextLine();
        System.out.println("Hm... today is a good day for an adventure, right? (Y/N)");
        String adventureYesNo = hitEnter.nextLine();
        if(adventureYesNo.equals("Y")){
            System.out.println("Ok! Let's go on an adventure!");
        } else {
            System.out.println("O.K.! Maybe you're right... let's find something cozy to do at home!");
        }

        //create new instances of classes here to bring to different areas?





    }
}