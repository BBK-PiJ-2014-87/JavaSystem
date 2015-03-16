/**
 * Various interesting methods in Java.
 * @author Workstation
 *
 */
public class SystemTests {
	public static void main(String[] args) {

		long heapSize = Runtime.getRuntime().totalMemory();
		System.out
				.println("Current heap size in MB: " + heapSize / 1000 / 1000);
		
		
		long heapMaxSize = Runtime.getRuntime().maxMemory();
		System.out
		.println("Maximum heap size in MB: " + heapMaxSize / 1000 / 1000);

		long heapFreeSize = Runtime.getRuntime().freeMemory(); 
		System.out
		.println("Maximum heap size in MB: " + heapFreeSize / 1000 / 1000);
	}
}
