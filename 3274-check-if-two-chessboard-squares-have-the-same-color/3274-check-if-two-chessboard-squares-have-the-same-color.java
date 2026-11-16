class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
      int col1 = coordinate1.charAt(0) - 'a';
      int row1 = coordinate1.charAt(1) - '0';
      int col2 = coordinate2.charAt(0) - 'a';
      int row2 = coordinate2.charAt(1) - '0';

      int A = (col1 + row1) % 2; 
      int B = (col2 + row2) % 2;

      return A==B;    
    }
}