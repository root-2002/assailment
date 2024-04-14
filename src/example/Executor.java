package example;

import java.util.ArrayList;
import java.util.Arrays;

public class Executor {
    public static void main(String[] args) {
        //Q1
        System.out.println(DigitsToWords.digitsToWords(250));
        //Q2
        ArrayList<Integer>arr1 =new ArrayList<>(Arrays.asList(1,2, 2, 5,4,8,9,7,3));
        ArrayList<Integer>arr2 =new ArrayList<>(Arrays.asList(2,8,6,7));
        System.out.println("The elements are: "+NonDuplicateElements.nonDuplicateElements(arr1,arr2));

    }
}