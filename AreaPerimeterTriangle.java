package Java_Assignment4;
public class AreaPerimeterTriangle
{
	private int side1;
	private int side2;
	private int side3;
	private float area;
	private float peri;

	public AreaPerimeterTriangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void getArea() {
		area = (float) (0.5 * side1 * side2);

	}

	public void getPeri() {
		peri = side1 + side2 + side3;
	}

	public void display() {
		System.out.println("Triangle Area= " + area);
		System.out.println("Triangle Perimeter= " + peri);
	}

	public static void main(String[] args) {
		AreaPerimeterTriangle obj = new AreaPerimeterTriangle(3, 4, 5);
		obj.getArea();
		obj.getPeri();
		obj.display();

	}

	
}



