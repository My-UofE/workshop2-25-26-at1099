public class RectangleComputation{
    public static void main(String[] args){
        int width = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);
        if (width / length == 1){
            boolean isSquare = true;
            System.out.println("Your shape is a square");

        }else{
            boolean isSquare = false;
            System.out.println("Your shape is a rectangle");
        }
        int area = width * length;
        int perimeter = 2 * width + 2 * length;
        System.out.println("It has a perimeter of " + perimeter + " and an area of " + area);

    }
}