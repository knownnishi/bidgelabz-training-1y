class Circle {
    double radius;

    Circle()              { this(1.0); }   // chains to below
    Circle(double radius) { this.radius = radius; }

    void display() {
        System.out.println("Circle radius: " + radius);
    }
}