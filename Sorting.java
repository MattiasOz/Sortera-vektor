import java.util.Arrays;

import javax.swing.JOptionPane;

public class Sorting {

	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		for(int i = 0; i < 100; i++) {
			numbers[i] = (int) Math.floor(Math.random() * 100);
		}
		Arrays.sort(numbers);
		String message = "";
		for (int i = 0; i < numbers.length; i++) {
			message += numbers[i] + " ";
			if ((i + 1) % 5 == 0) {
				message += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, message);
	}

	
}
