package com.encap;

public class Overloading {
int max(int x, int y) {
	System.out.println("Method int invoked");
	if(x>y)
		return x;
	else
		return y;

}
double max(double x,double y) {
	System.out.println("Method double invoked");
	if(x>y)
		return x;
	else
		return y;
	

}

public static void main(String[] args) {
	Overloading ov = new Overloading();
	System.out.println(ov.max(1, 2));
}
}
