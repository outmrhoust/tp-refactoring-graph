package org.acme.graph.routing;

import org.acme.graph.model.Edge;
import org.acme.graph.model.Path;
import org.acme.graph.model.Vertex;

import java.util.*;

public class PathTree {
    private Map<Vertex,PathNode> nodes;

    public PathTree(Vertex origin){
        this.nodes = new HashMap<Vertex, PathNode>();

        PathNode pathNode = new PathNode();
        pathNode.setCost(0.0);
        pathNode.setReachingEdge(null);
        pathNode.setVisited(false);
        this.nodes.put(origin, pathNode);
    }

    public PathNode getNode(Vertex vertex){
        return this.nodes.get(vertex);
    }

    public PathNode getOrCreateNode(Vertex vertex){
        PathNode pathNode;
        if(this.nodes.containsKey(vertex)){
            pathNode =  this.nodes.get(vertex);
        } else {
            pathNode = new PathNode();
            this.nodes.put(vertex, pathNode);
        }
        return pathNode;
    }

    public Path getPath(Vertex destination){
        assert isReached(destination): "Destination is not reached";

        List<Edge> result = new ArrayList<>();

        Edge current = this.getNode(destination).getReachingEdge();
        do {
            result.add(current);
            current = this.getNode(current.getSource()).getReachingEdge();
        } while (current != null);

        Collections.reverse(result);
        return new Path(result);
    }


    public Set<Vertex> getReachedVertices(){
        return this.nodes.keySet();
    }

    public boolean isReached(Vertex destination){
        return this.getOrCreateNode(destination).getReachingEdge() != null;
    }
}
