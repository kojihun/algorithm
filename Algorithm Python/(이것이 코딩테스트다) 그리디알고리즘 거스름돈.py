#수행코드 시간 측정
import time
start_time = time.time() #측정 시작

#본 코드 시작
money = 1260
count = 0

# 큰 단위의 화폐부터 차례대로 확인
array = [500, 100, 50, 10]

for i in array:
  count += money // i
  money = money % i

print(count)

end_time = time.time() #측정 종료
print("time:", end_time - start_time) #수행시간 출력
