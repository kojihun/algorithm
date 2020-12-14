#include <iostream>
using namespace std;
#define MAX 5

class Queue {
	int front;
	int rear;
	int queue[MAX];

public:
	void init_queue() {
		front = 0;
		rear = 0;
	}

	void enqueue(int data) {
		if (full()) {
			cout << "Full Queue" << endl;
			return;
		}
		
		rear = (rear + 1) % MAX;
		queue[rear] = data;
	}

	void dequeue() {
		if (empty()) {
			cout << "Empty Queue" << endl;
			return;
		}

		front = (front + 1) % MAX;
		queue[front] = 0;
	}

	bool empty() {
		if (front == rear) {
			return true;
		}
		else {
			return false;
		}
	}

	bool full() {
		if ((rear+1)%MAX==front) {
			return true;
		}
		else {
			return false;
		}
	}

	int size() {
		if (front <= rear) {
			return rear - front;
		}
		else {
			return (MAX - 1) - front + rear + 1;
		}
	}

	void print() {
		for (int i = front + 1; i != (rear + 1) % MAX; i = (i + 1) % MAX) {
			cout << queue[i] << " ";
		}
		cout << endl;
	}
};

int main() {
	Queue q;

	q.init_queue();

	for (int i = 0; i < MAX - 1; i++) {
		q.enqueue(i + 1);
	}
	q.print();

	cout << "size:" << q.size() << endl;

	q.dequeue();
	q.dequeue();

	q.print();

	q.enqueue(100);
	q.enqueue(101);

	q.print();
};