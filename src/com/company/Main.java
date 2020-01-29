package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your name ");
        String name= input.nextLine();
        System.out.println("enter your feild");
        String feild= input.nextLine();
        System.out.println("enter your id");
        int id= input.nextInt();
        System.out.println("enter your age");
        int age= input.nextInt();

        Student student= new Student(name,id,age,feild);
        student.show();
    }
}
