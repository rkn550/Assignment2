
public class MatrixProblem {

	public static void main(String[] args) {
int[][] matrix = {{1,2},{3,4},{5,6}};	// Declaring and Initializing a 2x3 matrix
		
		int[][] transpose = new int[2][3];	// Creating a 3x2 matrix to store the transpose of given matrix
		
		int multiplication =1;	// Declaring and Initializing a variable to store the  product of elements of matrix
		
		for(int i = 0; i< transpose.length ; i++) {	// Transpose the matrix using nested for loop

			for(int j=0; j<transpose[i].length; j++) {
				transpose[i][j] = matrix[j][i];		// condition for transposing the matrix
			
			}
		
		}
		
		System.out.println("The transpose of the Given matrix is");	// Displaying the transposed matrix
		for(int i = 0; i< transpose.length ; i++) {
			System.out.println();
			for(int j=0; j<transpose[i].length; j++) {
				System.out.print(transpose[i][j]+ "   ");
				multiplication *= transpose[i][j];	//Calculating the product of element of matrix
			}
		}
		
		System.out.println("\nMultiplication of all the elements of Matrix : "+ multiplication);// Displaying the product of matrix


	}

}
