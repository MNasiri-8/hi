package Ae.ti;

public class A29_LogicalOperators {
    public void start(){
 /*
            &&
            ||
            !

            |  or => shift&backslash   (backslash or پ)
            &  and
            ^  xor
 */

            int a =23;
            int b =12;
            boolean c =false;
            // () = agar
        System.out.println(
                 (a>b)
                &&
                 (a<b)
        );
        System.out.println(
                (a>b)
             &&
                !(a<b)
        );
        System.out.println(
                     (a>b)
                ||
                     (a<b)
                ||
                     (c)
        );
        System.out.println(
                         !(a>b)
                        ||
                        (a<b)
                        ||
                        (c)
        );
    }
}




