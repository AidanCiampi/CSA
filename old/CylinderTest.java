public class Cylinder{

private Circle base;
private double height;

public Cylinder (double radius, double height){
    
    this.base = new Circle(radius);
    this.height = height; 
}
public double vol(){
    return base.Area() * height;
}
public double sa(){
    return (height * base.circumf())+ (2 * base.Area());
}
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5,2);
        double vol = cyl.vol();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.sa();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8,6);
        vol = cyl2.vol();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.sa();
        System.out.println("surface area = " + sa);
    }
}
