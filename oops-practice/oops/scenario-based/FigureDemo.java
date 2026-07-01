abstract class Figure {
    public abstract double area();
    public abstract double perimeter();
}

class RoundFigure extends Figure {
    private final double radius;

    public RoundFigure(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangularFigure extends Figure {
    private double length;
    private double width;

    public RectangularFigure(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class TriangularFigure extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public TriangularFigure(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class FigureDemo {
    public static void main(String[] args) {

        Figure[] figures = {
                new RoundFigure(5),
                new RectangularFigure(10, 4),
                new TriangularFigure(3, 4, 5)
        };

        System.out.println("====================");
        System.out.println(" FIGURE AREA REPORT");
        System.out.println("====================");

        System.out.printf("%-20s %-12s %-12s%n",
                "Figure", "Area", "Perimeter");

        System.out.println("------------------------------------------------");

        for (Figure figure : figures) {
            System.out.printf("%-20s %-12.2f %-12.2f%n",
                    figure.getClass().getSimpleName(),
                    figure.area(),
                    figure.perimeter());
        }
    }
}