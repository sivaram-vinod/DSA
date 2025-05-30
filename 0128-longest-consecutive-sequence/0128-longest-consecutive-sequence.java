class Solution {
    public int longestConsecutive(int[] nums) {
          int longestlength=0;
        Map<Integer,Boolean>numberTravelledMap=new HashMap<>();

        for(int num:nums){
            numberTravelledMap.put(num, Boolean.FALSE);

        }

        for(int num:nums){
            int currentLength=1;

            int nextNum=num+1;
            while (numberTravelledMap.containsKey(nextNum) && numberTravelledMap.get(nextNum)==false ) {
                currentLength++;
                numberTravelledMap.put(nextNum, Boolean.TRUE);

                nextNum++;

                
            }

            int prevNum=num-1;
            while (numberTravelledMap.containsKey(prevNum)&& numberTravelledMap.get(prevNum)==false) {
                currentLength++;
                numberTravelledMap.put(prevNum, Boolean.TRUE);

                prevNum--;
                
            }
            longestlength=Math.max(longestlength, currentLength);
        }
        return longestlength;
        
    }
}