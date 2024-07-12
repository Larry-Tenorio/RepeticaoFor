/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author trixti
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<=15; i+=2) {
        if (i%3==0) continue;
        System.out.println(i);
    }
        /*
        for (int cc=0;cc<=100;cc+=10) {
            System.out.println(cc);
        }
        */
        /* 
        int cc = 0;
        while (cc<4) {
           System.out.print("Cambalhota");
        cc++
        }
        */
    }
    
}
