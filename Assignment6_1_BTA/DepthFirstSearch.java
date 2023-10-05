public class DepthFirstSearch {       
       
	Node root;
	int nodeCount;
	int lHeight;
	int rHeight;
      
		public DepthFirstSearch()
        {               
			System.out.println("Call DFS with root node to do a Depth First Search.");
			nodeCount = 0;
			lHeight = 0;
			rHeight = 0;
        }//end Constructor
       
		public void DFS(Node node)        
        { 	
			if (node != null) 
               {
				System.out.println(node.getData());  
                nodeCount++;
                DFS(node.getlChild());
                DFS(node.getrChild());   
               }//end if   
			if (node != null)
				if(node.getlChild() == null && node.getrChild() == null)
					System.out.println("Nodes traversed: " + nodeCount);
			int height = 0;
			   if (node != null)
			       height = 1 + Math.max(DFS(node.getlChild()),DFS(node.getrChild()));

			
			
        }// end DFS
       /** 
        public void totalNodes()
        {
        	System.out.println("Nodes traversed: " + nodeCount);
        }//end totalNodes
     
        public int getTreeHeight(Node node) 
        {
            if(node == null) 
            {
                return -1;
            }
            return Math.max(getTreeHeight(node.getlChild()), getTreeHeight(node.getrChild()))+1;       
        }//end getNodeHeight*/
}//end class