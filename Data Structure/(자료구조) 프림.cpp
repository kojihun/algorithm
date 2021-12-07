#include <iostream>
using namespace std;

#define true 1
#define false 0

#define MAX 7
#define INF 1000L

int weight[MAX][MAX] = {
	{0,29,INF,INF,INF,10,INF},
	{29,0,16,INF,INF,INF,15},
	{INF,16,0,12,INF,INF,INF},
	{INF,INF,12,0,22,INF,18},
	{INF,INF,INF,22,0,27,25},
	{10,INF,INF,INF,27,0,INF},
	{INF,15,INF,18,25,INF,0}
};

int selected[MAX];

int dist[MAX];

int get_min_vertex(int n) {
	int v, i;
	for (i = 0; i < n; i++) {
		if (!selected[i]) {
			v = i;
			break;
		}
	}
	for (i = 0; i < n; i++) {
		if (!selected[i] && (dist[i] < dist[v])) {
			v = i;
		}
	}
	return (v);
}

void prim(int s, int n) {
	int i, u, v;

	for (u = 0; u < n; u++) {
		dist[u] = INF;
		selected[u] = false;
	}
	dist[s] = 0;
	for (i = 0; i < n; i++) {
		u = get_min_vertex(n);
		selected[u] = true;
		if (dist[u] == INF) {
			return;
		}
		cout << u;
		for (v = 0; v < n; v++) {
			if (weight[u][v] != INF) {
				if (!selected[v] && weight[u][v] < dist[v]) {
					dist[v] = weight[u][v];
				}
			}
		}
	}
}

void main() {
	prim(0, MAX);
}