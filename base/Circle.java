package base;
import MyInterface.Shape;
/**
 * Circle 객체를 만드는 클래스
 * 
 * @author (2018315017 임민택, 2018315038 이혜인, 2018315026 정대기)
 * @version (2019.09.09)
 */


public class Circle implements Shape
{
    private int radius;
    public int x;
    public int y;

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea()
    {
        return radius*radius*radius;
    }
    
    public void draw(){
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    
    public Integer get_x(){
        Integer x = new Integer(this.x);
        return x;
    }
    
    public Integer get_y(){
        Integer y = new Integer(this.y);
        return y;
    }
    
    public boolean equals(Object obj1, Object obj2){
        if (obj1 == obj2){
            return true;
        }
        else
            return false;
    }
}