package datastructures;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue implementation using Comparator Interface
class Sale 
{
	int sid;
	String item;
	double price;

	public Sale(int sid, String item, double price) {
		this.sid = sid;
		this.item = item;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	 public String toString() {
	        return  "Sid=" + sid + ", Item Name=" + item + ", Item Price=" + price ;
	    }
}

public class PriorityQueueSale {
	public static void main(String args[]) {
		Queue<Sale> pq = new PriorityQueue<>(idComparator);
		pq.add(new Sale(10,"Pen",2.5));
		pq.add(new Sale(5,"FlashDrive",6));
		pq.add(new Sale(8,"Mouse",25));
		pq.add(new Sale(6,"Head Phone",35));
		Iterator it = pq.iterator();
		System.out.println("List of Elements :" + pq);
		while(it.hasNext()){
			Sale ob = pq.poll();
		//	System.out.println(ob);
	}
		//Comparator anonymous class implementation
	    
}
	public static Comparator<Sale> idComparator = new Comparator<Sale>(){
        
        @Override
        public int compare(Sale s1, Sale s2) {
        	  	return (int) (s1.sid - s2.sid);
        }
    };
}
