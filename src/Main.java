public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1,11,9);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
