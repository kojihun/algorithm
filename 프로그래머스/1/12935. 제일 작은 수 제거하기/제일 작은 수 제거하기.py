def solution(arr):
    min_number = min(arr)
    arr.remove(min_number)
    
    return arr if len(arr) != 0 else [-1]