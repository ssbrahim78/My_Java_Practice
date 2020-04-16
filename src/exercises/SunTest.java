package exercises;

public class SunTest {

	public static void main(String[] args) {
		Sum sun1 = new Sum();
		sun1.a = 74;
		sun1.b= 36;
		int total=sun1.getSumValue();
		System.out.println(total);

		Sum sun2 = new Sum(74,36);
		int total2=sun2.getSumValue();
		System.out.println(total2);
	}

}
