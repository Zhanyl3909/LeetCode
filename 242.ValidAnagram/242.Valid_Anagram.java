class Solution {
      public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        if(Arrays.equals(c,c2)){
            return true;
        }else{
            return false;
        }
    }
}
