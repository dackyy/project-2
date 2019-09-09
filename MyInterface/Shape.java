package MyInterface;
/**
 *   ?��?��?��?��?�� Shape
 * 
 * @author (2018315017 ?��민택, 2018315038 ?��?��?��, 2018315026 ?��??�?) 
 * @version (2019.09.02)
 */

public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- ?��?�� 그립?��?��. ");
        draw();
    }
}
