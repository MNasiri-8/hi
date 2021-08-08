/*public void start(){
system out print(getclass .getsimplename());
}
miyad name class ro print migire!!*/

import E_Instance.A37_Instance;

public class A1to26_center {
    public static void main(String[] args) {
        //System.out.println("as");

        /** numeric deta types
         * az ghabl iena bodan
         */
        int a = 12;
        short b =32;
        String re = "";
        long c =1234;
        float d =12.32f;
        double e =13.2;
        /**asciitable.com
         */
        char f ='a';

        /**boolean
         * false or true
         */
        boolean s = true;
        /**integer and string one class
         *
         */
        Integer h = 10;
        // \t=yek fasele beyn karak ha & \n yek enter
        String k = "matin \t nasiri";

        //estefade az ye deta khali baraye modiriyat sayer
        String q ="";
        q = q+s+a;



        /*castingVariables variables = new castingVariables();
        variables.start();*/



        /**castingVariables**/
        int ali = 20;
        String akbar ="16";
        ali = Integer.parseInt(akbar);

        String port = "20.2";

        /**Tty Catch Blok & finally*/
        try {
            int azx = Integer .parseInt(port);
            System.out.println(azx);
        }
        catch (NumberFormatException azx){
           // System.out.println(azx .getMessage());
        }
        finally {
           // System.out.println(a);
        }












    (new E_Instance.A38_StaticUsage()) .start();


    }
}
