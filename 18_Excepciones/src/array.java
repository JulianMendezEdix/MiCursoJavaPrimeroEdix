import java.lang.ArrayIndexOutOfBoundsException;
public class array {
	public static void main(String args[]) {
		
		int nums[] = new int[3];
		try {
		nums[4]=25;}
		catch(ArrayIndexOutOfBoundsException e) {
			

			System.out.println(e.getClass().getName());
			return;
			
		}
		finally {System.out.println(nums);}

	}
}