package Exceptions;

import java.util.Scanner;

public class ExceptionExample {

    static String[] userNames;
    public static void main(String[] args) {
        userNames = new String[3];
        userNames[0] = "Ramanamma";
        userNames[1] = "Sanyasi rao";
        userNames[2] = "Upendra";

        Scanner sc = new Scanner(System.in);

        while(true){
            int id = sc.nextInt();

            System.out.println("User name is: "+getUserName(id));
        }
    }
    public static String getUserName(int id){
        return userNames[id];
    }
}
