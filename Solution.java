		import java.util.HashMap;
		import java.util.Map;
		public class Solution {
		    private final Random chaos=new Random();
		    private final int[] nums;
		    private final Map<Integer,Integer> counts=new HashMap<>();
		    public Solution(int[] nums) {
		        for(int i=0;i<nums.length;i++){
		            if(!counts.containsKey(nums[i])){
		                counts.put(nums[i],1);
		            }else{
		                counts.put(nums[i],counts.get(nums[i])+1);
		            }
		        }
		        this.nums=nums;
		    }
		    
		    public int pick(int target) {
		        int targetOccurrance=1+chaos.nextInt(counts.get(target));
		        int occurrance=0;
		        for(int i=0;i<nums.length;i++){
		            if(nums[i]==target){
		                occurrance++;
		                if(targetOccurrance==occurrance){
		                    return i;
		                }
		            }
		        }
		        throw new RuntimeException("Assertion Failed.");
		    }
		}
