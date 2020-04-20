package leetcode419;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char[][] board = {{'X','.','X'},{'.','X','.'},{'X','.','X'}};
		
		System.out.println(Arrays.deepToString(board));
		
		CountNumberOfShipFunction solution = new CountNumberOfShipFunction();
		
		System.out.println("number of ships: " + solution.countBattleships(board));
	}
}
