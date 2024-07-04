class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        if (isEqual(matrix, target)) {
            return true;
        }
        
        for (int i = 0; i < 3; i++) {
            rotateMatrix(matrix);
            if (isEqual(matrix, target)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Helper method to rotate the matrix by 90 degrees clockwise
    private void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
    // Helper method to check if two matrices are equal
    private boolean isEqual(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
