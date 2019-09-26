import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Sort {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		List<Integer> arr = new ArrayList<Integer>();
		while (in.hasNextInt()) {
			arr.add(in.nextInt());
		}
		bubbleSort(arr);
		for (int k : arr) {
			System.out.println(k);
		}
		
	}
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
