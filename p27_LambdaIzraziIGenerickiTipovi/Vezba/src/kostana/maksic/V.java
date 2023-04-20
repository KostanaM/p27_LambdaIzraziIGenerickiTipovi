package kostana.maksic;

public class V <T, C>{
	
	T ob;
	C ob1;

	public V(T ob, C ob1) {
		this.ob = ob;
		this.ob1 = ob1;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}

	
	public C getOb1() {
		return ob1;
	}

	public void setOb1(C ob1) {
		this.ob1 = ob1;
	}

	public void Ispisi() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob1.getClass().getName());
	}

	

	
	
	
	
}
