package com.studyopedia;
public class spaces {
        public static void main(String[] args){

            padString("congratulations",18);
        }
        public static void padString(String a,int b){
            int c=a.length();
            if(b==c)
            {
                System.out.print(a);
            }
            else{
            for(int i=0;i<Math.abs(b-c);i++)
            {
                System.out.print(" ");
            }
            System.out.print(a);
        }
}}
