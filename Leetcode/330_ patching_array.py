from typing import List
class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        i, range_index = 0, 0
        ret = 0
        N = len(nums)
        while range_index < n:
            if i < N  and nums[i] <= range_index + 1:
                range_index += nums[i]
                i += 1
            else:
                ret += 1
                range_index += (range_index + 1)
        return ret