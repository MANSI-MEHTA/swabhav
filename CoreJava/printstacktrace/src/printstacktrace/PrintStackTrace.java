package printstacktrace;

public class PrintStackTrace {
	public static void main(String args[]) {
		System.out.println("start of main");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("end of main");

	}

	static void m1() throws Exception {
		System.out.println("inside m1");

		m2();

	}

	static void m2() throws Exception {
		System.out.println("inside m2");

		m3();

	}

	static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("error in m3");

	}
}
