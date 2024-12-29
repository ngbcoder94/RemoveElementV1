/*
 * Author: Nick Burkett
 * Date: 12/29/24
 * 
 * Problem: Remove instances of a value from a given array. 
 */

//The class that will drive this algo
public class RemoveElementV1{
        
        /*
         * removeElement function - This will remove any instances of a given value and return...
         * ... the number of elements in the array post removal of given value. 
         *
         * @param nums[int] - Array of integers. 
         * @param int val - Value that needs to be removed from the array.
         * @return int count - Number of elements left in the array post edit.
         */
        public int removeElement(int[] nums, int val){
                
                //Delcare/initialize counter var to hold value of non val integers in the array. 
                int counter = 0; 

                int i = 0;  //Initialize counter variable for loop below. 
                
                //Create loop to iterate through array in search of values equal to val. 
                while(i < nums.length){
                        
                        //Need to check if I have a correct match where nums[i] == val is T. 
                        if(nums[i] == val){
                                
                        }
                }
        }

        //The main method for the class
        public static void main(String[] args){
                System.out.println("ha, yea right");
        }
}
