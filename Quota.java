
/* A data type to manage the quotas for accounts
 * Flat rates are applied first when distributing paychecks, then percentages
 */

public class Quota {
	double flatRate;
	double percRate;
	
	public Quota(Double flat, Double perc) {
		if(flat != null)
			flatRate = flat;
		if(perc != null)
			percRate = perc;
	}

	public void setFlatRate(double flat) { flatRate = flat; }
	
	public void setPercRate(double perc) { percRate = perc; }
	
	public double getFlatRate() { return flatRate; }
	
	public double getPercRate() { return percRate; }
}
