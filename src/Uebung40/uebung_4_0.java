package Uebung40;

public class uebung_4_0 {

	public static void main(String[] args) {

		int maximum = 8099;
		int summe = 0;

		for (int i = 1; summe <= maximum; i = i + 1) {
			System.out.println(i+". Summe: "+ summe +" (+"+i+")" + " von " + maximum);
			summe = summe + i;
		}

	}

}
