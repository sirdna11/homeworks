package io.codelex.arithmetic.practice;

public class Exercise6 {
    public static void main(String[] args){

        int counter=0;

        for (int i = 1; i <= 110; i++) {

            counter++;

            if (i%3==0){
                System.out.print(" Coza ");
            }else if(i%5==0){
                System.out.print(" Loza ");
            }else{
                System.out.print(" "+ i +" ");
            }
            if (counter == 11) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
