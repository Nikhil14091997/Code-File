from typing import List

class Solution:
    def count_bouquets(self, bloomDay: List[int], m: int, k: int, day: int) -> int:
        count = 0
        current_count = 0
        
        for bloom in bloomDay:
            if bloom <= day:
                current_count += 1
                if current_count == k:
                    count += 1
                    current_count = 0
            else:
                current_count = 0
                
        return True if count >= m else False

    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m * k > len(bloomDay):
            return -1
        min_day = min(bloomDay)
        max_day = max(bloomDay)
        
        while min_day < max_day:
            mid_day = (min_day + max_day) // 2
            if self.count_bouquets(bloomDay, m, k, mid_day): # then look for a smaller day
                max_day = mid_day
            else:
                min_day = mid_day + 1

        
        return min_day