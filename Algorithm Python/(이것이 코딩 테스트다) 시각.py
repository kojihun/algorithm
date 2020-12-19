# (이것이 코딩 테스트다) 시각
# author kojihun

h = int(input())
count = 0

for i in range(h+1):
    for j in range(60):
        for k in range(60):
            if '3' in str(i) + str(j) + str(k):
                count = count + 1
print(count)