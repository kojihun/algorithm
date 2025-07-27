def solution(food):
    answer = ''
    
    for i in range(1, len(food)):
        answer = answer + str(i) * (food[i] // 2)
    
    reverse_answer = ''.join(sorted(answer, reverse=True))
    
    return answer + '0' + reverse_answer