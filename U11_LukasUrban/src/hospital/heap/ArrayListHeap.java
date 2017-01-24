package hospital.heap;

public class ArrayListHeap extends AbstractBinaryHeap {
	
	@Override
	public int getSize() {
		
		if (top() != null) return calcSize(top(), 0); 
		else return 0;

	}
	
	
	public int calcSize(T knot,int count) {
/*		
*		if getRightChildren != null count += 2
*		else if getLeftChildren != count++
*			else if there is marker calcSize(stageMarker)
*				else return val
*	set stageMarker on rightChild
*	calcSize(leftChild)
*/
		return count;
	}

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isHeap(int parentIndex, int childIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void swapNodes(int parentIndex, int childIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(Comparable element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comparable top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
