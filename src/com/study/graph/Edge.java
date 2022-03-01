package com.study.graph;

public class Edge implements Comparable<Edge> {
    private int distance;
    private String vertex;

    public Edge(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance - o.distance;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertex=" + vertex +
                ", distance='" + distance + '\'' +
                '}';
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getVertex() {
        return vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }
}
