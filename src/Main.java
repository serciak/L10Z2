public class Main {

    public static void main(String[] args) {
        AdjacencyMatrixGraph amg = new AdjacencyMatrixGraph(4);
        amg.addEdge(0, 1, 5);
        amg.addEdge(2, 1, 5);
        amg.addEdge(3, 0, 5);
        amg.addEdge(3, 2, 5);
        System.out.println(amg);
        amg.printGroupedVertices();
        amg.printLinkedVertices();
    }
}
