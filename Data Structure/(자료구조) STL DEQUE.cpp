#include <iostream>
#include <deque>
using namespace std;

int main() {
	deque<int> mydeque;
	int mydequeback;

	mydeque.push_front(100);//데큐의 앞에 데이터 100을 삽입한다.
	mydeque.push_front(200);//데큐의 앞에 데이터 200을 삽입한다.
	mydeque.push_front(300);//데큐으 앞에 데이터 300을 삽입한다.

	cout << "mydeque contains:";

	for (deque<int>::iterator it = mydeque.begin(); it != mydeque.end(); ++it) {//begin에서 end까지 begin을 1씩 증가시켜 데큐내에 있는 모든 요소를 출력한다.
		cout << ' ' << *it;
	}
	cout << "\n";//줄바꿈

	while (!mydeque.empty()) {//데큐가 비어있지 않다면 실행
		cout << "pop_front:" << ' ' << mydeque.front() << endl;//데큐의 제일 앞 요소를 출력한다.
		mydeque.pop_front();//데큐의 앞요소 pop
	}

	mydeque.push_back(10);//데큐의 제일 끝에 데이터 10을 삽입
	mydeque.push_front(15);//데큐의 제일 앞에 데이터를 15삽입
	mydeque.push_back(20);//10뒤에 데이터20을 삽입
	mydeque.push_front(25);//15앞에 데이터 25를 삽입
	mydeque.push_back(30);//20뒤에 데이터 30을 삽입


	cout << "mydeque contains:";

	for (deque<int>::iterator it = mydeque.begin(); it != mydeque.end(); ++it) {//처음부터 끝까지의 조건을 만들고 그조건에 따라 실행
		cout << ' ' << *it;//출력
	}
	cout << "\n";

	cout << "mydeque stores:" << (int)mydeque.size() << " number.\n";//데큐의 전체 크기를 출력한다

	while (!mydeque.empty()) {//데큐가 비어있지 않다면 출력

		cout << "pop back:" << mydeque.back() << endl;//deque의 가장 뒷 요소를 출력
		mydeque.pop_back();//데큐내에 가장 뒷 요소를 pop
	}

	return 0;
}