public class Triangle {
    private double canhA;
    private double canhB;
    private double canhC;

    public Triangle() {
    }

    public Triangle(double canhA, double canhB, double canhC) throws IllegalTriangleException {
        if ( canhA <= 0 || canhB <= 0 || canhC <= 0) {
            throw new IllegalTriangleException("Cạnh không hợp lệ ( Nhỏ hơn 0)");
        }
        if ( canhA+canhB <= canhC || canhA+canhC <= canhB || canhC+canhB <= canhA){
            throw new IllegalTriangleException("Đây không phải cạnh của tam giác");
        }
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
}
