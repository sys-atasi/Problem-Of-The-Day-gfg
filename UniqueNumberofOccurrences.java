class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,1)+1); //if element is not found the store its value by default 1 
                                                //otherwise if it is found again in the array then increment by 1
        }
        Set<Integer>set=new HashSet<>();
        for(int x:map.values())
        {
            if(set.contains(x))
                return false;
            else
                set.add(x);
        }
        return true;
    }
}
        
