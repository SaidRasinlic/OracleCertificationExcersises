package testwo;

public class Fragment extends Base {

    public final int FRAG = 333;

    public static int testNum = 10;

    public void apply(int testNum) {

        System.out.println("Applied!");
    }

    String s = this.toString();

    public static void main(String args[]) {

        int e = new Base().value=34;
        
        System.out.println(e);
        System.out.println("aaa");
        /*      if (args.length != 0) {
           
            System.out.println(args[args.length - 1]);
        }
        
       int x = Integer.valueOf(args.length);  // 0
      
   

        int i = args.length;
        if (i != 0) {
            System.out.println(args[i - 1]);
        }
         

        int i = args.length - 1;
        if (i > 0) {
            System.out.println(args[i]);
        }     */
        // Runtime.getRuntime().gc();
        //System.gc();
   

    }
}
