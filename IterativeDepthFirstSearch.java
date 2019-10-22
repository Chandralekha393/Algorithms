
import java.util.Iterator;
import java.util.Stack;

public class IterativeDepthFirstSearch {

	private boolean[] marked;
	
	
	public void IterativeDFS(Graph G, int source)
	{
		
		this.marked = new boolean[G.V()];
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		marked[source] = true;
		while(!stack.empty())
		{
			int v = stack.pop();
			System.out.println(v);
			marked[v] = true;
			Iterator<Integer> itr = G.adj(v).iterator();
			
			while(itr.hasNext())
			{
				
				int u = itr.next();
				if(!marked[u])
				{ 
					stack.push(u);
				}
			}
			
		}	
		
	}
	
	
	
	
	
	
	
}
