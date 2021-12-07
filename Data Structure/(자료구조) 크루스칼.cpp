#include "iostream"
using namespace std;
#define MAX 50
#define INF 1000

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

struct element {
	int key;
	int u;
	int v;
};

class heapType {
	element heap[MAX];
	int heap_size;

public:
	void init(heapType *h) {
		h->heap_size = 0;
	}

	int is_empty(heapType *h) {
		if (h->heap_size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	void insert_min_heap(heapType *h, element item) {
		int i;
		i = ++(h->heap_size);

		while ((i != 1) && (item.key < h->heap[i / 2].key)) {
			h->heap[i] = h->heap[i / 2];
			i = i / 2;
		}
		h->heap[i] = item;
	}

	element delete_min_heap(heapType *h) {
		int parent, child;
		element item, temp;

		item = h->heap[1];
		temp = h->heap[(h->heap_size)--];
		parent = 1;
		child = 2;
		while (child <= h->heap_size) {
			if ((child < h->heap_size) && (h->heap[child].key) > h->heap[child + 1].key) {
				child++;
			}
			if (temp.key <= h->heap[child].key) {
				break;
			}
			h->heap[parent] = h->heap[child];
			parent = child;
			child *= 2;
		}
		h->heap[parent] = temp;
		return item;
	}

	void insert_heap_edge(heapType *h, int u, int v, int weight) {
		element e;
		e.u = u;
		e.v = v;
		e.key = weight;
		insert_min_heap(h, e);
	}

	void insert_all_edges(heapType *h) {
		insert_heap_edge(h, 0, 1, 29);
		insert_heap_edge(h, 1, 2, 16);
		insert_heap_edge(h, 2, 3, 12);
		insert_heap_edge(h, 3, 4, 22);
		insert_heap_edge(h, 4, 5, 27);
		insert_heap_edge(h, 5, 0, 10);
		insert_heap_edge(h, 6, 1, 15);
		insert_heap_edge(h, 6, 3, 18);
		insert_heap_edge(h, 6, 4, 25);
	}

	void kruskal(int n) {
		unionFind unionFind;
		int edge_accepted = 0;
		heapType h;
		int vvset = 0;
		int uset;
		element e;

		init(&h);
		insert_all_edges(&h);
		unionFind.set_init(n);

		while (edge_accepted < (n - 1)) {
			e = delete_min_heap(&h);
			uset = unionFind.set_find(e.u);
			uset = unionFind.set_find(e.v);
			if (uset != vvset) {
				cout << e.u <<' '<<e.v<<' '<< e.key;
				edge_accepted++;
				unionFind.set_union(uset, vvset);
			}

		}
	}
};

int main() {
	heapType H;
	H.kruskal(7);
}