#수행코드 시간 측정
import time
start_time = time.time() #측정 시작

#본 코드 시작
n = int(input()) 
data = list(map(int, input().split()))
data.sort()

result = 0 #총 그룹의 수
count = 0 #현재 그룹에 포함된 모함가의 수

for i in data:
  count += 1
  if count >= i:
    result += 1
    count = 0
    
print(result)

end_time = time.time() #측정 종료
print("time:", end_time - start_time) #수행시간 출력
