import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1])); // 끝 지점을 기준으로 routes 정렬
        Set<Integer> cameras = new HashSet<>(); // 카메라가 설치된 구간을 저장할 Set

        for (int[] route : routes) {
            boolean cameraInstalled = false;
            for (int camera : cameras) {
                if (route[0] <= camera && camera <= route[1]) { // 카메라가 이미 구간 내에 설치되어 있는 경우
                    cameraInstalled = true;
                    break;
                }
            }

            if (!cameraInstalled) { // 구간 내에 설치된 카메라가 없는 경우
                cameras.add(route[1]); // 현재 구간의 끝 지점에 카메라 설치
            }
        }

        return cameras.size();
    }
}