public class Geometry
{
    
    private double side;
    private double length;
    private double width;
    private double height;
    private double base1, base2;
    private double radius;
    
    public Geometry(double s, double l, double w, double h, double b1, double b2, double r){
        side = s;
        length = l;
        width = w;
        height = h;
        base1 =b1;
        base2 = b2;
        radius = r;
    }
    public static double squarePerimeter (double side)                      
    { 
        return 4 * side; 
    }
    public static double pentagonPerimeter(double side)
    {
        return 5 * side;
        
       }
    public static double hexagonPerimeter (double side)
    {
    return 6 * side;
    }
    public static double octagonPerimeter (double side)
    {
    return 8 * side;
    }
public static double rectanglePerimeter (double length, double width)
{
    return (length = width) * 2;
}
        public static double circumference (double radius)
        {
            return 2 * Math.PI * radius;
        }
    // 2D Areas
    public static double rectangleArea (double length, double width)             
    { 
        return length * width; 
    }
    public static double squareArea (double side)
    {
        return side * side;
    }
    public static double parallelogramArea (double base1, double height)
    {
        return base1 * height;
    }
    public static double  triangleArea (double base1, double height)
    {
        return base1 * height / 2;
    }
    public static double trapezoidArea (double base1, double base2, double height)
    {
        return height * (base1 + base2) / 2;
    }
    public static double hexagonArea (double base1, double base2, double height)
    {
        return (base1 + base2) * height;
    }
    public static double circleArea (double radius)
    {
        return Math.PI * radius * radius;
    }


    // 3D Surface Areas
    public static double cubeSurfaceArea (double side)                      
    { 
        return 6 * side * side; 
    }
    public static double squarePrismSurfaceArea (double side, double height)
    {
        return 2 * side * side * + 4 * side * height;
    }
    public static double rectangularPrismSurfaceArea (double length, double width, double height)
    {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
    public static double sphereSurfaceArea (double radius)
    {
        return 4 * Math.PI * radius * radius;
    }
    
    
    
    // 3D Volumes
    public static double cubeVolume (double side) 
    {
        return side * side * side;
    }
    public static double squarePrismVolume (double side, double height)
    {
        return side * side * height;
    }
    public static double  rectangularPrismVolume (double length, double width, double height)
    {
        return length * width * height;
    }
    public static double pyramidVolume (double side, double height)
    {
        return side * side * height / 3;
    }
    public static double cylinderVolume (double radius, double height)
    {
        return Math.PI * radius * radius * height;
    }
    public static double coneVolume (double radius, double height)            
    { 
        return Math.PI * radius * radius * height / 3;
    }
    public static double sphereVolume (double radius)
    {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
    
    
    public  void display2DPerimeters()                      
    {   
        System.out.println("\n\nPerimeters of 2D Shapes");
        System.out.println("=====================================================");
        System.out.println("Square Perimeter:                 " + squarePerimeter(side));
        System.out.println("Pentagon Perimeter:               " + pentagonPerimeter(side));
        System.out.println("Hexagon Perimeter:                " + hexagonPerimeter(side));
        System.out.println("Octagon Perimeter:                " + octagonPerimeter(side));
        System.out.println("Rectangle Perimeter:              " + rectanglePerimeter(length,width));
        System.out.println("Circle Perimeter (circumference): " + circumference(radius));
        System.out.println("\n");
    }
    public  void display2DAreas()                       
    {   
        System.out.println("Areas of 2D Shapes");
        System.out.println("=====================================================");
        System.out.println("Square Area:                      " + squareArea(side));
        System.out.println("Rectangle Area:                   " + rectangleArea(length, width));
        System.out.println("Parallelogram Area:               " + parallelogramArea(base1,height));
        System.out.println("Triangle Area:                    " + triangleArea(base1,height));      
        System.out.println("Trapezoid Area:                   " + trapezoidArea(base1,base2,height));
        System.out.println("Hexagon Area:                     " + hexagonArea(base1,base2,height));
        System.out.println("Circle Area:                      " + circleArea(radius));
        System.out.println("\n");
    }



    public  void display3DSurfaceAreas()                        
    {   
        System.out.println("Surface Areas of 3D Shapes");
        System.out.println("=====================================================");
        System.out.println("Cube Surface Area:                " + cubeSurfaceArea(side));
        System.out.println("Square Prism Surface Area:        " + squarePrismSurfaceArea(side,height));
        System.out.println("Rectangular Prism Surface Area:   " + rectangularPrismSurfaceArea(length,width,height));
        System.out.println("Sphere Surface Area:              " + sphereSurfaceArea(radius));
        System.out.println("\n");
    }
    
    public void display3DVolumes()                      
    {   
        System.out.println("Volumes of 3D Shapes");
        System.out.println("=====================================================");
        System.out.println("Cube Volume:                      " + cubeVolume(side));
        System.out.println("Square Prism Volume:              " + squarePrismVolume(side,height));
        System.out.println("Rectangular Prism Volume:         " + rectangularPrismVolume(length,width,height));
        System.out.println("Pyramid Volume:                   " + pyramidVolume(side,height));
        System.out.println("Cylinder Volume:                  " + cylinderVolume(radius,height));
        System.out.println("Cone Volume:                      " + coneVolume(radius, height));
        System.out.println("Sphere Volume:                    " + sphereVolume(radius));
	}

	
}