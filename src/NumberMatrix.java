
public class NumberMatrix {
	private int[][] matrix;

	/** Constructs a number matrix. */
	public NumberMatrix(int[][] m) {
		matrix = m;
	}

	/**
	 * Shifts each matrix element to the next position in row-major order and
	 * inserts the new number at the front. The last element in the last row is
	 * discarded.
	 * 
	 * @param num
	 *            the new number to insert at the front of matrix Postcondition:The
	 *            original elements of matrix have been shifted to the next higher
	 *            position in row-major order, and matrix[0][0] == num. The original
	 *            last element in the last row is discarded.
	 */
	public void shiftMatrix(int num) {
		int l = (matrix.length) * (matrix.length);
		int x = matrix.length;
		int[] feeder = new int[l + 1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				feeder[matrix.length * i + j + 1] = matrix[i][j];
			}
		}
		// System.out.println("breal");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// System.out.println(feeder[x * i + j]);
				matrix[i][j] = feeder[x * i + j];
			}
		}
		matrix[0][0] = num;
		// for (int i = 0; i < matrix.length; i++) {
		// for (int j = 0; j < matrix[i].length; j++) {
		// System.out.println(matrix[i][j]);
		// }
		// }
	}

	/**
	 * Rotates each matrix element to the next higher position in row-major order.
	 * Postcondition: The original elements of matrix have been shifted to the next
	 * higher position in row-major order, and matrix[0][0] == the original last
	 * element.
	 */
	public void rotateMatrix() {
		int l = (matrix.length) * (matrix.length);
		int x = matrix.length;
		int[] feeder = new int[l + 1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				feeder[matrix.length * i + j + 1] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = feeder[x * i + j];
			}
		}
		matrix[0][0] = feeder[l];
	}

	public int[][] getMatrix() {
		return matrix;
	}
}