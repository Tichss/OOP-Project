
public class Shop {
	
	private Item[] items;
	
	Shop(){
		int i=0;
		items[i]=	new Item("Life Crystal",15,0,15);
		items[i++]=	new Item("Bloody Armor",25,0,30);
		items[i++]=	new Item("Giant Helmet",40,0,50);
		items[i++]=	new Item("Hero's Health",70,0,120);
		items[i++]=	new Item("The God's Hands",130,0,250);
				
		items[i++]=	new Item("Small Knife",15,5,0);
		items[i++]=	new Item("Shadow Staff",30,15,0);
		items[i++]=	new Item("Curse Spellbook",55,30,0);
		items[i++]=	new Item("Spear of Fate",100,70,0);
		items[i++]=	new Item("The Devil's Trident",150,150,0);
		;
		
	}
	
}
