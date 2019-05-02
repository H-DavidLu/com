package com.Indeed;
import java.util.*;
// Write a function that, given a board and a player starting position (represented as a row-column pair),
// returns all of the possible next positions for the player.

// findLegalMoves(board, (3, 1)) =>
//   (3, 0), (4, 1)

// findLegalMoves(board, (5, 3)) =>
//   (5, 2), (5, 4), (4, 3), (6, 3)

// findLegalMoves(board, (6, 0)) =>
//   (5, 0), (6, 1)

// findLegalMoves(board, (6, 4)) =>
//   (5, 4), (6, 3)

// findLegalMoves(board, (0, 0)) =>
//   (0, 1), (1, 0)

// findLegalMoves(board, (2, 2)) =>
//   [empty]
public class NextMoves
{

    ArrayList<String> movesList  = new ArrayList<>();

    public static void main(String[] args)
    {
        int[][] board = new int[][]
                {
                        {0,  0,  0, -1, -1},
                        {0,  0, -1,  0,  0},
                        {0, -1,  0, -1,  0},
                        {0,  0, -1,  0,  0},
                        {0,  0,  0,  0,  0},
                        {0,  0,  0,  0,  0},
                        {0,  0,  0,  0,  0},
                };

        int[] start1 = new int[] {3, 1};
        int[] start2 = new int[] {5, 3};
        int[] start3 = new int[] {6, 0};
        int[] start4 = new int[] {6, 4};
        int[] start5 = new int[] {0, 0};
        int[] start6 = new int[] {2, 2};

        NextMoves solution = new NextMoves();
        System.out. println( " This is the test: " + solution.findLegalMoves(0,0,board));

    }
    // findLegalMoves(board, (3, 1)) =>
    //   (3, 0), (4, 1)

    // findLegalMoves(board, (5, 3)) =>
    //   (5, 2), (5, 4), (4, 3), (6, 3)

    // findLegalMoves(board, (6, 0)) =>
    //   (5, 0), (6, 1)

    // findLegalMoves(board, (6, 4)) =>
    //   (5, 4), (6, 3)

    // findLegalMoves(board, (0, 0)) =>
    //   (0, 1), (1, 0)

    // findLegalMoves(board, (2, 2)) =>
    //   [empty]
    ArrayList findLegalMoves(int a, int b, int[][] board )
    {
        int rowLength = board.length;
        int columnLength =board[0].length;

        if(a==0 && b==0) // if the very first beginning
        {

            if(board[a][b+1] == 0)
            {
                movesList.add("["+ String.valueOf(a)+ "," + String.valueOf(b+1)+"]");
            }

            if(board[a+1][b] ==0)
            {
                movesList.add("["+ String.valueOf(a+1)+ "," + String.valueOf(b)+"]");
            }
        }
        else if(a==0 && b==columnLength-1)  // the position is at the last one of first row
        {
            if(board[a][b-1] == 0)
            {
                movesList.add("["+ String.valueOf(a)+ "," + String.valueOf(b-1)+"]");
            }

            if(board[a+1][b] ==0)
            {
                movesList.add("["+ String.valueOf(a+1)+ "," + String.valueOf(b)+"]");
            }
        }
        else if(a==rowLength-1 && b==0) // the position is at the first of last row
        {
            if(board[a][b+1] == 0)
            {
                movesList.add("["+ String.valueOf(a)+ "," + String.valueOf(b+1)+"]");
            }

            if(board[a-1][b] ==0)
            {
                movesList.add("["+ String.valueOf(a-1)+ "," + String.valueOf(b)+"]");
            }
        }
        else if(a==rowLength-1 && b== columnLength-1) // the position is at the last position of the board 2D
        {
            if(board[a][b-1] == 0)
            {
                movesList.add("["+ String.valueOf(a)+ "," + String.valueOf(b-1)+"]");
            }

            if(board[a-1][b] ==0)
            {
                movesList.add("["+ String.valueOf(a-1)+ "," + String.valueOf(b)+"]");
            }

        }

        else {

            if (board[a][b + 1] == 0) {
                movesList.add("[" + String.valueOf(a) + "," +
                        String.valueOf(b + 1) + "]");
            }

            if (board[a][b - 1] == 0) {
                movesList.add("[" + String.valueOf(a) + "," +
                        String.valueOf(b - 1) + "]");
            }

            if (board[a - 1][b] == 0) {
                movesList.add("[" + String.valueOf(a - 1) + "," +
                        String.valueOf(b) + "]");
            }

            if (board[a + 1][b] == 0) {
                movesList.add("[" + String.valueOf(a + 1) + "," +
                        String.valueOf(b) + "]");
            }
        }
        return movesList;
    }
}
