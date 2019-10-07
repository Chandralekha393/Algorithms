import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	private  boolean[] marked; 
	//private  int[] edgeTo; // array data structure with vertex indexed to keep track of the path to reach the vertex
	private  int[] distTo;
	
	// bfs traversal starting at vertex source
	public  void bfs(Graph G, int source)
	{
		this.marked = new boolean[G.V()]; // initiating the arrays with size of vertices
		//this.edgeTo = new int[G.V()];     
		this.distTo = new int[G.V()]; 
		for(int i =0 ; i <G.V();i++)
		{
			distTo[i] = 0;
		}
		Queue<Integer> q = new LinkedList<>(); //Queue data structure to traverse the graph
		q.add(source);   // Add source vertex to the queue
		marked[source] = true; // mark the source vertex as visited 
		distTo[source] = 0;
		while(!q.isEmpty())
		{
			int v = q.poll();  
			//System.out.println(v);
		
			Iterator<Integer> itr = G.adj(v).iterator();   
			while(itr.hasNext())   //iterate over every vertex adjacent to this vertex
			{
				int n = itr.next();
				if(!marked[n])     // if the vertex has not been visited already
				{
					marked[n] = true;  // mark as visited
					q.add(n);		   // add the vertex to the queue
					//edgeTo[n] = v;
					distTo[n] = distTo[v]+1;
				}
			}
		}
		
	}
	
	public void distanceFromSource(Graph G, int source, int destination)
	{
		bfs(G,source);
		System.out.println(distTo[destination]);
		
	}
	
	
	public void hasPath(Graph G, int source, int destination)
	{
		bfs(G, source);
		if(marked[destination]==false)
		{
			System.out.println("There is no path from "+ source + " to " + destination );
		}
		else
		{
			System.out.println("There is path from "+ source + " to " + destination );
		}
	}
	
}
