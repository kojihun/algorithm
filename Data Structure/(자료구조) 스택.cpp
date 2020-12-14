#include <iostream>
using namespace std;
#define MAX 5

class Stack {

public:
	typedef struct StackType {
		int top;
		int stack[MAX];
	}StackType;

	void init(StackType *s) {
		s->top = -1;
	}

	int empty(StackType *s) {
		return s->top == -1;
	}
	int full(StackType *s) {
		return s->top == MAX - 1;
	}

	void push(StackType *s, int item) {
		if (full(s)) {
			cout << "Stack overflow";
			exit(1);
		}
		else {
			s->stack[++(s->top)] = item;
		}
	}
	int pop(StackType *s) {
		if (empty(s)) {
			cout << "Stack underflow";
			exit(1);
		}
		else {
			return s->stack[s->top--];
		}
	}
};

int main(void) {

	Stack s;
	Stack::StackType a;

	s.init(&a);

	s.push(&a, 1);
	s.push(&a, 2);
	s.push(&a, 3);
	s.push(&a, 4);
	s.push(&a, 5);

	cout << s.pop(&a);
	cout << s.pop(&a);
	cout << s.pop(&a);
	cout << s.pop(&a);
	cout << s.pop(&a);
	cout << s.pop(&a);

};