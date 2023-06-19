class Solution {
    public boolean isPerfectSquare(int num) {
        int t=(int)Math.sqrt(num);
        if(t*t==num)
        {
            return true;
        }
        return false;
    }
}
