#include <iostream>
#include <queue>
using namespace std;

int main()
{
	queue<int> myqueue;

	cout << "Empty Queue True/False:" << boolalpha << myqueue.empty() << endl;//Queue가 비어있다면 True를 반환하고, 비어있지 않다면 False를 반환한다. 이 문장에서 데이터 삽입이 이루어지지 않았으므로 True를 반환한다.

	myqueue.push(0);//Queue에 새로운 요소를 삽입한다. 데이터 0을 삽입한다.

	cout << "Empty Queue True/False:" << boolalpha << myqueue.empty() << endl;//Queue에 데이터 0이 삽입되었으므로 Queue는 비어있지 않은 상태가 된다. False를 반환한다.

	cout << "myqueueSize:" << myqueue.size() << "\n";//11줄에서 myqueue.push가 일어났으므로 데이터는 총 1개 삽입되었고 Size의 크기는 1이 반환된다.

	cout << "myqueueFront:" << myqueue.front() << "\n";//Queue에서 가장 오래된 요소를 반환한다. 즉 처음 들어온 요소를 반환하는데, 여기서push는 한 번 일어났으므로 처음 삽입된 데이터인 0이 반환된다.

	myqueue.push(1);//myqueue에 데이터 1을 삽입하였다.

	cout << "myqueueBack:" << myqueue.back() << "\n";//Queue에서 가장 최근에 삽입된 요소를 반환한다. 19줄에서 push를 이용해 데이터 1을 삽입하였으므로 1이 반환된다.

	cout << "myqueue contains: ";
	while (!myqueue.empty())//비어있기 전까지 실행
	{
		cout << ' ' << myqueue.front();
		myqueue.pop();//큐 내부에 요소들 중에 가장 오래된 요소를 제거한다.기존에  Queue를 구현할 때 반환을 하여 pop을 하였을 때 바로 출력을 하였는데, 이 Queue는 리턴값이 없기때문에 제대로 pop이 되었는지 확인하기 위해 front를 사용하였다.
	}
	cout << "\n";

	cout << "Empty Queue True/False:" << boolalpha << myqueue.empty() << endl;//Queue의 모든 요소를 pop하고, Queue의 내부가 비어있는지 확인

	return 0;
}