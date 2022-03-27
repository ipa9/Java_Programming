/*
Given a class Point, an abstract class Figure, skeletons of classes Triangle, Quadrilateral,
Circle, implement the following.
Make Triangle, Quadrilateral, Circle extend Figure class.
Implement methods in Triangle, Quadrilateral, Circle:
• Constructors with following parameters:
o Triangle - three vertices (points) as parameters.
o Quadrilateral - four vertices (points) as parameters.
o Circle - point of the center and double value of the radius.
Ensure figures are not degenerative.
All of them must have non-zero area.
Quadrilateral is also must be convex.
If a figure is not good, throw an IllegalArgumentException.
Note: A non-degenerative convex quadrilateral is divided into four non-degenerative
triangles by its diagonals. Note: double calculations are not completely accurate, use
error delta, where applies.
• public Point centroid()
Return the centroid of the figure.
Centroid refers to center of mass of the plain figure, not the baricenter.
In other words it should be "area centroid".
• public boolean isTheSame(Figure figure)
Two figures are considered to be the same only:
o if they have the same type
o and if they coincide (e.g. have same vertices).
Note: order of the vertices has not to be the same.
Note: double calculations are not completely accurate, use error delta, where applies.
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
