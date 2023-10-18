public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex start, Vertex end, Integer weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
    public Vertex GetStart() {
        return this.start;
    }
    public Vertex GetEnd() {
        return this.end;
    }
    public Integer GetWeight() {
        return this.weight;
    }
}
