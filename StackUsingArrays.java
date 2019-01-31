/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusingarrays;

import java.util.Scanner;

/**
 *
 * @author aditya
 */
public class StackUsingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sua s = new sua();
        s.push();
        s.push();
        s.display();
        s.pop();
        s.display();
    }

}

class sua {

    int a[] = new int[10];
    int top, item;
    public sua(){
        top = -1;
    }

    public void push() {
        if (top >= a.length) {
            sop("Stack overflow");
        } else {
            Scanner s = new Scanner(System.in);
            sop("Enter element: ");
            item = s.nextInt();
            top++;
            a[top] = item;
        }
    }
    public void pop(){
        /*if(top == -1){
            sop("pop: Stack underflow");
        }else{*/
            sop(a[top] + " is deleted");
            top --;
        //}
    }

    public void display() {
        if (top == -1) {
            sop("Display: Stack underflow");
        } else {
            while (top != -1) {
                sop("Display:" + a[top] + " ");
                top--;
            }
        }
    }

    public void sop(String s) {
        System.out.println(s);
    }
}
