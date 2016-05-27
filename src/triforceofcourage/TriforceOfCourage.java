/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triforceofcourage;

/**
 *
 * @author Queno
 */


import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class TriforceOfCourage {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner scan=new Scanner(System.in);
            int n = scan.nextInt();
            int count = 0;
            int center = 5;
            int centerL = 2;
            int centerR = 8;

             for (int row = 0; row < 3; ++ row)
                 {
        for (int column = 0; column < 11; ++ column)
                {
            if (column >= center - row && column <= center + row)
                System.out.print("^"); // Replace with whatever character to print.
            else
                System.out.print(" ");
                }
        System.out.println(); // Line break after each row, of course.
            }

        for(int rowB = 0; rowB < 3; rowB++)
        {
        for (int columnL= 0;columnL < 5; columnL++)
        {
            if (columnL>= centerL - rowB && columnL <= centerL + rowB)
                System.out.print("^");
                else
                    System.out.print(" ");
        }
        for (int columnR = 5; columnR<11; columnR++)
        {
            if (columnR>= centerR-rowB && columnR <= centerR+rowB)
                System.out.print("^");
                else
                    System.out.print(" ");
        }
        System.out.println();
        }
}
}