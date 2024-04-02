package org.example.ex07;

public class hw_1 {

       static class myInteger{
            int num;
        public myInteger(int num){
            this.num = num;
        }
        }
        public static int preIncrease(myInteger num){
           num.num = num.num +1 ;
           return num.num;
        }
        public static int postIncrease(myInteger num){
           num.num = num.num + 1;
           return num.num - 1;
        }

    public static void main(String[] args) {

    }
    }

