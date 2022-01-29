package company;

import Gui.projectFrame;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        /*
         * try
         * {
         * File myfile=new File("customer.bin");
         * if(myfile.createNewFile())
         * {
         * System.out.println("doen" +myfile.getName());
         * }
         * else System.out.println("faild");
         * }
         * catch(Exception e){
         * System.out.println(e.getMessage());
         * }
         */

        new projectFrame().setVisible(true);
    }

}