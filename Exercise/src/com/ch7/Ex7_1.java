package com.ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		boolean isKwang = false;
		int num = 0;
		
		for(int i=0;i<CARD_NUM;i++) {
			num = (i%10)+1;
			
			if(i==0 || i==2 || i == 7)
				isKwang = true;
			else 
				isKwang = false;
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	public void shuffle() {
		for(int i=0;i<CARD_NUM;i++) {
			SutdaCard temp = cards[i];
			int idx = (int) (Math.random() * 19);
			
			cards[i] 	= cards[idx];
			cards[idx] 	= temp;
		}
	}
	public SutdaCard pick(int idx) {
		return cards[idx];
	}
	public SutdaCard pick() {
		int idx = (int)(Math.random()*19);
		return cards[idx];
	}
}

class SutdaCard {
	final int num;
	final boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
class Ex7_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck sutdaDeck = new SutdaDeck();
		
		System.out.println(sutdaDeck.pick(0));
		System.out.println(sutdaDeck.pick());
		sutdaDeck.shuffle();
		
		for(int i=0;i<sutdaDeck.cards.length;i++) {
			System.out.print(sutdaDeck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(sutdaDeck.pick(0));
	}
}
