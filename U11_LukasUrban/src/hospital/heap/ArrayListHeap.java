package hospital.heap;

public class ArrayListHeap extends AbstractBinaryHeap {
	
	@Override
	public int getSize() {
		//if root != null calcSize(root) | else return 0
		//if getRightChildren != null +2
			//else if getLeftChildren != +1
				//else if there is marker calcSize(stageMarker)
					//else return val
		//set stageMarker on rightChild
		//calcSize(leftChild)
		return 0;
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
