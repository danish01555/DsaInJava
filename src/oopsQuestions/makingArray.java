package oopsQuestions;

import java.util.Arrays;

public class makingArray {
    public static class Arraylist{
        int []arr=new int[5];
        int indx;
        int size;
        public void add(int ele){
            if(size== arr.length){
                int[]brr= Arrays.copyOf(arr,arr.length*2);
                arr=new int[brr.length];
                arr=Arrays.copyOf(brr,brr.length);
            }
            arr[indx]=ele;
            indx++;
            size++;
        }
    }
    public static void main(String[] args) {
        Arraylist arr=new Arraylist();
        arr.add(9);
        arr.add(8);
        arr.add(9);
        arr.add(8);
        arr.add(9);
        arr.add(8);
        System.out.println(arr.size);
    }
}
