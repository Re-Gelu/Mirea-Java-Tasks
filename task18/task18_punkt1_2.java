package task18;

import java.util.Scanner;

public class task18_punkt1_2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public static void main(String[] args) {
        task18_punkt1_2 task = new task18_punkt1_2();
        task.exceptionDemo();
    }
}
