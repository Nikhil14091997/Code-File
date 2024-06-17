import math
class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        i, j = 0, math.ceil(math.sqrt(c))
        while i <= j:
            prod = i**2 + j**2
            if prod == c:
                return True
            elif prod > c:
                j -= 1
            else:
                i += 1
        return False