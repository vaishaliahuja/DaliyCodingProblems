//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.util.*;
class twoSum {
     
     public boolean twoSum(int arr[],int k){
         Set<Integer> set = new HashSet<>();
         for(int i =0;i<arr.length;i++){
             int number = k-arr[i];
             
             if(set.contains(number)){
                 return true;
             }
             set.add(arr[i]);
         }
         return false;
     }
    
    public static void main(String[] args) {
        
        int[] arr = {10, 15, 3, 7};
        int k = 17;
        twoSum sum = new twoSum();
        System.out.println(sum.twoSum(arr,k));
    }
}
