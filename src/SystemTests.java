public class SystemTests {
	public static void main(String[] args) {

		long heapSize = Runtime.getRuntime().totalMemory();
		System.out
				.println("Current heap size in MB: " + heapSize / 1024 / 1024);
	}
}
