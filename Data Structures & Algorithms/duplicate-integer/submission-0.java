class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> table=new HashSet<>();
      for(int i:nums)
      {
        if(table.contains(i))
        return true;
        else
        table.add(i);
      }

      return false;
    }
}