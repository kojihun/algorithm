from itertools import combinations

def solution(nums):
    kinds = set(nums)
    max_selectable = len(nums) // 2
    
    return min(len(kinds), max_selectable)