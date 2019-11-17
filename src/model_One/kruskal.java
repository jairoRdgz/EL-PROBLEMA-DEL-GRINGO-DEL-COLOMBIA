package model_One;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kruskal{

  static class Edge implements Comparable<Edge> {
    int u, v, cost;
    // 'u' and 'v' are nodes indexes and 'cost' is the cost of taking this edge.
    public Edge(int u, int v, int cost) {
      this.u = u;
      this.v = v;
      this.cost = cost;
    }
    // Sort edges based on cost.
    @Override
    public int compareTo(Edge other) {
      return cost - other.cost;
    }
  }

  // Inputs
  private int n;
  private List<Edge> edges;

  // Internal
  private boolean solved;
  private boolean mstExists;

  // Outputs
  private Edge[] mst;
  private long mstCost;

  // edges - A list of undirected edges.
  // n     - The number of nodes in the input graph.
  public kruskal(List<Edge> edges, int n) {
    if (edges == null || n <= 1) throw new IllegalArgumentException();
    this.edges = edges;
    this.n = n;
  }

  // Gets the Minimum Spanning Tree (MST) of the input graph or null if no MST.
  public Edge[] getMst() {
    kruskals();
    return mstExists ? mst : null;
  }

  // Gets the Minimum Spanning Tree (MST) cost or null if no MST exists.
  public Long getMstCost() {
    kruskals();
    return mstExists ? mstCost : null;
  }

  private void kruskals() {
    if (solved) return;

    // Heapify operation in constructor transforms list of edges into a binary heap in O(n)
    PriorityQueue<Edge> pq = new PriorityQueue<>(edges);
    UnionFind uf = new UnionFind(n);

    int index = 0;
    mst = new Edge[n - 1];

    while (!pq.isEmpty()) {
      // Use heap to poll the next cheapest edge. Polling avoids the need to sort
      // the edges before loop in the event that the algorithm terminates early.
      Edge edge = pq.poll();

      // Skip this edge to avoid creating a cycle in MST.
      if (uf.connected(edge.u, edge.v)) continue;

      // Include this edge
      uf.union(edge.u, edge.v);
      mstCost += edge.cost;
      mst[index++] = edge;

      // Stop early if we found a MST that includes all the nodes.
      if (uf.size(0) == n) break;
    }

    mstExists = (uf.size(0) == n);
    solved = true;
  }

  // Union find data structure
  private static class UnionFind {
    private int[] id, sz;

    public UnionFind(int n) {
      id = new int[n];
      sz = new int[n];
      for (int i = 0; i < n; i++) {
        id[i] = i;
        sz[i] = 1;
      }
    }

    public int find(int p) {
      int root = p;
      while (root != id[root]) root = id[root];
      // Path compression
      while (p != root) {
        int next = id[p];
        id[p] = root;
        p = next;
      }
      return root;
    }

    public boolean connected(int p, int q) {
      return find(p) == find(q);
    }

    public int size(int p) {
      return sz[find(p)];
    }

    public void union(int p, int q) {
      int root1 = find(p);
      int root2 = find(q);
      if (root1 == root2) return;
      if (sz[root1] < sz[root2]) {
        sz[root2] += sz[root1];
        id[root1] = root2;
      } else {
        sz[root1] += sz[root2];
        id[root2] = root1;
      }
    }
  }
}

  /* Usage example: */

  

    // Output:
    // MST cost: 14
    // Used edge (9, 8) with cost: 0
    // Used edge (2, 8) with cost: 1
    // Used edge (6, 7) with cost: 1
    // Used edge (0, 4) with cost: 1
    // Used edge (4, 5) with cost: 1
    // Used edge (3, 7) with cost: 2
    // Used edge (4, 3) with cost: 2
    // Used edge (1, 3) with cost: 2
    // Used edge (1, 2) with cost: 4

  

