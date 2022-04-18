package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
  public Rectangle(int length, int width){
      super(length, width);
  }
    @Override
    public double getPerimeter() {
        return super.length * super.width;
    }

    @Override
    public double getArea() {
        return ((super.length*2) + (super.width*2));
    }
}
