package com.company;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sf = new Scanner (new File("Imports.txt"));
        Scanner kbReader = new Scanner(System.in);

        int maxIndex = -1;
        int A=0,B=0,C=0,D=0,F=0;


        String array[] = new String [300];
        String average[] = new String [300];
        String grade[] = new String [300];


        while(maxIndex<24)
        {
            maxIndex++;
            array[maxIndex] = sf.next();
            average[maxIndex] = sf.next();
            grade[maxIndex] = sf.next();
            System.out.println(array[maxIndex]);
            System.out.println(average[maxIndex]);
            System.out.println(grade[maxIndex]);
        }

        if(grade[maxIndex]>=90)
        {
            A++;
        }
        else if(grade[maxIndex]>=80)
        {
            B++;
        }
        else if(grade[maxIndex]>=70)
        {
            C++;
        }
        else if(grade[maxIndex]>=60)
        {
            D++;
        }
        else if(grade[maxIndex]>=50)
        {
            F++;
        }








        System.out.println("Warning, student "+.....+"has "+...+"days missed and is hurting them");





    }
}
