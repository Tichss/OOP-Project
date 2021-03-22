
public class Shop {
	
	private Item[] items;
	
	Shop(){
		int i=0;
		items[i]=	new Item("SmallMedKit",15,0,15);
		items[i++]=	new Item("MediumMedKit",25,0,30);
		items[i++]=	new Item("HardMedKit",40,0,50);
		items[i++]=	new Item("HpOverPower",70,0,120);
		items[i++]=	new Item("DudeThatsHP",130,0,250);
				
		items[i++]=	new Item("KisKard",15,5,0);
		items[i++]=	new Item("Landzsa",30,15,0);
		items[i++]=	new Item("Baltácska",55,30,0);
		items[i++]=	new Item("Baltaa",100,70,0);
		items[i++]=	new Item("EXcalibur",150,150,0);
		;
		
	}
	
}
