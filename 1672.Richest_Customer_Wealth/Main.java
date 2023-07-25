class Solution {
    public int maximumWealth(int[][] accounts) {

        int temp = 0;
        int max = 0;
        
        for(int i=0; i<accounts.length; i++) //through all array
        {
            for (int j=0;  j < accounts[i].length; j++) //for each array inside array
            {
                temp = temp + accounts[i][j]; //sum
            }
            if(temp>max)
            {
                max = temp; //finding max
            }
            temp = 0;

        }
        return max; //returning max
        
    }
}
