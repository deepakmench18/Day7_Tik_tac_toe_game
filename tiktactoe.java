public class Tik_tac_toe {

	public static void main(String[] args) {
		char [] [] gameBoard = {{' ','|',' ','|',' '},
				                {'-','+','-','+','-'},
				                {' ','|',' ','|',' '},
				                {'-','+','-','+','-'},
				                {' ','|',' ','|',' '}};
		for(char [] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
