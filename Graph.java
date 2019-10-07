import java.util.LinkedList;

// Java program to create an undirected graph using Adjacency list representation
// Adjacency list used for sparse graphs - process graphs in time proportional to number of vertices

public class Graph {
 private final int vertices; // number vertices in the graph
private LinkedList<Integer> adjList[]; //an array of adjacency lists;

public int V()
{
	return this.vertices;
}

public LinkedList<Integer> adj(int vertex)
{
	return this.adjList[vertex];
}
//constructor
public Graph(int V)
{
	this.vertices = V;
	
	adjList = new LinkedList[V]; //initiate the array with the size of number of vertices
	for(int i =0 ; i < V; i++)
	{
		adjList[i] = new LinkedList<>(); // creating a new list for each vertex
	}
}
 

public void addEdge( int source, int destination)
{
	adjList[source].add(destination); // add edge in list of source
	adjList[destination].add(source); // add edge in list of destination
	
}

//function to print adjacency list of the graph
public void printGraph()
{
	for(int i =0 ; i < vertices; i++)
	{
		LinkedList<Integer> current = adjList[i];
		System.out.println(current);
	}
}


}
