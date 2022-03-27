/*

*/

import java.util.Scanner;
abstract class Point{
	float Figure;
	abstract float Figure();
}
class Triangle extends Point{
	float width=0,height=0;
	void gett(float h, float w){
		height=h;
		width=w;
	}
	float Figure(){
		Figure=(height*width)/2;
		return Figure;
	}
		
}

class Circle extends Point{
	float radius=0,pi=3.1415f;
	void getc(float r){
		radius=r;
	}
	float Figure(){
		Figure=pi*radius*radius;
		return Figure;
	}
}
public class p23{
	public static void main(String args[]){
		System.out.print("\nEnter height and width for triangle: ");
		Scanner k = new Scanner(System.in);
		float th = k.nextFloat();
		float td = k.nextFloat();
		Triangle t = new Triangle();
		t.gett(th,td);
		float Figure = t.Figure();
		System.out.println("\nFigure of Triangle is: "+Figure);
		
		
		System.out.print("\nEnter radius for circle: ");
		float rad = k.nextFloat();
		Circle c = new Circle();
		c.getc(rad);
		Figure = c.Figure();
		System.out.println("\nFigure of Circle is: "+Figure);
		
	}
}
