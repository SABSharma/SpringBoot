package javapractice.practi;

@FunctionalInterface
public interface Interface1 {
	
	public void abstractm1();
	
	default  void m1() {
		System.out.println("in the defaut methido of interface");
	}

}
