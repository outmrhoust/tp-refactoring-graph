package org.acme.graph.routing;

import org.acme.graph.model.Edge;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PathNode {

    private double cost;

    private Edge reachingEdge;

    private boolean visited;

    public PathNode(){
    }

    @JsonIgnore
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @JsonIgnore
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
