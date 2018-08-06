package pack;

import java.util.Scanner;

public class A {
    
    protected int cout(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener your password: ");
        int pass = sc.nextInt();
        return pass;
    }
}