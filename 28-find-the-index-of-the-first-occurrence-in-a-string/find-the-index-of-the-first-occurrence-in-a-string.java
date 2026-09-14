class Solution {
    public int strStr(String haystack, String needle) {
        

        int finish = needle.length();
        int start = 0;
        
        while (finish <= haystack.length())
        {
            if(haystack.substring(start, finish).equals(needle))
            {
                return start;
            }

            start++;
            finish++;
        }
        return -1;
       
    }

}