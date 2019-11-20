public class coin {
	private String material;
	private int year;
	private String face;
	private int value;
	private static int numcoins=0;
	
	public coin(int v) {
		value = v;
		flipCoin();
		year();
		material();
		numcoins++;
	}
	public String getFace() {
		return face;
	}
	public static int getNumcoins() {
		return numcoins;
	}
	public int getValue() {
		return value;
	}
	public void flipCoin() {
		if (Math.random()<.5) {
			face = "heads";
		} else {
			face = "tails";
		}
	}
	public void year() {
		year = (int)(Math.random()*(2019-1652+1)+1652);
	}
	public int getYear() {
		return year;
	}
	public void material() {
		if (value == 1)
			material = "Copper";
		if (value == 5)
			material = "Nickel";
	}
	public String getMaterial() {
		return material;
	}
}
