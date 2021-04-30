#본 코드 시작
n, snake = map(int, input().split()) #과일의 개수, 뱀의 길이
h = list(map(int, input().split())) #과일들의 크기
h.sort() #과일들의 크기를 정렬

for _ in h:
  if _ <= snake: #h의 원소들을 각각 비교하여
    snake += 1 #뱀의 길이와 같거나 그것보다 작을 경우 더하기연산

print(snake) #뱀의 최종 길이를 출력
