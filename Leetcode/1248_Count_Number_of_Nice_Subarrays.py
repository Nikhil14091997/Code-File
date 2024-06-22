from typing import List
class Solution:
    def convert_to_binary(self, nums):
        for i in range(len(nums)):
            if nums[i] % 2 == 0:
                nums[i] = 0
            else:
                nums[i] = 1
        return nums

    def num_binary_sub_arr_sum(self, nums, k):
        def helper(target):
            if target < 0:
                return 0
            left, curr = 0, 0
            ret = 0
            for i in range(len(nums)):
                curr += nums[i]
                while curr > target:
                    curr -= nums[left]
                    left += 1
                ret += (i - left + 1)
            return ret
        
        return helper(k) - helper(k-1)

    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        # convert the arrar in binary
        nums = self.convert_to_binary(nums)
        # binary subarray with sum k: which is binary sub array (>=n) - (>= n-1)
        ret = self.num_binary_sub_arr_sum(nums, k)
        return ret
