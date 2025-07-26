def solution(t, p):
    answer = 0
    length = len(p)
    target = int(p)
    
    for i in range(len(t) - length + 1):
        if int(t[i:i+length]) <= target:
            answer += 1
    return answer