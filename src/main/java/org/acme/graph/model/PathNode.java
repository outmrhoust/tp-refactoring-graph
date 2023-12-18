package org.acme.graph.model;


public class PathNode {
    private Vertex vertex;
    private double cost;
    private Edge reachingEdge;
    private boolean visited;

    public PathNode(Vertex vertex) {
        this.vertex = vertex;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public Edge getReachingEdge() {
        return reachingEdge;
    }
    public void setReachingEdge(Edge reachingEdge) {
        this.reachingEdge = reachingEdge;
    }

    public boolean isVisited() {
        return visited;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }





}
