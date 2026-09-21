class Solution {
    public boolean isAnagram(String s, String t) {
           int[] table=new int[26];

           for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            table[index]++;
           }
           
           
           for(int i=0;i<t.length();i++){
            int index=t.charAt(i)-'a';
            table[index]--;
           }

           for(int i:table){
            if(i!=0) return false;
           }

           return true;
    }
}
