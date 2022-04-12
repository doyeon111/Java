package practice08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Card{
	String suit;
	String number;
	public Card(String suit, String number) {
		super();
		this.suit = suit;
		this.number = number;
	}
	@Override
	public String toString() {
		return "[suit=" + suit + ", number=" + number + "]";
	}
	
	
}

class CardDeck{
	ArrayList<Card> deck = new ArrayList<Card>();
	public CardDeck() {
		String []suit = {"Clubs","Diamonds","Hearts","Spades"};
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		for(int i=0; i<suit.length; i++) {
			for(int j=0; j<number.length; j++) {
				deck.add(new Card(suit[i], number[j]));
			}
		}		
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		return deck.remove(0);
	}
}

class Player{
	ArrayList<Card> list = new ArrayList<Card>();
	
	public void getCard(Card c) {
		list.add(c);
	}
	
	public void showCards() {
		System.out.println(list);
	}
	
	//갖고 있는 카드가 원페어인지 판별하여 그 숫자를 반환하는 메를 정의 
	//원페어가 아니면 -1을 반환
	public int isOnePair() {
		int re = -1;
		String num = "-1";
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).number.equals(list.get(j).number)) {
					System.out.println("원페어입니다."+list.get(i).number);
					num = list.get(i).number;
					break;
				}
			}
		}
		
//		"Jack","Queen","King","Ace"
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Jack", "11");
		map.put("Queen","12");
		map.put("King", "13");
		map.put("Ace",  "14");
		if(num.equals("Jack") || num.equals("Queen") || num.equals("King") || num.equals("Ace")) {
			num = map.get(num);
		}
		re = Integer.parseInt(num);
		return re;
	}
	
	
}


public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardDeck cardDeck = new CardDeck();
		System.out.println("처음 생성된 카드데크");
		System.out.println(cardDeck.deck);
		System.out.println();
		
		cardDeck.shuffle();
		System.out.println("랜덤하게 섞은후의 카드데크");
		System.out.println(cardDeck.deck);
		System.out.println();
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		for(int i=0; i<5; i++) {
			p1.getCard(cardDeck.deal());
			p2.getCard(cardDeck.deal());
		}		
		
		System.out.println("player1의 카드");
		p1.showCards();
		int score1= p1.isOnePair();
		System.out.println();
		
		System.out.println("player2의 카드");
		p2.showCards();
		int score2 = p2.isOnePair();
		System.out.println();
		
//		System.out.println("score1:"+score1);
//		System.out.println("score2:"+score2);
		
		if(score1 >  score2) {
			System.out.println("player1이 이겼습니다.");
		}else if(score1 < score2){
			System.out.println("player2가 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		
		
//		System.out.println("카드를 나눠준 후의 카드테크");
//		System.out.println(cardDeck.deck);
		
	}

}








