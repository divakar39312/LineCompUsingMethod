package com.Bridgelabz;

public class LineCompUsingmethod {
	public static void TwopointDistCal()
	{
		int x1=3;
		int x2=7;
		int y1=7;
		int y2=2;
		double dist=Math.floor(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		System.out.println(dist);
	}

public static void main(String[] args) {
	TwopointDistCal();

		
		
}
}