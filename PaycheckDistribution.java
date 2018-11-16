import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PaycheckDistribution {
	
	 /* C:   20%  GS:  20%
	  * LP:  20%  SS:  10%
	  * LTS: 20%  CRT: 10%
	  */
	
	public static void main(String args[]) {
		Vault vault = new Vault("Vault 1");
		vault.createAccount("C", null, 20.0);
		vault.createAccount("GS", null, 20.0);
		vault.createAccount("CAR", null, 20.0);
		vault.createAccount("SS", null, 10.0);
		
		vault.printVault();
		
		Account acc1 = new Account("LTS", 50.0, null);
		vault.addAccount(acc1);
		
		vault.printVault();
		
		acc1.setPercRate(10.0);
		
		vault.printVault();
		
		double[] distributed = DistributionManager.distribute(new Paycheck(100), vault);
		System.out.println(Arrays.toString(distributed));
	}
}
