package com.mimaraslan;									

public class Araba {
	private Yakit yakit; //Composition Komposizyon Bile�im

//--------------------------------------------------
	public Araba() {
		this.yakit = new Yakit();
	}
//--------------------------------------------------	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete ge�ti.");
	}
	
}


