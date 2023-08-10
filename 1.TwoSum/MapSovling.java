class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Mapping
        Map<Integer,Integer> mapp = new HashMap<Integer,Integer> ();
        for(int i=0; i<nums.length; i++) {
            int cur = nums[i];

            int x = target - cur;
            if(mapp.containsKey(x)) {
                return new int[] { mapp.get(x),i};

            }
            mapp.put(cur,i);
        }
        return null;
    }
}
