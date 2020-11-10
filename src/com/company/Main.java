package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1	Даны два числа , проверить равны ли они ?
        System.out.println("Task 1");
        int first = 10 ;
        int second = 6  ;

        if (first == second){
            System.out.println("These numbers are equal");
        }else {
            System.out.println("These numbers arn't equal");
        }



        //2	Дано число (введено с клав.) проверить делится ли оно на 3
        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter the number = ");
        number = scanner.nextInt();

        if (number%3==0){
            System.out.println("Yes , number " + number + " divisible by 3");
        }else {
            System.out.println("Not , number " + number + " is not divisible by 3");
        }



        //3	Есть две фигуры , Шар и цилиндр , стороны вводите с клавиатуры , сравнить кто больше?
        System.out.println("Task 3");
        int glob;
        int cylinder;

        System.out.print("Please enter the side of the glob = ");
        glob = scanner.nextInt();
        System.out.print("Please enter the side of the cylinder = ");
        cylinder = scanner.nextInt();

        if (cylinder > glob)
        {
            System.out.println("Cylinder larger than a glob");
        }else if (cylinder < glob)
        {
            System.out.println("Glob larger than a cylinder");
        }else
        {
            System.out.println("Figures are equal");
        }



        //4	Вводите возраст Петра , если ему больше 18 лет , то он может получить авто права.
        System.out.println("Task 4");

        System.out.print("Enter Peter's age = ");
        int petr_age = scanner.nextInt();

        if (petr_age >=18)
        {
            System.out.println("Peter can get a driver's license");
        }
        else
        {
            System.out.println("Peter can not get a driver's license");
        }




        //5	Я куплю вещь если она будет стоить от 2$ до 15$ иначе посмотрю аналог
        System.out.println("Task 5");

        System.out.println("How much is the product ?");
        int cost = scanner.nextByte();

        if (cost >=2 && cost < 15)
        {
            System.out.println("You buy a product");
        }
        else
        {
            System.out.println("You are not buying an product");
        }




/*
      6	Вводите возраст если он больше 20 , тогда нужно еще дополнительно проверить больше ли он 30 ?
      Если возраст от 20 до 30 , тогда вывести студент. Иначе вывести "от 30 и более".
      Не использовать сложные условия , использовать вложенный условный оператор
*/      System.out.println("Task 6");

        System.out.print("Enter age = ");
        int age = scanner.nextInt();

        if (age >= 20 )
        {
            if (age >= 30)
            {
                //Если возраст от 30 и более
                System.out.println("от 30 и более");
            }else
            {
                //Если возраст от 20 до 30
                System.out.println("Student");
            }
        }else
        {
            //Если возраст до 20
            System.out.println("возраст до 20");
        }
    }
}
