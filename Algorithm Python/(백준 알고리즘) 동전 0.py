#본 코드 시작
n, k = map(int, input().split()) #동전의 종류N, 가치의 합K
li = [] #동전을 담기 위한 리스트
count = 0 #횟수

for _ in range(n):
  li.append(int(input()))

li.sort(reverse=True) #입력받은 리스트를 정렬하고 리버스해서 저장

for _ in li:
  count += k // _ #K에서 원소_가 나누어지는경우 몫을 카운터에 저장
  k = k%_ #나머지를 다시 K에 저장해서 리스트끝까지 수행

print(count) #결과값 출력
