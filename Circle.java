import myInterface.Shape;
/**
 * Circle 객체를 만드는 클래스
 * 
 * @author (2018315017 임민택, 2018315038 이혜인, 2018315026 정대기)
 * @version (2019.09.02)
 */


public class Circle implements Shape
{
    private int radius;
    private int x;
    private int y;

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea()
    {
        return radius*radius*PI;
    }
    
    public void draw(){
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    
    public int get_x(){
        return this.x;
    }
    
    public int get_y(){
        return this.y;
    }
}