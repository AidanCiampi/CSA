public class Circle {
    private double radius;
    public Circle(double radius){

    }
    public double Area(){
        return Math.PI * Math.pow(radius,2);
    }
    public double circumf(){
        return 2*Math.PI*radius;
    }
}
