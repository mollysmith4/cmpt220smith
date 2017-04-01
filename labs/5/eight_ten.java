
public class eight_ten {

	public static void main(String[] args) {
		//Create 4-by-4 matrix
		int[][] matrix = new int[4][4];
		
		/**Generate 1s and 0s for each row and column
		 * and track largest row index with the most ones*/
		 int largestRI = 0;
		 int largest = -1;
		 for (int i = 0; i < matrix.length; i++) {
			 int rowCount = 0;
			 for (int k = 0; k < matrix[i].length; k++) {
				 matrix[i][k] = (int)(Math.random() * 2);
				 rowCount += matrix[i][k];
			 }
			 if (rowCount > largest) {
				 largestRI = i;
				 largest = rowCount;
			 }
		 }
		 
		 //Find the largest column index
		 int largestCI = 0;
		 largest = -1;
		 for (int k = 0; k < matrix[0].length; k++) {
			 int columnCount = 0;
			 for (int i = 0; i < matrix.length; i++) {
				 columnCount += matrix[i][k];
			 }
			 if (columnCount > largest) {
				 largest = columnCount;
				 largestCI = k;
			 }
		 }
		 
		 //Display the matrix
		 for (int i = 0; i < matrix.length; i++) {
			 for (int k = 0; k < matrix[i].length; k++) {
				 System.out.printf("%d", matrix[i][k]);
			 }
			 System.out.printf("\n");
		 }
		 
		 System.out.println("The largest row index: " + largestRI);
		 System.out.println("The largest column index: " + largestCI);

	}

}
