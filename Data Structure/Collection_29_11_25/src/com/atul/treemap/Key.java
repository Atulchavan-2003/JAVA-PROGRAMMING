package com.atul.treemap;



public class Key implements Comparable{
	Integer key;
	
	Key(int key){
		this.key =key;
	}
	
	@Override
	public int compareTo(Object o) {
		Key k = (Key)o;
		return this.key-k.key;
	}

	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}
	
}
