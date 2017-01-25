package hospital.patients;

import java.time.LocalTime;

public class SlightlyInjuredPatient extends AbstractPatient {

	public SlightlyInjuredPatient(String patientName, LocalTime patientArrivalTime) {
		super(patientName, patientArrivalTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(AbstractPatient o) {
		if (o.getPriority() == TreatmentPriority.LOW) {
			if(o.arrivalTime.compareTo(arrivalTime) < 0){return -1;}
			else{return 1;}
		}
		else{return -1;}
	}

	@Override
	public TreatmentPriority getPriority() {
		return TreatmentPriority.LOW;
	}

	@Override
	public String getCatInfo() {
		return "T3/Green";
	}

}
