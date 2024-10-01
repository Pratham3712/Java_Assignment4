package Java_Assignment4;

public class ClassCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarData("98765", "Xuv", 1200000, "Praduny");
		car.displayCarData();
		System.out.println("==================================");
		Car car1 = new Car();
		car1.setCarData("977765", "Tuv", 1300000, "Sanjay");
		car1.displayCarData();
		System.out.println("==================================");
		Car car2 = new Car();
		car2.setCarData("238765", "Kuv", 1400000, "Dinkar");
		car2.displayCarData();

	}

}
