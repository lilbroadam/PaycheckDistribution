import java.util.ArrayList;

/* Vaults contain and manage accounts.
 * Vaults can have different configurations of accounts
 * Paychecks will be distributed among the accounts in a vault
 * The vault makes sure that the sum percentage of all accounts adds up to 100%, 
 * 	if not, it will treat the total as 100%
 */

/* TO-DO LIST:
 * - make createAccount(String name) and figure out how to manage an account with no quota
 * - need a way to manage the accounts inside the vault. ex: change account name or rate 
 */

public class Vault {
	String name;
	ArrayList<Account> accounts = new ArrayList<Account>();

	public Vault(String name) {
		this.name = name;
	}
	
	public void createAccount(String name, Double flat, Double perc) {
		accounts.add(new Account(name, flat, perc));
	}
	
	public void addAccount(Account ... account) {
		for(Account acc : account)
			accounts.add(acc);
	}
	
	public int numAccounts() { return accounts.size(); }
	
	public void printVault() {
		System.out.println(name + ":");
		System.out.println("----------");
		for(int i = 0; i < accounts.size(); i++) {
			Account acc = accounts.get(i);
			System.out.printf("%3s: $%.2f | %.2f%%\n", acc.getName(), acc.getFlatRate(), acc.getPercRate());
		}
	}
}
