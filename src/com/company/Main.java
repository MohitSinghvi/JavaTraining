package com.company;
import java.util.*;
//Assignment8
class UserMainCode{

    //Assignment 8
    public static int sumOfSquaresOfEvenDigits(int positive_input){
        int temp = positive_input;
        int sum_of_squares=0;
        while(temp>0){
            int rem=temp%10;
            if(rem%2==0){
                sum_of_squares+=(rem*rem);
            }
            temp=temp/10;
        }
        return sum_of_squares;

    }

    //Assignment 9
    public static int countSeven(int input){
        int temp=input;
        int seven_count=0;
        while(temp>0){
            int rem=temp%10;
            if(rem==7){
                seven_count++;
            }
            temp=temp/10;
        }
        return seven_count;
    }

    //Assignment 10
    public static boolean compareLastDigit(int num1, int num2){
        if(num1%10==num2%10){
            return true;
        }
        else{
            return false;
        }
    }

    public static int getSumOfIntersection(int len1,int len2, int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet();

        int intersection_sum=0;
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                intersection_sum+=arr2[i];
            }
        }
        return intersection_sum;
    }
    public static int getBigDiff(int[] arr){
        int max_val=Integer.MIN_VALUE;
        int min_val=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max_val){
                max_val=arr[i];
            }
            if(arr[i]<min_val){
                min_val=arr[i];
            }
        }
        return max_val-min_val;
    }

    
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int input;
//        do{
//            System.out.println("Enter a positive Integer");
//            input=sc.nextInt();
//        }while(input<0);
//
//        System.out.println("Sum of even Squares: "+UserMainCode.sumOfSquaresOfEvenDigits(input));


//        System.out.println("Count of seven: "+UserMainCode.countSeven(input));


//        System.out.println("Last digit Comparison: "+UserMainCode.compareLastDigit(58,29));



//        int size1 = sc.nextInt();
//        int size2 = sc.nextInt();
//        int[] arr1 = getArray(size1);
//        int[] arr2 = getArray(size2);
//        int output = UserMainCode.getSumOfIntersection(size1,size2,arr1,arr2);
//        if(output>0) {
//        System.out.println(UserMainCode.getSumOfIntersection(size1,size2,arr1,arr2));
//        }
//        else{
//            System.out.println("No common elements");
//        }




    }
    public static int[] getArray(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
