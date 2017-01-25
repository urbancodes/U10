package hospital.patients;

import java.time.LocalTime;

public class SeverelyInjuredPatient extends AbstractPatient {

	int injuryRating;
	
	public SeverelyInjuredPatient(String patientName, LocalTime patientArrivalTime, int injuryRating) {
		super(patientName, patientArrivalTime, injuryRating);
		this.injuryRating = injuryRating;
	}

	@Override
	public int compareTo(AbstractPatient o) {
		if (o.getPriority() == TreatmentPriority.LOW) {return 1;}
		
		if (o.getPriority() == TreatmentPriority.MEDIUM) {
			if(o.getInjuryRating() == injuryRating){
				if(o.arrivalTime.compareTo(arrivalTime) < 0){return -1;}
				else{return 1;}
			}
			if(o.getInjuryRating() > injuryRating){
				return -1;
			}
			else{
				return 1;
			}
		}
		else {return -1;}
	}

	@Override
	public TreatmentPriority getPriority() {
		return TreatmentPriority.MEDIUM;
	}

	@Override
	public String getCatInfo() {
		return "T2/Yellow-" + injuryRating;
	}

}
