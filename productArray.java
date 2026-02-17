// Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

// This is a brute force approach with time complexity - O(n*n)


class Main {
     public static  int[] productArray(int arr[]){
           
            int size = arr.length;
            int[] result = new int[size];
            for(int i =0 ;i<size;i++){
                int product = 1;
            for(int j =0;j<size;j++){
                if(i!=j)
                {
                    product *=arr[j];
                }
            }
            result[i] = product;
            }
             return result;
        }
    public static void main(String[] args) {
        
       int arr[] = {1,2,3};
       
       int result[] = productArray(arr);
       for(int i =0;i<result.length;i++){
           System.out.println(result[i]);
       }
    }
}
