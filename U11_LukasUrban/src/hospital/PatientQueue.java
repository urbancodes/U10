package hospital;

import java.util.ArrayList;
import hospital.heap.ArrayListHeap;
import hospital.patients.AbstractPatient;

public class PatientQueue<T> {

	ArrayListHeap<T> o = new ArrayListHeap<T>();
	
	public void addPatient(T patient){
		o.push(patient);
	}
	
	public ArrayList<String> processQueue(){
		return null;
		}
}