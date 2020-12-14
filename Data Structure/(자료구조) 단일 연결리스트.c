#include <stdio.h>
#include <stdlib.h>

typedef struct ListNode {
	int data;//데이터필드
	struct ListNode *link;//링크필드
}ListNode;

//노드생성함수
ListNode *createNode(int data) {//노드를 생성하는 함수
	ListNode *newNode = (ListNode*)malloc(sizeof(ListNode));
	if (newNode == NULL) {
		printf("동적할당 에러\n");
		return;
	}

	newNode->data = data;//데이터삽입
	newNode->link = NULL;//링크필드NULL

	return newNode;
}
//노드삽입함수

void insertNode(ListNode **phead, ListNode *newNode) {//노드를 삽입하는 함수
	if (*phead == NULL) {
		*phead = newNode;
	}
	else {
		newNode->link = *phead;
		*phead = newNode;
	}
}

void display(ListNode *phead) {
	while (phead != NULL) {
		printf("%d", phead->data);
		phead = phead->link;
		printf("\n");
	}
	printf("\n");
}

int main() {
	ListNode *list = NULL;
	insertNode(&list, createNode(10));
	insertNode(&list, createNode(11));
	insertNode(&list, createNode(12));
	display(list);

	return 0;
}