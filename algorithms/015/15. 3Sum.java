package algorithms

class Solution {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for(int i = 0;i < nums.length - 2;i++) {
                if (i > 0 && nums[i] ==  nums[i - 1]) {
                    continue;
                }
                for (int j = nums.length - 1;j > i + 1;j--) {
                    if (j < nums.length -1 && nums[j] == nums[j + 1]) {
                        continue;
                    }
                    for (int k = i + 1;k < j;k++) {
                        int data = nums[i] + nums[j] + nums[k];
                        if (data == 0) {
                            List<Integer> l1 = new ArrayList<>();
                            l1.add(nums[i]);
                            l1.add(nums[k]);
                            l1.add(nums[j]);
                            result.add(l1);
                            break;
                        }
                    }
                }
            }
            return result;
        }
    }
}
