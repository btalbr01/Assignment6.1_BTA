/**
 * A class to perform a recursive depth-first search of a binary tree
 * @author Ben Albright
 *
 */

public class DepthFirstSearch {       
       
	Node root;
	int nodeCount;
	int height;
	int maxHeight;
	int lCount;
	int rCount;
      
	/**
	 * Prints that the DFS is beginning and instantiates the variables.
	 */
		public DepthFirstSearch()
        {               
			System.out.println("Call DFS with root node to do a Depth First Search.");
			nodeCount = 0;
			height = 0;
			maxHeight = 0;
			lCount = 0;
			rCount = 0;
        }//end Constructor
       
		/**
		 * Recurs through the tree, prints out the value at each node,
		 * then prints out the total number of nodes traversed and the tree's depth.
		 * @param node
		 */
		public void DFS(Node node)        
        { 	
			/**
			 * Checks if a node is a leaf. If it's not null, prints the data,
			 * increments the nodeCount and height.
			 */
			if (node != null) 
               {
				System.out.println(node.getData());  
				nodeCount++;
                height++;
                DFS(node.getlChild());
                DFS(node.getrChild()); 
                
                /**
                 * Checks if the right node is not null. 
                 * If true, increments the right node counter.
                 */
                if (node.getrChild() != null)
                	rCount++; //end if
                
                /**
                 * Checks if the left node is not null. 
                 * If true, increments the left node counter.
                 */
                if (node.getlChild() != null)
                	lCount++; //end if
               }//end if   
			
			
			/**
			 * Checks if the node is null. If true, decrements 
			 * the height variable.
			 */
			if (node == null)
				height--; //end if
			
			/**
			 * Compares maxHeight to height. 
			 * If maxHeight < height, maxHeight set to height.
			 */
			if(maxHeight < height)
				{
				maxHeight = height;
				}//end if
			
			/**
			 * Compares the left and right node counters to the total node count.
			 * +1 is added to account for the root.
			 * If they are equal, the tree has been traversed and 
			 * the total nodes and tree height are printed.
			 */
			if ((nodeCount == (lCount + rCount + 1)))
				{
				System.out.println("Nodes traversed: " + nodeCount + "\n" + "Tree height: " + (maxHeight + 1));
				}//end if
        }// end DFS
}//end class