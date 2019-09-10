import base.Circle;
/**
 * Main 클래스
 * 
 * @author (2018315026 정대기, 2018315017 임민택, 2018315038 이혜인) 
 * @version (2019.09.09)
 */
public class Main
{
    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 : " + c1);
        System.out.println("원2 : " + c2);
        if(c1.get_x().equals(c2.get_y())){
            System.out.print("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
    }
}
