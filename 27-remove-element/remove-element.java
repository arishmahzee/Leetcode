class Solution {
    public int removeElement(int[] nums, int val) {
        
        //integer array nums 
        //find all int val and remove INPLACE
        //return num of elements in nums not = val
        //k is the number of elements not equal to val SO EVERYTHING MOVES DOWN?

    int numVal = 0;
    for(int i = 0; i < nums.length; i++)
    {
        if (nums[i] == val)
        {
            numVal++;
        }
    }

    int k = 0;

    for(int i = 0; i < nums.length; i++)
    {

        if (nums[i] != val)
        {
            nums[k] = nums[i];
            k++;
        }


        
    }

  
    

    return k;


    }
}