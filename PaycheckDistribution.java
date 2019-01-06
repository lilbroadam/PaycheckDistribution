import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PaycheckDistribution {
	
	 /* C:   20%  GS:  20%
	  * LP:  20%  SS:  10%
	  * LTS: 20%  CRT: 10%
	  */
	
	public static void main(String args[]) {
		// initialize a vault
		Vault vault = new Vault("Vault 1");
		vault.createAccount("Checking", "C", null, 20.0);
		vault.createAccount("General savings", "GS", null, 20.0);
		vault.createAccount("Car", "CAR", null, 20.0); // TODO, default name is abbreviation
		vault.createAccount("Special savings", "SS", null, 10.0);
		
		vault.printVault();
		
		// add an account object to the vault
		Account acc1 = new Account("Longterm savings", "LTS", 50.0, null);
		vault.addAccount(acc1);
		
		vault.printVault();
		
		acc1.setPercRate(20.0);
		
		vault.printVault();
		
		// add an anonymous object to the vault
		vault.addAccount(new Account("Certificate", "CRT", null, 10.0));
		
		vault.printVault();		
	}
}
