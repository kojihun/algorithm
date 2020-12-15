#include <iostream>
#include <list>
using namespace std;

int main() {
	list<int>mylist;

	mylist.push_front(100);//리스트의 앞에 데이터가 100을 삽입한다.

	mylist.clear();//리스트를 클리어한다.

	mylist.push_front(200);//리스트에 데이터가 200을 삽입한다.

	cout << "mylist contains:";
	for (list<int>::iterator it = mylist.begin(); it != mylist.end(); ++it) {//begin부터end까지 리스트를 출력한다.
		cout << ' ' << *it;
	}
	cout << "\n";

	mylist.push_back(100);//리스트의 뒤에 데이터가 100을 삽입한다.
	mylist.push_back(200);//그 다음 노드에 데이터가 200을 삽입한다.

	cout << "mylist contains:";
	while (!mylist.empty()) {//리스트가 비어있지 않다면
		cout << ' ' << mylist.front();//리스트의 제일 앞 요소를 리턴한다.
		mylist.pop_front();//리스트의 앞요소를 뽑아낸다.
	}

	cout << "\n";

	cout << "mylistSize:" << mylist.size() << endl;//리스트의 사이즈를 표시한다.
	return 0;
}
