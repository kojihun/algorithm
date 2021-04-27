# 2중 반복문을 이용하는 예제
array = [3, 5, 1, 2, 4] # 5개의 데이터(N = 5)
count = 0

for i in array:
  for j in array:
    temp = i * j
    count = count + 1
    print(temp)
print("총 개수" , count) # 총 개수는 i * j 이므로 25의 결과가 나오게 된다.
# 시간 복잡도: O(N^2)
