package com.practicesearchesarrays.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Constants declaration
        final int ELEMENTS_ARRAY = 5;

        //Variable declarations
        byte vectorNumbers[] = {5,8,10,66,50};
        int numberSearch = 0;
        int positionNumber = 0;
        char response = 'y';

        //Object declaration
        Scanner in = new Scanner(System.in);

        do {
            //Input from user
            System.out.print("write the number you want to search: ");
            numberSearch = in.nextInt();

            //Call function SquentialSearch
            positionNumber = SequentialSearch(vectorNumbers, numberSearch);

            if(positionNumber == -1){
                System.out.println(String.format("the number %d in the vector was not found!!",numberSearch));
            }
            else {
                System.out.println(String.format("The position of the number %d is %d",positionNumber,numberSearch));
            }

            //Input user response
            System.out.print("(y/n): ");
            response = in.next().charAt(0);
        }while (response == 'y');





    }

    //Sequential search
    public static byte SequentialSearch(byte[] vector, int value){
        byte pos = -1;
        for(byte i =0; i < vector.length; i++){
            if(vector[i] == value){
                pos = i;
                break;
            }
        }
        return pos;
    }
}
