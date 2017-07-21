import java.util.*;
public class A12_ObservableObserver{
	public static void main(String[] args){
		House h = new House(1000000);
		System.out.println(h);
		HousePriceObserver hpo1 = new HousePriceObserver("Jeck");
		HousePriceObserver hpo2 = new HousePriceObserver("Tom");
		HousePriceObserver hpo3 = new HousePriceObserver("Lily");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		h.setPrice(8888);
		System.out.println(h);
	}
}
class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){
		this.name = name;
	}
	public void update(Observable o, Object arg){
		System.out.println(((Float)arg).floatValue());
	}
	
}
class House extends Observable{
	private float price;
	public House(float price){
		this.price = price;
	}
	public float getPrice(){
		return this.price;
	}
	public void setPrice(float price){
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	public String toString(){
		return "house price: "+this.price;
	}
}

