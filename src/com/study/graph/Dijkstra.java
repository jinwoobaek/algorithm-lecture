package com.study.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijkstra {
    public HashMap<String, Integer> dijkstra(HashMap<String, ArrayList<Edge>> graph, String start) {
        // 거리 값 초기화
        HashMap<String, Integer> distances = new HashMap<String, Integer>();
        for (String key : graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // 우선 순위 큐 초기화
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
        priorityQueue.add(new Edge(distances.get(start), start));

        while (!priorityQueue.isEmpty()) {
            Edge seletedEdge = priorityQueue.poll();

            for (Edge edge : graph.get(seletedEdge.getVertex())) {
                if (edge.getDistance() + seletedEdge.getDistance() < distances.get(edge.getVertex())) {
                    distances.put(edge.getVertex(), edge.getDistance() + seletedEdge.getDistance());
                    priorityQueue.add(new Edge(edge.getDistance() + seletedEdge.getDistance(), edge.getVertex()));
                }
            }
        }
        return distances;

    }
}
