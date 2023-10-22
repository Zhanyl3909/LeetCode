class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length ;
        int[] arrCat = new int[len*2];

        
        for(int i=0; i<len; i++) {
                arrCat[i] = nums[i];
                arrCat[i+len] = nums[i];
        
        }
        return arrCat;
    }
}
