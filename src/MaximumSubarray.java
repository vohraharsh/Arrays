public class MaximumSubarray{

    public static void main(String[] args) {
        
        int nums[] = {5,4,-1,7,8};

        int ans = maxsubarray(nums);

        System.out.println(ans);
    }


    public static int maxsubarray(int nums[]){

        if(nums == null || nums.length == 0){
            return 0;
        }

        int currentMax = nums[0];
        int globalMax =  nums[0];

        for(int i=1; i<nums.length; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(currentMax, globalMax);
        }

        return globalMax;
    }
}