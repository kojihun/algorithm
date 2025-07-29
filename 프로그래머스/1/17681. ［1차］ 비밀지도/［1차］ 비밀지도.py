def solution(n, arr1, arr2):
    answer = []

    for i in range(n):
        binary = bin(arr1[i] | arr2[i])[2:].zfill(n)
        
        line = ''
        for c in binary:
            line += '#' if c == '1' else ' '
        answer.append(line)

    return answer