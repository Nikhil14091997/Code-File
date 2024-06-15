from heapq import heappop, heappush
from typing import List

class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: List[int], capital: List[int]) -> int:
        n = len(profits)
        projects = list(zip(profits, capital))

        # Min heap to store projects by their capital requirements
        min_capital_heap = []
        # Max heap to store profits of projects that can be started
        max_profit_heap = []

        # Initialize the min heap with all projects
        for profit, cap in projects:
            heappush(min_capital_heap, (cap, profit))

        for _ in range(k):
            # Move all projects that can be started with current capital to the max heap
            while min_capital_heap and min_capital_heap[0][0] <= w:
                cap, profit = heappop(min_capital_heap)
                heappush(max_profit_heap, (-profit, cap))

            # If no projects can be started, break out of the loop
            if not max_profit_heap:
                break

            # Start the project with the maximum profit
            w += -heappop(max_profit_heap)[0]

        return w
