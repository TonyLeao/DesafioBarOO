package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		double feedingTotal = feeding();
		
		if (feedingTotal > 30) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double feeding() {
		double beersTotal = (double)beer * 5.0;
		double softDrinkTotal = (double)softDrink * 3.0;
		double barbecueTotal = (double)barbecue * 7.0;
		
		return beersTotal + softDrinkTotal + barbecueTotal;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
}
