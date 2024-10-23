import java.util.Scanner;

abstract class InputScanner {
    Scanner sc = new Scanner(System.in);
}

abstract class Shape extends InputScanner {
    double dim1, dim2;

    Shape() {
        System.out.print("Enter first dimension: ");
        this.dim1 = sc.nextDouble();
        System.out.print("Enter second dimension: ");
        this.dim2 = sc.nextDouble();
    }

    abstract double printArea();
}

class Rectangle extends Shape {
    Rectangle() {
        super();
    }

    double printArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super();
    }

    double printArea() {
        return 0.5 * dim1 * dim2;
    }
}

class Circle extends Shape {
    Circle() {
        super();
        this.dim2 = 0;      }

    double printArea() {
        return 3.14 * dim1 * dim1;
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("Rectangle:");
        Shape figref = new Rectangle();
        System.out.println("Area of Rectangle: " + figref.printArea());

        System.out.println("\nTriangle:");
        figref = new Triangle();
        System.out.println("Area of Triangle: " + figref.printArea());

        System.out.println("\nCircle:");
        figref = new Circle();
        System.out.println("Area of Circle: " + figref.printArea());
	System.out.println("AYAAN SHRESTHA, 1BM23CS056");
    }
}
