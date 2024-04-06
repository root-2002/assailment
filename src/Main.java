import formAction.FormCreation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = FormCreation.createForm();
//            frame.setLocationRelativeTo(null);
//        });
        String myNumber = digitsToWords(250);
            System.out.println(myNumber);
            ArrayList<Integer>arr1 =new ArrayList<>(Arrays.asList(1,2, 2, 5,4,8,9,7,3));
            ArrayList<Integer>arr2 =new ArrayList<>(Arrays.asList(2,8,6,7));
        System.out.println("The elements are: "+nonDuplicateElements(arr1,arr2));
    }
    public static String  digitsToWords(int number){
        final String[] WORDS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(number ==0) return "";
        String result = digitsToWords(number / 10);

        result += WORDS[number % 10] + " ";
        return result;
    }
    public static ArrayList<Integer> nonDuplicateElements(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer num :arr1){
            if(!arr2.contains(num)){
                temp.add(num);
            }
        }
        return temp;
    }
}