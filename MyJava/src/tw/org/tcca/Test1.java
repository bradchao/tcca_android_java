package tw.org.tcca;

public class Test1 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97,98,99,100};
		String s2 = new String(b1);
		
		String s3 = "brad";
		String s4 = "brad";
		String s5 = new String("brad");
		String s6 = new String("brad");
		
		if (s5 == s6) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
		Student st1 = new Student("A001");
		Student st2 = new Student("A001");
		if (st1 == st2) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		if (st1.equals(st2)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		
		
		
		
	}

}
