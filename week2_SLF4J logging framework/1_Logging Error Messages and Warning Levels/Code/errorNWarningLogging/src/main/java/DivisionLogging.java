import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DivisionLogging {
	private static final Logger logger=LoggerFactory.getLogger("DivisionLogging");
	
	public static int div(int a, int b) {
		if(b==0) {
			logger.error("Denominator can't be 0!");
			return Integer.MAX_VALUE;
		}
		if(b>a) {
			logger.warn("Greater value of denominator results to 0 in case of integer division!");
		}
		return a/b;
	}
	public static void main(String[] args) {
		int den=4, num=0;
		int res=div(den,num);
		System.out.println("Operation " + den + "/" + num + " Result: "+res);
	}
}
