abstract class Shape
{
    abstract void draw();
}
class Rec extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Cir extends Shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class TestAbstraction1
{
    public static void main(String args[])
    {
        Shape s = new Shape();
        s.draw();
    }
}