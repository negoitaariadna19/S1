package ro.ase.cts.g1088;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduceti propozitia");
        String str=sc.nextLine();
        try{
            if(str.toLowerCase()==str)
            {
                throw new ExceptionAllower();
            }
            if(str.toUpperCase()==str)
            {
                throw new ExceptionUpper();
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Ati introdus+" + str);
    }
}
