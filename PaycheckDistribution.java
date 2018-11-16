import java.util.ArrayList;
import java.util.HashMap;

public class PaycheckDistribution {
	// testing git pushing
	public static void main(String args[]) {
		final int FLAT = 0;
		final int PERC = 1;
		
		/* distributionRates[FLAT] = flat rates (applied first)
		 * distributionRates[PERC] = percentage rates (remaining amount after flat rates)
		 */
		double[][] distributionRates = new double[PERC + 1][];
		String[][] distributionNames = new String[PERC + 1][];
		
		
		 /* PERC
		  * --------
		  * C:   20%  GS:  20%
		  * LP:  20%  SS:  10%
		  * LTS: 20%  CRT: 10%
		  * 
		  */
		
		AccountManager accMgr = new AccountManager();
		accMgr.addAccount(20.0, "C", "GS", "LP", "LTS");
		accMgr.addAccount(10.0, "SS", "CRT");
		System.out.println(accMgr.toString());
		
//		
//		distribute(paycheck, accountManger);
//		distribute(100.0, accMgr);
		
//		HashMap<String, Double> distributionMap = new HashMap<String, Double>();
//		ArrayList<String> accNames = new ArrayList<String>();
//		
//		assignDisRate(20.0, "C", distributionMap, accNames);
//		assignDisRate(20.0, "GS", distributionMap, accNames);
//		
//		System.out.println(distributionMap.toString());
		
		
//		assignDisRate(distributionRates[PERC], distributionNames[PERC], 20.0, "EMG");
//		assignDisRate(distributionRates[PERC], distributionNames[PERC], 20.0, "EMG", 2);
//		ArrayList distributionRate = new ArrayList();
//		ArrayList[][] table1 = new ArrayList[10][10];
//		ArrayList[] table2 = new ArrayList[2];
//		ArrayList<ArrayList> table3 = new ArrayList<ArrayList>();
	}
	
	public static void assignDisRate(double rate, String accName, HashMap<String, Double> map, ArrayList<String> accNames) {
		map.put(accName, rate);
		accNames.add(accName);
	}
	
	/* double[] disRateArr -> the array that contains the distribution rates to be altered
	 * String[] disRateNames -> the array that contains the name of the accounts 
	 * double rate -> the rate to be added
	 * String acc -> the name of the account being added
	 */
	public static void assignDisRate(double[] distRateArr, String[] distRateNames, double rate, String acc) {
		
	}
	
	public static void assignDisRate(double[] distRateArr, String[] distRateNames, double rate, String acc, int index) {
		
	}
}
