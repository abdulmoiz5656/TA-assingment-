package com.JavaCal;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Palindrome Checker \n 1. Queue \n 2. Stack \n 3. Quit");
            int nm = sc.nextInt();

            if(nm == 1){
                Queue();
            }
            else if(nm == 2){
                Stack();
            }
            else if(nm == 3){
                break;
            }
            System.out.println("Try Again : Yes/No");
            String opt = sc.next().toUpperCase();
            if(opt.equals("No")){
                boolean play = false;
                break;
            }
        }
    }

    public static void Queue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word or Number: ");
        String txt = sc.nextLine();
        Queue q = new LinkedList();
        String reverse = "";

        for(int i = txt.length()-1; i>=0; i--){
            q.add(txt.charAt(i));
        }

        while(!q.isEmpty()){
            reverse+=q.remove();
        }

        if(txt.equals(reverse)){
            System.out.println("is a palindrome \n ");

        }
        else{
            System.out.println("is not a palindrome \n ");
        }


    }

    public static void Stack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word or number: ");
        String txt = sc.nextLine();
        Stack s = new Stack();
        String reverse = "";

        for(int i = 0; i < txt.length(); i++){
            s.push(txt.charAt(i));
        }

        while(!s.isEmpty()){
            reverse+=s.pop();
        }

        if(txt.equals(reverse)){
            System.out.println("is a palindrome \n ");

        }
        else{
            System.out.println("is not a palindrome \n ");
        }


    }
}