#수행코드 시간 측정
import time
start_time = time.time() #측정 시작

#본 코드 시작
data = input()
result = int(data[0])

# 곱하기 혹은 더하기 => 자신의 다음 숫자가 0또는 1일경우 더하는 연산을 수행하고, 그외의 숫자일 경우 곱하기 수행
for i in range(1, len(data)):
  num = int(data[i])
  if num <= 1 or result <= 1:
    result += num
  else:
    result *= num

print(result)

end_time = time.time() #측정 종료
print("time:", end_time - start_time) #수행시간 출력
