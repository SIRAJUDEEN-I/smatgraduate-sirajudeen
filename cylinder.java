public class VolumeOfCylinder {
 
    public static void main(String[] args) {
        double radius, height, volume, surfaceArea;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Base Radius of Cylinder");
        radius = scanner.nextDouble();
 
        System.out.println("Enter Height of Cylinder");
        height = scanner.nextDouble();
 
        surfaceArea = 2 * Math.PI * radius * (radius + height);
 

        volume = Math.PI * radius * radius * height;
 
        System.out.format("Surface Area of Cylinder = %.3f\n", surfaceArea);
        System.out.format("Volume of Cylinder = %.3f\n", volume);
    }
}
