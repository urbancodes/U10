package hospital.patients;

import java.time.LocalTime;

public class EmergencyPatient extends AbstractPatient{

	public EmergencyPatient(String patientName, LocalTime patientArrivalTime) {
		super(patientName, patientArrivalTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(AbstractPatient o) {
		if (o.getPriority() == TreatmentPriority.HIGH) {
			if(o.arrivalTime.compareTo(arrivalTime) < 0){return -1;}
			else{return 1;}
		}
		else {return 1;}
	}

	@Override
	public TreatmentPriority getPriority() {
		return TreatmentPriority.HIGH;
	}

	@Override
	public String getCatInfo() {
		return "T1/Red";
	}

}
