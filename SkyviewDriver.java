
public class SkyviewDriver {
	public static void main(String[] args) {
		Skyview squareView = new Skyview(5,3);
		squareView.weComeInPeace();
		int[][] inCase = squareView.columnMajorOrder();
		System.out.println(squareView.toString());
	}//end main
}//end class
