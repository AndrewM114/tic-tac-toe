
import java.util.Scanner;

public class Control 
{
	
	public void player1Move (int row, int col )
	{
		//add 0 to two-dimensional array in correct spot
		TicTacToe[row][col] = 0;
		
	}
	public void player2Move (int row, int col)
	{
		//add 1 to two- dimensional array in correct spot
		int X = 1;
		X = TicTacToe [row][col];
	}
	public void undo();
	{
		//remove previous turn
	}
	
	
}
