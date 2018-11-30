
/* A data type for individual bank accounts (checking, saving, etc)
 * The Quota data type contains the information about the accounts distribution rate
 */

/* TO-DO LIST:
 * - throw exception when adding an account who's name is already being used
 */

public class Account {
	private static int idCounter = 1;
	
	private String name;
	private Quota quota;
	private int idNum;
	
	public Account(String name, Double flat, Double perc) {
		this.name = name;
		quota = new Quota(flat, perc);
		assignIDnum();
	}
	
	public Account(String name) {
		this(name, null, null);
	}
	
	public void setFlatRate(double flat) { quota.setFlatRate(flat); }
	
	public void setPercRate(double perc) { quota.setPercRate(perc); }
	
	public String getName() { return name; }

	public double getFlatRate() { return quota.getFlatRate(); }
	
	public double getPercRate() { return quota.getPercRate(); }
	
	private void assignIDnum() {
		idNum = idCounter++;
		System.out.println(idNum);
	}
}
