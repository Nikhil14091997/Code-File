from typing import List
class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
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

        return helper(goal) - helper(goal-1)