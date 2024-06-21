from typing import List
class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        satisfied = 0
        ret = satisfied
        for idx, item in enumerate(customers):
            if grumpy[idx] == 0:
                satisfied += customers[idx]
        # now we have initial satisfied, we calculate the based on the minute window
        i, j = 0, minutes
        while i < j and j <= len(customers):
            # calculate the grumpy customers and add them to satisfied
            tmp = 0
            for _ in range(i, j):
                if grumpy[_] == 1:
                    tmp += customers[_]
            tmp += satisfied
            if tmp > ret:
                ret = tmp
            i += 1
            j += 1
        return ret