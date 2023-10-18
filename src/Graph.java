import java.util.ArrayList;

public class Graph {
    private String nameOftheCity;
    private ArrayList<Vertex> vertexes;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected, ArrayList<Vertex> vertexes, String nameOftheCity){
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
        this.vertexes = vertexes;
        this.nameOftheCity = nameOftheCity;
    }

    public Vertex addVertex(Info data){
        Vertex newVertex = new Vertex(data);
        this.vertexes.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight){
        if(!this.isWeighted)
            weight = null;

        vertex1.addEdge(vertex2,weight);

        if(!this.isDirected)
            vertex2.addEdge(vertex1,weight);
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2){
        vertex1.removeEdge(vertex2);

        if(!this.isDirected)
            vertex2.removeEdge(vertex1);
    }

    public void removeVertex(Vertex vertex){
        this.vertexes.remove(vertex);
    }

    public Vertex GetVertexByValue(Info value){
        for(Vertex vertex : this.vertexes){
            if(vertex.GetData() ==value)
                return vertex;
        }

        return null;
    }
    public ArrayList<Vertex> GetVertexes(){
        return vertexes;
    }

    public boolean getIsDirected(){
        return isDirected;
    }

    public boolean getIsWeighted(){
        return isWeighted;
    }

    public void print(){
        for(Vertex vertex : this.vertexes)
            vertex.print(isWeighted);
    }

    public String getNameOftheCity() {
        return nameOftheCity;
    }
}
