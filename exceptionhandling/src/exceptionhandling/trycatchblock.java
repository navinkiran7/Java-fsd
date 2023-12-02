// Parent class
class GeometricShape {
   void displayArea() {
      System.out.println("Area calculation not implemented for this shape");
   }
}

// Child class 1
class Rectangle extends GeometricShape {
   double length;
   double width;

   Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

   @Override
   void displayArea() {
      System.out.println("Rectangle Area: " + (length * width));
   }
}

// Child class 2
class Circle extends GeometricShape {
   double radius;

   Circle(double radius) {
      this.radius = radius;
   }

   @Override
   void displayArea() {
      System.out.println("Circle Area: " + (Math.PI * radius * radius));
   }
}

// Main class
public class GeometryCalculator {
   public static void main(String[] args) {
       try {
           // Creating objects
           Rectangle rectangle = new Rectangle(5, 10);
           Circle circle = new Circle(3);

           // Adding objects to ArrayList
           ArrayList<GeometricShape> shapes = new ArrayList<>();
           shapes.add(rectangle);
           shapes.add(circle);

           // Displaying areas using loop
           for (GeometricShape shape : shapes) {
               shape.displayArea();
           }
       } catch (Exception e) {
           System.out.println("An error occurred: " + e.getMessage());
       } finally {
           System.out.println("Program execution completed.") ;
       }
    }
}