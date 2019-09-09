package MyInterface;
/**
 *   ?¸?„°?˜?´?Š¤ Shape
 * 
 * @author (2018315017 ?„ë¯¼íƒ, 2018315038 ?´?˜œ?¸, 2018315026 ? •??ê¸?) 
 * @version (2019.09.02)
 */

public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- ?‹¤?‹œ ê·¸ë¦½?‹ˆ?‹¤. ");
        draw();
    }
}
