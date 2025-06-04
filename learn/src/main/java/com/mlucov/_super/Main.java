package com.mlucov._super;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
//        elantraSedan.carDetails(); //calling method to print details
        Integer[] nums = {1,2,3,4,5,6,7,8,9,5};
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
//        removeEven(numbers);
        removeEven(nums);
        int[] first = new int[9];
        int[] sec = {16,27,19};
        mergeTwoArrays(first, sec);
    }
    static int[] removeEven(Integer[] arr) {
//        Stream<Integer> stream = ;
        int[] data = Arrays.stream(arr).mapToInt(i -> i).filter(x -> x % 2 == 1).toArray();
        System.out.println(data.toString());
        for (int va: data) {
            System.out.println("Vriable: " + va);
        }
        return  data;
    }
    static int[] mergeTwoArrays(int[] first, int[] sec) {
        System.out.println("Merge arrays");
        int size = first.length + sec.length;
        int[] toReturn = new int[size];
        for (int i = 0; i < first.length; i++) {
            toReturn[i] = first[i];
        }
        for (int i = 0; i < sec.length; i++) {
            toReturn[i + first.length] = sec[i];
        }
        for (int vax: toReturn) {
            System.out.println("To return number : " + vax);
        }
        return  Arrays.stream(toReturn).sorted().toArray();
    }
    static int[] removeEven(List<Integer> arr) {
        int[] data = arr.stream().mapToInt(i -> i).filter(x -> x % 2 == 1).toArray();
        System.out.println(data.toString());
        for (int va: data) {
            System.out.println("Vriable: " + va);
        }
        return  data;
    }

}
