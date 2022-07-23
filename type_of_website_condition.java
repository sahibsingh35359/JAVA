package com.company;

import java.util.Scanner;

public class type_of_website_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = sc.next();
        if (url.endsWith(".org")){
            System.out.println("This is a Organization Website");
        }
        else if(url.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        }
        else if(url.endsWith(".in")) {
            System.out.println("This is a Indian Website");
        }
        else{
            System.out.println("This is not the website ");
        }
        }
    }

