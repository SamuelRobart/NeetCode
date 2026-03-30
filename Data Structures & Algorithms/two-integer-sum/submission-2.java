
class Solution {
    public int[] twoSum(int[] nums, int target) {
            // Map to store: Key = value of element, Value = index of element
                    Map<Integer, Integer> map = new HashMap<>();
                            
                                    for (int i = 0; i < nums.length; i++) {
                                                int complement = target - nums[i];
                                                            
                                                                        // Check if the number we need to hit the target exists in the map
                                                                                    if (map.containsKey(complement)) {
                                                                                                    return new int[] { map.get(complement), i };
                                                                                                                }
                                                                                                                            
                                                                                                                                        // Otherwise, add the current number to the map
                                                                                                                                                    map.put(nums[i], i);
                                                                                                                                                            }
                                                                                                                                                                    
                                                                                                                                                                            // In case no solution is found (though LeetCode guarantees one)
                                                                                                                                                                                    throw new IllegalArgumentException("No two sum solution");
                                                                                                                                                                                        }
                                                                                                                                                                                        }
                                                                                                                                                                                        