from itertools import combinations

def solution(numbers):
    s = set()
    
    for pair in combinations(numbers, 2):
        s.add(sum(pair))

    answer = sorted(s)
    return answer