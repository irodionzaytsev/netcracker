
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
/**
 * Class Sort has a public method bubbleSort 
 * which may be used by other modules
 * to sort integers
 * @author Rodion
 *
 */
public class Sort {
	/**
	 * Tries to read integers from file input.txt
	 * Then sorts them and prints output to the console
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new File("input.txt"));
			List<Integer> arr = new ArrayList<Integer>();
			while (in.hasNext()) {
				arr.add(in.nextInt(10));
			}
			bubbleSort(arr);
			for (int k : arr) {
				System.out.println(k);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File input.txt not found\n" +
					"Put it in the same folder as the app.");
		} catch(InputMismatchException e) {
			System.err.println("Invalid input.\n" +
					"input.txt should only contain base 10 integers\n" +
					"in range [Integer.MIN_VALUE, Integer.MAX_VALUE]");
		} catch(Exception e) {
			System.err.println("Program failed\nPlease contact" +
					"the administrator");
		}
	}
	/**
	 * Performs a bubble sort on a given integer array
	 * Complexity: O(n^2)
	 * @param List of integers to be sorted
	 * @return List of sorted integers
	 */

	public static void bubbleSort(List<Integer> arr) {
		for (int i = 0; i < arr.size(); ++i) {
			for (int j = 0; j < arr.size() - 1; ++j) {
				if (arr.get(j) > arr.get(j + 1)) {
					int tmp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, tmp);
				}
			}
		}
	}
}
