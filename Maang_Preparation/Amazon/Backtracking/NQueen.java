package Maang_Preparation.Amazon.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {


  public List<List<String>> solveNQueens(int n){
      char[][] board = new char[n][n];

      for(int i=0; i<n; i++)
        Arrays.fill(board[i], '.');

      List<List<String>> result = new ArrayList<>();
      backtrack(n, board, 0, result);
      return result;

  }

  //backtracking
  private void backtrack(int n, char[][] board, int row, List<List<String>> result){
    if (row == n) {
        result.add(constructBoard(board));
        return;
    }

    for(int col = 0; col < n; col++){
      if (canPlaceQueen(board, row, col)) {
          board[row][col] = 'Q';
          backtrack(n, board, row + 1, result);
          board[row][col] = '.';
      }
    }
  }

    private boolean canPlaceQueen(char[][] board, int row, int col){
      //column check
        for(int i=row - 1; i>=0; i--)
          if (board[i][col] == 'Q')
            return false;

      //diagonal  
      for(int i = row - 1, j= col - 1; i>=0 && j>=0; i--, j--)
          if (board[i][j] == 'Q')
              return false;

      //anti-diagonal
      for(int i = row - 1, j= col + 1; i>=0 && j<board.length; i--, j++)
          if (board[i][j] == 'Q')
              return false;

      return true;
    }


  


  //2.construct board
  private List<String> constructBoard(char[][] board){
    List<String> result = new ArrayList<>();

    for(int i=0; i<board.length; i++)
      result.add(new String(board[i]));
        return result;
  }


  public static void main(String[] args) {
    int n = 4;

    NQueen queen = new NQueen();

    List<List<String>> solutions = queen.solveNQueens(n);

    for(List<String> solution: solutions){
      for(String row: solution){
        System.out.println("[" +row + "]");
      }
      System.out.println();
    }
  }

}



/*
 * Approach: Backtrack algorithm which help us to find the different options to find best solutions
 * Time complexity: O(n!) where n is the number of queens. This is because for each row, we have N options to place a queen, and for each option, we recursively try to place the remaining queens.
 * 
 * Space complexity: O(n^2) for the board and O(n!) for the recursion stack which goes up to N levels deep. Therefore, the overall space complexity is O(N^2).
 *  
 * Explanation:
 * 1. We start by initializing an empty board and placing the first queen in the first row and
 * first column. We then recursively try to place the remaining queens in the subsequent rows.
 * 2. For each row, we try to place the queen in each column. If we find a valid placement
 *  (i.e., no queen is attacking the new queen), we recursively try to place the remaining queens
 *  in the subsequent rows.
 * 3. Bactrcking function: 
 * 4. Safety check: 
 * Check the column above the current position.
 * Check the upper left diagonal.
 * Check the upper right diagonal.
 * 5. Construct board: Convert the board configuration to a list of strings.
 * 6. Main method
 * 
 * Testcases: as impossible to place queens
 * 1. 4x4 Board
 * 2. 5x5 Board
 * 3. 6x6 Board
 * 
 * Edge Testcases:
 * 1. 1x1 Board - only one Q
 * 2. 2x2 Board - 0
 * 3. 3x3 Board - 0
 * 4. Large board(10x10) - 724 solutions 
 * 5. Empty or invalid board size - 0
 * 
 * 
 * Interview Questions:
 * 1. Can you explain the N-Queens problem?
 * Answer: The N-Queens problem involves placing N queens on an N×N chessboard so that no two queens can attack each other. This means no two queens can be in the same row, column, or diagonal.
 * 2. What approach did you use to solve the N-Queens problem?
 * Answer: I used a backtracking algorithm to solve the N-Queens problem. This approach involves to place the queens one row at a time, checking for conflicts at each step and backtracking if necessary.
 * 
 * 
 * 
 * 
 */