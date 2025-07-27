from itertools import combinations

def solution(number):
    count = 0
    
    answer = list(combinations(number, 3))
    for element in answer:
        if sum(element) == 0:
            count = count + 1
            
    return count