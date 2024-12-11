def binary_search(arr, target):
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return 1
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return 0

def main():
    N = int(input())  # 첫 번째 입력: N
    nArray = list(map(int, input().split()))  # 두 번째 입력: nArray
    
    nArray.sort()  # nArray를 오름차순 정렬
    
    M = int(input())  # 세 번째 입력: M
    mArray = list(map(int, input().split()))  # 네 번째 입력: mArray
    
    result = []
    for target in mArray:
        result.append(binary_search(nArray, target))
    
    print(" ".join(map(str, result)))

if __name__ == "__main__":
    main()
