package pleo.pleq;

public class Main {

    public static void main(String[] args) {
	    byte byteVariable = 10;
	    short shortVariable = 12002;
	    int intVariable = 29921;
	    long longTotal= 50000L + 10L * (byteVariable + shortVariable + intVariable);
		System.out.println(longTotal);
    }
}
