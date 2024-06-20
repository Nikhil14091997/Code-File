class Solution:
    def isPossible(self, mid, position, m):
        prev = position[0]
        ret = 1
        for curr in position[1:]:
            if curr - prev >= mid:
                prev = curr
                ret += 1
        return ret >= m

    def maxDistance(self, position: List[int], m: int) -> int:
        position.sort()
        left, right = 1, position[-1] - position[0]
        if m <= 2:
            return position[-1] - position[0]

        while left < right:
            mid = (right + left + 1) // 2
            if self.isPossible(mid, position, m):
                left = mid
            else:
                right = mid - 1
        return left

