class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList=new ArrayList<>();
        
        Arrays.sort(nums);

        backtrack(resultList,new ArrayList<>(),nums,0);

        return resultList;


    }

    private void backtrack(List<List<Integer>> resultList,List<Integer> tempset,int [] nums,int start){
        if (resultList.contains(tempset)) {
            return;
            
        }

        resultList.add(new ArrayList<>(tempset));
        
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);

            backtrack(resultList, tempset, nums, i+1);

            tempset.remove(tempset.size()-1);
            
        }
    }
}