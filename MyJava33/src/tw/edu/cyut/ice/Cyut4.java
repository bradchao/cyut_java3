package tw.edu.cyut.ice;

public class Cyut4 {

	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Triangle();
		Shape s3 = new Rectangle();
		
		m1(s1); m1(s2); m1(s3);
	}
	static void m1(Shape s) {
		s.calArea();
	}

}
interface Shape {
	double calLegth();
	double calArea();
}
class Circle implements Shape {
	public double calLegth() {
		return 0;
	}
	public double calArea() {
		System.out.println("A");
		return 0;
	}
}
class Triangle implements Shape {
	public double calLegth() {
		return 0;
	}
	public double calArea() {
		System.out.println("B");
		return 0;
	}
}
class Rectangle implements Shape {
	public double calLegth() {
		return 0;
	}
	public double calArea() {
		System.out.println("C");
		return 0;
	}
}
