def solution(arr):
    answer = []
    for element in arr:
        if not answer or answer[-1] != element:
            answer.append(element)
    return answer