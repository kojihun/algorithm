def solution(d, budget):
    support_cnt = 0
    
    d = sorted(d)
    for element in d:
        if budget >= element:
            budget = budget - element
            support_cnt = support_cnt + 1
            
    return support_cnt