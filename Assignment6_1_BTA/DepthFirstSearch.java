public class DepthFirstSearch {       
       
	Node root;
	int nodeCount;
	int height;
	int maxHeight;
      
		public DepthFirstSearch()
        {               
			System.out.println("Call DFS with root node to do a Depth First Search.");
			nodeCount = 0;
			height = 0;
			maxHeight = 0;
        }//end Constructor
       
		public void DFS(Node node)        
        { 	
			if (node != null) 
               {
				System.out.println(node.getData());  
                nodeCount++;
                height++;
                DFS(node.getlChild());
                DFS(node.getrChild()); 
               }//end if   
			
			if (node == null)
				height--;
			
			if(maxHeight < height)
			{
				maxHeight = height;
			}
	
			if (node != null && node.getlChild() == null && node.getrChild() == null)
				{
				System.out.println("Nodes traversed: " + nodeCount + "\n" + "Tree height: " + (maxHeight + 1));
				}
        }// end DFS
}//end class