package codechallenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedLatter { 
private static Scanner s;
    public static void main(String [] args) {


        String n, a[];
        int i,l;
        Set<String> set = new HashSet<String>();
        System.out.println("Enter the string: ");
        s= new Scanner(System.in);
        n=s.nextLine();
        a=n.split("");
        l = a.length;
        for(i=0; i<l; i++){
            if(set.contains(a[i])){
                System.out.println("Repeated Letter: "+a[i]);
            }
            set.add(a[i]);
        }
} 
}