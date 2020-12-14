#include <iostream>
using namespace std;

//구조체생성
typedef struct DoubleLinkedList {
	struct DoubleLinkedList *llink; //이전 노드를 가르킬 구조체 포인터
	int data; //데이터필드
	struct DoubleLinkedList *rlink; //다음 노드를 가르킬 구조체 포인터
}DoubleLinkedList;

//노드생성
DoubleLinkedList *createNode(int data) {
	DoubleLinkedList *newNode;//새로운 구조체 포인터생성
	newNode = new DoubleLinkedList;

	newNode->llink = NULL; //왼쪽 링크필드에 NULL삽입
	newNode->data = data; //데이터 삽입
	newNode->rlink = NULL; //오른쪽 링크필드에 NULL삽입

	return newNode; //구조체 포인터 반환
}

//노드 삽입
void addNode(DoubleLinkedList **phead, DoubleLinkedList *newNode) {//인자로 헤드노드와 새로운 노드를 받는다.
	if (*phead == NULL) {//헤드포인터가 가리키는게 없을경우 실행
		*phead = newNode;//헤드포인터에 새로운 노드의 주소를 넣는다.
	}
	else {
		newNode->rlink = *phead;//새로운 노드의  rlink에 헤드포인터가 가르키는 노드의 주소를 넣는다.
		(*phead)->llink = newNode;//새로운 노드의 llink에 새로운 노드의 주소를 넣는다.
		*phead = newNode;
	}
}

//노드 삭제
void removeNode(DoubleLinkedList **phead){//헤드포인터를 인자로 받는다.
	DoubleLinkedList *p = *phead; //삭제할 노드의 주소를 담을 구조체포인터변수

	*phead = (*phead)->rlink;//헤드포인터에 삭제할 노드의 다음노드의 주소를 넣는다.
	free(p);//삭제할 노드 동적할당 해제
}


//리스트 출력함수
void display(DoubleLinkedList *list) {
	while (list != NULL) {
		cout<< list->data<<"->";
		list = list->rlink;
	}
	cout << "NULL" << "\n";
}


int main() {
	DoubleLinkedList *list = NULL;

	addNode(&list, createNode(10));
	addNode(&list, createNode(20));
	addNode(&list, createNode(30));
	addNode(&list, createNode(40));
	addNode(&list, createNode(50));

	display(list);


	removeNode(&list);
	display(list);

	return 0;

}