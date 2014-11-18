public class arraydemo{
    public static boolean containsH(int value, int[]c, int start){
	return c.length != 0 && 
	    start < c.length &&
	    (c[start] == value || containsH(value, c,start+1));
    }
    public static boolean contains(int value, int[]c){
	return containsH(value, c,0);
    }

    
    public static void main(String[]args){
	//	int[]testme = {1,9,4,5,2};
	//	System.out.println(contains(2, testme);
    }
}		   