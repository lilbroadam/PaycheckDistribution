import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 */

/* TO-DO LIST:
 * - Warning for vault that don't add up to 100%
 */

public class DistributionManager {
	
	public static double[] distribute(Paycheck paycheck, Vault vault) {
		double[] result = new double[vault.numAccounts()];
		
		
		
		return result;
	}
	
	// print the distribution amounts for the given paycheck into the given vault
	public static void printDistribution(Paycheck paycheck, Vault vault) {
		final double PAYCHECK_AMOUNT = paycheck.getPayAmmount();
		double paycheckRemaining = PAYCHECK_AMOUNT;
		double totalDistributed = 0.00;
		
		
		ArrayList<Account> accounts = vault.getAccounts();
		double[] accountDistribution = new double[accounts.size()];
		
		// flat rates are applied first
		for(int i = 0; i < accountDistribution.length; i++) {
			double distributionAmount = accounts.get(i).getFlatRate();
			
			accountDistribution[i] += distributionAmount;
			paycheckRemaining -= distributionAmount;
			totalDistributed += distributionAmount;
		}
		
		// perc rates are applied last
		double amountForPerc = paycheckRemaining;
		for(int i = 0; i < accountDistribution.length; i++) {
			System.out.print(paycheckRemaining);
			double distributionPercentage = accounts.get(i).getPercRate() / 100.0; // TODO round down to 2 decimal places
			double distributionAmount = amountForPerc * distributionPercentage;
			
			accountDistribution[i] += distributionAmount;
			paycheckRemaining -= distributionAmount;
			totalDistributed += distributionAmount;
			System.out.println(" -> " + accounts.get(i).getAbbreviation() + " -> " + paycheckRemaining);
		}
		
		// print
		
		System.out.println("$" + PAYCHECK_AMOUNT + " into " + vault.getName() + ":");
		System.out.println("----------");
		
		for(int i = 0; i < accountDistribution.length; i++) {
			System.out.printf("%3s: $%f\n", accounts.get(i).getAbbreviation(), accountDistribution[i]);
		}
		
		// print total distributed
		System.out.println("----------");
		System.out.println("Amount distributed: " + totalDistributed);
		// display any leftovers and ask the user how they want them to be distributed
		System.out.println("----------");
		System.out.println("Leftovers: " + paycheckRemaining);
	}
}
