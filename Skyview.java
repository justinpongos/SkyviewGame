import java.util.Arrays;
public class Skyview {
	private int [][] view;
	
	public Skyview (int numRows, int numCols) {
		view = new int [numRows][numCols];
		int index = 1;
			for (int row = 0; row < view.length; row++) {
				for (int col = 0; col < view[row].length; col++) {
					view[row][col] = 3 * index;
					index++;
			}//end for
		}//end for
	}//end two argument constructor
	
	public void weComeInPeace() {
		int middleColumn = (int)Math.round(view[0].length / 2.0) -1;
			for (int row = 0; row < view.length; row++) {
				for (int col = 0; col < view[row].length; col++) {
					if (col == middleColumn) {
						view[row][col] = 42;
					}//end if
				}//end for
			}//end for
	}//end weComeInPeace method
	
	public int[][] columnMajorOrder() {
		int[][] newArray = new int[view.length][view[0].length];
			int newRow = 0;
			int newCol = 0;
			
			int rowLength = view.length;
			int colLength = view[0].length;
			
			for (int row = 0; row < rowLength; row++) {
				for (int col = 0; col < colLength; col++) {
					if(newRow < rowLength && newCol < colLength) {
						newArray[newRow][newCol] = view[row][col];
					}//end if
					newRow++;
					if (newRow == rowLength) {
						newRow = 0;
						newCol++;
					}//end if
				}//end for
			}//end for
			return newArray;
	}//end columnMajorOrder method
	
	public String toString() {
		String output = "";
		for (int row = 0; row < view.length; row++) {
			for (int col = 0; col < view[row].length; col++) {
				output = output + view[row][col] + " ";
			}//end for
			output = output + "\n";
		}//end for
		return output;
	}//end toString
}//end class
