
/* A data type for individual bank accounts (checking, saving, etc)
 * The Quota data type contains the information about the accounts distribution rate
 */

/* TO-DO LIST:
 * - throw exception when adding an account who's name is already being used
 */

public class Account {
	String name;
	Quota quota;
	
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, Double flat, Double perc) {
		this.name = name;
		quota = new Quota(flat, perc);
	}
	
	public void setFlatRate(double flat) { quota.setFlatRate(flat); }
	
	public void setPercRate(double perc) { quota.setPercRate(perc); }
	
	public String getName() { return name; }

	public double getFlatRate() { return quota.getFlatRate(); }
	
	public double getPercRate() { return quota.getPercRate(); }
}
