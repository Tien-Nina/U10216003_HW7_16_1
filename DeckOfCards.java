public class DeckOfCards{
  
	int[] deck = new int[52];

	// Initialize cards
	DeckOfCards(){
		for (int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
	}
    
	// Shuffle the cards
	public void shuffle(){
		int index;
		int temp;	

		for(int i = 0; i < deck.length; i++){
			//Generate an index randomly
			index = (int)(Math.random() * deck.length);
			temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
			
	}

	// Display the first four cards
	public int[] Display(){ 
		int contentOfCard[] = new int[4];
		shuffle();
		for (int i = 0; i < 4; i++) {
			contentOfCard[i] = deck[i];
		}
		
		return contentOfCard;
	}
}
