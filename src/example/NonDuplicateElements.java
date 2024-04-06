package example;

import java.util.ArrayList;

public class NonDuplicateElements {
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
