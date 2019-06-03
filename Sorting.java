import java.util.Arrays;

import javax.swing.JOptionPane;

/*Slumpar 100 nummer, sorterar dem, skriver ut dem*/

public class Sorting {

	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		for(int i = 0; i < 100; i++) {
			numbers[i] = (int) Math.floor(Math.random() * 100);
		}
		Arrays.sort(numbers);
		String message = "";
		for (int i = 0; i < numbers.length; i++) {
			message += numbers[i] + " ";	//uppdaterar "message" med nästan nummer och lägger till ett mellanrum
			if ((i + 1) % 5 == 0) {		//byter rad efter var femte siffra
				message += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, message);
	}

	
}
