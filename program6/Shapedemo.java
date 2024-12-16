package program6;

import java.util.Scanner;

abstract class Shape {
	public abstract float calculatePerimeter();

	public abstract float calculateArea();
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculatePerimeter() {
		return (float) (2 * Math.PI * radius);
	}

	@Override
	public float calculateArea() {
		return (float) (2 * Math.PI * radius * radius);
	}
}

class Triangle extends Shape {
	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public float calculatePerimeter() {
		return (float) (a + b + c);
	}

	@Override
	public float calculateArea() {
		float s = (float) (a + b + c / 2.0);
		float area = (float) Math.sqrt(s * (s + a) * (s + b) * (s + c));
		return area;
	}
}

public class Shapedemo {

	public static void main(String[] args) {
		int option = 0;
		int radius;
		int a;
		int b;
		int c;
		float perimeter;
		float area;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Circle");
		System.out.println("2.Triangle");
		System.out.println("enter your option:");
		option = scanner.nextInt();
		Shape Shape;
		switch (option) {
		case 1:
			System.out.println("enter radius");
			radius = scanner.nextInt();
			Shape = new Circle(radius);
			perimeter = Shape.calculatePerimeter();
			area = Shape.calculateArea();
			System.out.println("Perimeter:" + perimeter);
			System.out.println("Area:" + area);
			break;
		case 2:
			System.out.println("enter 3 sides of a Triangle:");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			Shape = new Triangle(a, b, c);
			perimeter = Shape.calculatePerimeter();
			area = Shape.calculateArea();
			System.out.println("Perimetere:" + perimeter);
			System.out.println("Area:" + area);
			break;
		}
	}
}