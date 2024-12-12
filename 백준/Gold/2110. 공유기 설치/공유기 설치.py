def is_possible(k):
    global N, C, distance

    count = 1  # 첫 번째 공유기는 항상 첫 번째 집에 설치
    last_position = distance[0]  # 첫 번째 집에 설치

    for i in range(1, N):
        # 현재 집과 마지막 설치된 집의 거리 차이가 k 이상이면 공유기를 설치
        if distance[i] - last_position >= k:
            count += 1
            last_position = distance[i]  # 마지막 설치 위치 업데이트

    return count >= C  # C개 이상의 공유기가 설치 가능하면 True


# N, C
N, C = map(int, input().split())

# 좌표
distance = [int(input()) for _ in range(N)]

# 파라메트릭 서치를 하기 위한 정렬 수행
distance.sort()

# 이진 탐색 범위
left = 1  # 최소 거리 1부터 시작
right = distance[-1] - distance[0]  # 가장 큰 집들 사이 거리

# 이진 탐색 (파라메트릭 서치)
while left <= right:
    mid = (left + right) // 2  # 중간 거리

    if is_possible(mid):  # mid 이상으로 설치가 가능하면
        left = mid + 1  # 더 큰 거리로 탐색
    else:
        right = mid - 1  # 더 작은 거리로 탐색

# 최종 결과 출력
print(right)
