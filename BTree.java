
public class BTree {
	
	BTreeNode root;
	int order;
	
	BTree(int order){
		this.order = order;
		root = new BTreeNode(order,true);
		diskWrite(root);
	}
	
	public void diskWrite(BTreeNode node){
		
	}
	
	/*
	 * It looks like this is suppose to work on the child of
	 * a node... Slide 39 on lecture15
	 */
	public void diskRead(BTreeNode xc) {
		
	}
	
	/*
	 * The return type isn't super clear in the slides
	 * so I just put void for now but it will return
	 * something
	 */
	public void search(BTreeNode x, long k){
		
	}
	
	public void splitChild(BTreeNode x, int i) {
		
	}
	
	public void insert(long k) {
		
	}
	
	public void insertNonfull(BTreeNode x, long k) {
		
	}
	
	public BTreeNode precedingChild(long key) {
		
	}
	
	public BTreeNode successorChild(long key) {
		
	}
	
	public long findPredecessorKey(long k, BTreeNode x) {
		
	}

	public long findSuccessorKey(long k, BTreeNode x) {
	
	}
	
	public void moveKey(long k, BTreeNode from, BTreeNode to) {
		
	}
	
	/*
	 * These two functions might be the same, but they
	 * were both listed in the slides...
	 */
	public void deleteKey(long k, BTreeNode x) {
		
	}
	
	public void removeKey(long k, BTreeNode x) {
		
	}
	
	public void mergeNodes(BTreeNode x, BTreeNode y) {
		
	}

}
