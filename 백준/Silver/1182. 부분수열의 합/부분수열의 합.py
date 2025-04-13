import itertools


def is_target_number(numbers, target_number):
    total_count = 0

    # 부분 수열의 길이
    for i in range(1, len(numbers) + 1):

        # i길이 만큼의 부분수열 생성
        for sub_numbers in itertools.combinations(numbers, i):
            sum_sub_numbers = sum(sub_numbers)

            if sum_sub_numbers == target_number:
                total_count = total_count + 1

    return total_count


N, S = map(int, input().split())

numbers = list(map(int, input().split()))

answer = is_target_number(numbers, S)

print(answer)