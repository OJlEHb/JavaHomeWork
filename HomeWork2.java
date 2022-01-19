/**
*Java 1. Homework 2
*
*@author Oleg Simonov
*@version 20.01.2022
*/
class HomeWork2{
    public static void main(String[] args){
        within10and20 (5,6);
        posOrneg(4);
        isNegative(7);
        printWordNTimes("asd",4);
    }

    static boolean within10and20 (int a,int b){
        return (10<=a+b) && (a+b<=20);
    }

    static void posOrneg(int a){
        System.out.println(a>=0? "a is positive" : "a is negative");
    }

    static boolean isNegative(int a){
        if(a<0){return true;
        }
        return false;
    }

    static void printWordNTimes(String word,int a){
        for(int i=0; i<a;i++){
            System.out.println(word);
        }
    }
}