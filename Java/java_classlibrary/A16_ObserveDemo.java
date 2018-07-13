/**
observer
observable

addObserver(Observer)
update(Observable, Object)
super.notifyObservers(Object)

super.setChanged()

floatValue()
**/
import java.util.*;
public class A16_ObserveDemo{
	public static void main(String[] args){
		House h = new House(1000);
		HousePriceObserver hpo1 = new HousePriceObserver("ObserverAAAA");
		HousePriceObserver hpo2 = new HousePriceObserver("ObserverBBBB");
		HousePriceObserver hpo3 = new HousePriceObserver("ObserverCCCC");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(230);
		System.out.println(h);
	}
}
class House extends Observable{
	private float price;
	House(float price){
		this.price = price;
	}
	public void setPrice(float price){
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	public String toString(){
		return "House  price is: "+this.price;
	}
}
class HousePriceObserver implements Observer{
	private String name;
	HousePriceObserver(String name){
		this.name = name;
	}
	public void update(Observable o,Object arg){
		System.out.println(this.name+"look this price is changed for:"+((Float)arg).floatValue());	
	}
}
