import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 100;
        int min = 0;
        int factor = 1;
        for (int i = 0;i < num;i++) {
            String str1 = sc.next();
            int num2 = sc.nextInt();
            switch (str1) {
                case ">":
                    if (num2 > min) {
                        min = num2;
                    }
                    break;
                case "<":
                    if (num2 < max) {
                        max = num2;
                    }
                    break;
                case "/":
                    factor = lcm (factor,num2);
                    break;
                
            }
        }
        int result = 0;
        
        for (int i = min + 1;i < max;i++) {
            if (i % factor == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        
    }
    //最小公倍数lcm
    static int lcm (int a, int b) {
        int temp;
	    long c = a;
	    c *= b;
	    while((temp = a%b)!=0) {
		    a = b;
		    b = temp;
	    }
	    return (int)(c/b);
    }
}


//最大公約数gcd
// static int gcd (int a, int b) {
// 	int temp;
// 	while((temp = a%b)!=0) {
// 		a = b;
// 		b = temp;
// 	}
// 	return b;
// }