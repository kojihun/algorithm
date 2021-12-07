//인접 행렬로 표현
#include "iostream"
using namespace std;
#define MAX 5

int visited[MAX];

class QueueType {
	int front = -1;
	int rear = -1;
	int count = 0;
	int queue[MAX];

public: 

	void init(QueueType *q) {
		q->front = q->rear = -1;
	}

	int is_empty(QueueType *q) {
		return (q->front == q->rear);
	}

	void enqueue(QueueType *q, int n) {
		q->queue[count] = n;
		rear++;
		count++;
	}

	int dequeue(QueueType *q) {
		front++;
		return q->queue[front];
	}

};

class GraphType {
	int n; //정점의 개수
	int adj_mat[MAX][MAX];
	int count;

public:
	//그래프 초기화
	void graph_init(GraphType *g) {
		int r, c;
		g->n = 0;
		for (r = 0; r < MAX; r++) {
			for (c = 0; c < MAX; c++) {
				g->adj_mat[r][c] = 0;
			}
		}
	}
	//화면 출력
	void graph_display(GraphType *g) {
		for (int r = 0; r < MAX; r++) {
			for (int c = 0; c < MAX; c++) {
				cout << g->adj_mat[r][c]<<' ';
			}
			cout << endl;
		}
	}

	//정점 삽입 연산
	void insert_vertex(GraphType *g, int v) {
		if (((g->n) + v) > MAX) {
			cout << "정점 개수 초과";
			return;
		}
		g->n += v;
	}

	//간선 삽입 연산
	void insert_edge(GraphType *g, int start, int end) {
		if (start >= g->n || end >= g->n) {
			cout << "정점 번호 오류";
			return;
		}
		g->adj_mat[start][end] = 1;
		g->adj_mat[end][start] = 1;
	}

	void onewayInsert_edge(GraphType *g, int start, int end) {
		if (start >= g->n || end >= g->n) {
			cout << "정점 번호 오류";
			return;
		}
		g->adj_mat[start][end] = 1;
	}

	//깊이 탐색
	void dfs_mat(GraphType *g, int v) {
		int w;
		visited[v] = count;
		cout << v;
		for (w = 0; w < g->n; w++) {
			if (g->adj_mat[v][w] && !visited[w]) {
				dfs_mat(g, w);
			}
		}
	}

	void bfs_mat(GraphType *g, int v) {
		int w;
		QueueType q;
		q.init(&q);
		visited[v] = true;
		cout << v;
		q.enqueue(&q, v);
		while (!q.is_empty(&q)) {
			v = q.dequeue(&q);
			for (w = 0; w < g->n; w++) {
				if (g->adj_mat[v][w] && !visited[w]) {
					visited[w] = true;
					cout << w;
					q.enqueue(&q, w);
				}
			}
		}
	}

	void is_connect(GraphType *g) {
		int i;
		count = 0;

		for (i = 0; i < g->n; i++) {
			if (!visited[i]) {
				count++;
				dfs_mat(g, i);
			}
		}
	}
};

class unionFind {
	int parent[MAX];
	int num[MAX];

public:

	void set_init(int n) {
		for (int i = 0; i < n; i++) {
			parent[i] = -1;
			num[i] = 1;
		}
	}

	int set_find(int v) {
		int p, s, i = -1;
		for (i = v; (p = parent[i]) >= 0; i = p) {
			s = i;
		}
		for (i = v; (p = parent[i]) >= 0; i = p) {
			parent[i] = s;
		}
		return s;
	}
	void set_union(int s1, int s2) {
		if (num[s1] < num[s2]) {
			parent[s1] = s2;
			num[s2] += num[s1];
		}
		else {
			parent[s2] = s1;
			num[s1] += num[s2];
		}
	}
};

void main() {
	GraphType Graph;
	Graph.graph_init(&Graph);

	Graph.insert_vertex(&Graph, 5);
	Graph.insert_edge(&Graph, 0, 1);
	Graph.insert_edge(&Graph, 0, 2);
	Graph.insert_edge(&Graph, 0, 4);
	Graph.insert_edge(&Graph, 1, 0);
	Graph.insert_edge(&Graph, 1, 2);
	Graph.insert_edge(&Graph, 2, 0);
	Graph.insert_edge(&Graph, 2, 1);
	Graph.insert_edge(&Graph, 2, 3);
	Graph.insert_edge(&Graph, 2, 4);
	Graph.insert_edge(&Graph, 3, 2);
	Graph.insert_edge(&Graph, 3, 4);
	Graph.insert_edge(&Graph, 4, 0);
	Graph.insert_edge(&Graph, 4, 2);
	Graph.insert_edge(&Graph, 4, 3);

	Graph.graph_display(&Graph);

	Graph.dfs_mat(&Graph, 0);
	Graph.bfs_mat(&Graph, 0);
	Graph.is_connect(&Graph);



	/*Graph.graph_init(&Graph);

	Graph.insert_vertex(&Graph, 5);
	Graph.onewayInsert_edge(&Graph, 0, 1);
	Graph.onewayInsert_edge(&Graph, 1, 2);
	Graph.onewayInsert_edge(&Graph, 2, 0);
	Graph.onewayInsert_edge(&Graph, 2, 1);
	Graph.onewayInsert_edge(&Graph, 2, 3);

	Graph.graph_display(&Graph);*/
}