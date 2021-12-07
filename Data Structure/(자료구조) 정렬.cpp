#include <iostream>
using namespace std;

void bubble() {
	int arr[4] = { 3,2,4,1 };
	int size = (sizeof(arr)/sizeof(int));
	int count = 1;

	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			for (int i = 0; i < size; i++) {
				cout << arr[i] << " " ;
			}
			cout << endl;
		}
		cout << "¹öºíÁ¤·Ä:" << count << endl;
		count++;
	}
}

void selection() {
	int arr[4] = { 4,3,2,1 };

	int temp;
	int count = 1;

	for (int i = 0; i < 4; i++) {
		for (int j = i + 1; j < 4; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				count++;

				for (int i = 0; i < 4; i++) {
					cout << arr[i];
				}
				cout << endl;
			}
		}
	}
	cout << endl;
	cout << "count:" << count;
}

void insertion() {
	int arr[4] = { 3,4,2,1 };
	int temp;

	for (int i = 1; i < 4; i++) {
		for (int j = i; j > 0; j--) {
			if (arr[j - 1] > arr[j]) {
				temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
		for (int i = 0; i < 4; i++) {
					cout << arr[i];
				}
				cout << endl;
			}
		}
	}
	for (int i = 0; i < 4; i++) {
		cout << arr[i];
	}
}

void quickSort(int* arr, int left, int right) {
   int i = left;
   int j = right;
   int pivot = arr[(left + right) / 2];
   cout << "pivot: " << pivot << endl;

   while (i < j)
   {
      while (arr[i] < pivot)
         i++;
      while (arr[j] > pivot)
         j--;

      // swap
      cout << "swap " << arr[i] << ", " << arr[j] << endl;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      for (int a = 0; a < 9; a++)
         cout << arr[a] << " ";
      cout << endl << "========================" << endl;
      i++;
      j--;
   }
   
   // divide
   if (left < j)
   {
      cout << "divide left" << endl;
      quickSort(arr, left, j);
   }
   if (i < right)
   {
      cout << "divide right" << endl;
      quickSort(arr, i, right);
   }
}

int main() {
	//bubble();
	//selection();
	//insertion();
	int* arr = new int[9];
	for (int i = 0; i < 9; i++)
		cin >> arr[i];

	quickSort(arr, 0, 8);
}
