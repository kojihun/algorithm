#include <iostream>
using namespace std;

class heap {

	int number = 7;
	int arr[7] = { 1,2,3,4,5,6,7};
	int root;
	int left;
	int right;

public:
	void swap() {
		for (int i = 1; i <= number; i++) {
			for (int i = 1; i <= number; i++) {
				root = i;
				left = root * 2;
				right = root * 2 + 1;
				if (left <= number&&right <= number) {
					if (arr[root - 1] < arr[left - 1] || arr[root - 1] < arr[right - 1]) {
						if (arr[left - 1] > arr[right - 1]) {
							int temp = arr[root - 1];
							arr[root - 1] = arr[left - 1];
							arr[left - 1] = temp;
						}
						else {
							int temp = arr[root - 1];
							arr[root - 1] = arr[right - 1];
							arr[right - 1] = temp;
						}
					}
				}
			}
		}
	}

	void sort(){
		for (int i = 1; i <= number; i++) {
			for (int i = 1; i <= number; i++) {
				root = i;
				left = root * 2;
				right = root * 2 + 1;

				if (left <= number&&right <= number) {
					if (arr[left-1] < arr[right-1]) {
						int temp = arr[left-1];
						arr[left-1] = arr[right-1];
						arr[right-1] = temp;
					}
				}
			}
		}
	}

	void display() {
		for (int i = 0; i < number; i++) {
			cout << arr[i] << ' ';
		}
		cout << endl;
	}
};


int main() {
	heap a;
	a.display();
	a.swap();
	a.display();
	a.sort();
	a.display();
}