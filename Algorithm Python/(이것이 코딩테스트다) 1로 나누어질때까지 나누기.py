#수행코드 시간 측정
import time
start_time = time.time() #측정 시작

#본 코드 시작
n, k = map(int, input().split())
count = 0

# N에서 1을 빼거나, N을 K로 나누는 연산을 수행
while(n != 1):
  if n % k == 0:
    n /= k
    count += 1
  else:
    n -= 1
    count += 1
    
print(count)

end_time = time.time() #측정 종료
print("time:", end_time - start_time) #수행시간 출력
