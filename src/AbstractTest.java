
  class  A{
	public static void m() {
		System.out.println("Inside A");
	}
}
  class  B extends A{
		public static void m() {
			System.out.println("Inside B");
		}
	}
	  
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A.m();
B.m();
A a=new A();
B b=new B();
A a1=new B();
a.m();
b.m();
a1.m();
	}

}
