package Grid;

public class ex02 {
    public static void main(String[] age) {
        int n = 25;
        int k = 3;
        int result = 0;
        int target;

        while (true) {

            target = (n / k) * k;       // 25/3*3 =24   , 8/3*3= 6,  2/3*2= 0
            result += n - target;       // 25-24+0=1    , 8-6+2 =4,  2-0+5=7
            n = target;                 // n = 24       , n = 6,     n=0

            if (n < k) {                //2<3
                break;
            }
            result = result + 1;        //1+1 = 2, 4+1=5
            n = n / k;                  //24/3 =8, 6/3 =2
        }
        result = result + (n - 1);      // 7+(0-1) = 6
        System.out.println(result);
    }
}
