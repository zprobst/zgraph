package zgraph.graph;


public interface AStarHeuristic<T> {
    float getH(Node<T> start, Node<T> goal);
}