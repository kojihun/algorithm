def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        sum_arr = [x + y for x, y in zip(arr1[i], arr2[i])]
        answer.append(sum_arr)
    return answer