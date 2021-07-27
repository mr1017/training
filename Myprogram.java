package com.encap;

public class Myprogram {
int x,y,z;
public Myprogram()
{
	x=10;y=20;
}
public Myprogram(int x1,int y1) {
	x=x1;
	y=y1;
}
void add()
{
	z=x+y;
}
void disp() {
	System.out.println("Res "+z);
}
public static void main(String[] args) {
	Myprogram mp=new Myprogram();
	mp.add();mp.disp();
	Myprogram mp2= new Myprogram(20,20);
	mp2.add();mp2.disp();
}
}
