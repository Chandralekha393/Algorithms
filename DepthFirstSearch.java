import java.util.Iterator;

public class DepthFirstSearch {
private  boolean[] marked;
//private  int[] edgeTo;  // array data structure with vertex indexed to keep track of the path to reach the vertex


public void DepthFirstSearch(Graph G, int source)
{
	marked = new boolean[G.V()];   //initializing the data structures
	//edgeTo = new int[G.V()];
	marked[source] = true;
	dfs(G,source); //call the recursive dfs function
	
}
	
private  void dfs(Graph G, int source)
{
	marked[source]= true; 
	System.out.println(source);
	Iterator<Integer> itr = G.adj(source).iterator();  //iterate for every vertex adjacent to source vertex
	while(itr.hasNext())
	{
		int n = itr.next();
		if(!marked[n])
		{
			dfs(G,n);    //recursively calling the dfs function on every vertex adjacent to vertex source
			//edgeTo[n]= source; 
			
		}
	}
}

public void hasPath(Graph G, int source, int destination)
{
	DepthFirstSearch(G, source);
	if(marked[destination]==false)
	{
		System.out.println("There is no path from "+ source + " to " + destination );
	}
	else 
	{
		System.out.println("There exists path from "+ source + " to " + destination);
	}
}

	
}
