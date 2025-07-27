def solution(a, b, n):
    answer = 0
    
    while(n >= a):
        change_coke = (n // a) * b
        remain_coke = (n % a)
        
        answer += change_coke
        n = change_coke + remain_coke
        
    return answer