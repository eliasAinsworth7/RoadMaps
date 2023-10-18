import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {
    private Info data;
    private LinkedList<Edge> edges;

    public Vertex(Info inputData){
        this.data = inputData;
        this.edges = new LinkedList<Edge>();
    }
    public void addEdge(Vertex EndV, Integer weight) {
        this.edges.add(new Edge(this, EndV, weight));
    }
    public void removeEdge(Vertex EndV) {
        this.edges.removeIf(edge -> edge.GetEnd().equals(EndV));
    }
    public Info GetData() {
        return this.data;
    }
    public LinkedList<Edge> GetEdges() {
        return this.edges;
    }
    public void print(boolean showWeight) {
        String message = "";
        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).GetStart().GetData() + "-->";
            }
            message += this.edges.get(i).GetStart().GetData() + " ";

            if (showWeight)
                message += " (" + this.edges.get(i).GetWeight() + ") ";
            if (i != this.edges.size() - 1)
                message += ", ";
        }
        System.out.println(message);
    }
}
