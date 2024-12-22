
public class LargestNum {

	public static void main(String[] args) {

		System.out.println(largestDivisibleNumber());
		    }

		    public static int largestDivisibleNumber() {
		        for (int i = 9999; i > 0; i--) {
		            if (i % 10 == 0 && i % 13 == 0) {
		                return i;
		            }
		        }
		        return 0;
		    }
}
