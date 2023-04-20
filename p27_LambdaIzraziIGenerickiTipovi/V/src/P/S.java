package P;

public class S <T, K> {
	
	T o;
K k;
	
	
	public S(T o, K k) {
	this.o = o;
	this.k = k;
}

	

	public T getO() {
		return o;
	}



	public void setO(T o) {
		this.o = o;
	}



	public K getK() {
		return k;
	}



	public void setK(K k) {
		this.k = k;
	}



	public void Ispisi() {
		System.out.println(o.getClass().getName());
		System.out.println(k.getClass().getName());
	}

}
