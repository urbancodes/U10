package hospital.heap;

import java.util.ArrayList;
import hospital.patients.AbstractPatient;

public class ArrayListHeap<T extends Comparable<T>> extends AbstractBinaryHeap<T>  {

	ArrayList<T> arrayList = new ArrayList<T>();
	
	
	
	@Override
	public int getSize() {
		
		return arrayList.size();
	}

	@Override
	public boolean isEmpty() {
		if(arrayList.isEmpty()){return true;}
		else{return false;}
	}

	@Override
	protected boolean isHeap(int parentIndex, int childIndex) {
		if(arrayList.get(parentIndex).compareTo(arrayList.get(childIndex)) <= 0){}
		return false;
	}

	@Override
	protected void swapNodes(int parentIndex, int childIndex) {
		T temp = arrayList.get(parentIndex);
		arrayList.set(parentIndex, arrayList.get(childIndex));
		arrayList.set(childIndex, temp);
		if (isHeap()) {}
	}

	@Override
	public void push(T patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
