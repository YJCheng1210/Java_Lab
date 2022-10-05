public class Poker {
	// 52 cards with 4 different colors and 113 different numbers.
	String Player[][] = new String[13][4];
	//There are 52 cards.
	String Card[] = new String[52];

	public static void main(String args[]) {
		Poker pk = new Poker();

		pk.createCard();

		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 4; j++) {
				pk.createDetail(i, j);
			}
		}
		pk.printDetail();
	}

	/**
	 * Create cards: Spade, Heart, Diamond, Club
	 */
	void createCard(){		
		for (int j = 0; j < 52; j++){
			switch (j % 4){
			case 1:
				Card[j] = "Spade" +(j % 13 + 1);
				break;
			case 2:
				Card[j] = "Heart" +(j % 13 + 1);
				break;
			case 3:
				Card[j] = "Diamd" +(j % 13 + 1);
				break;
			case 0:
				Card[j] = "Club" +(j % 13 + 1);
				break;
			}
		}
	}

	// Create numbers
	void createDetail(int i, int j) {
		int x = 0;
		do {
			x = (int)(Math.random() * 52);
		} while (checkRepeat(x));

		saveDetail(x, i, j);
	}

	// Check if the number has been created.
	boolean checkRepeat(int x) {
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 4; j++) {
				if (Card[x] == Player[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	//Save the number
	void saveDetail(int x, int i, int j) {
		Player[i][j] = Card[x];
	}

	// Print the result
	void printDetail() {
		for(int j = 0; j < 4; j++) {
			for(int i=0; i<13; i++) {
				System.out.print(Player[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
