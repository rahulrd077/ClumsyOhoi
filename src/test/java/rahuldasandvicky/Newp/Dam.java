package rahuldasandvicky.Newp;

public class Dam {

	
	int i = 10 ;
	
	Dam(){
		
		this(99);
	}
	
	public Dam(int i) {
		
		this.i = i ;
		
		System.out.println(i);
		
	}
	
	
	public static void main(String[] args) {
		
		Dam dew = new Dam();
		
		Dam d = new Dam(70);
	}
}
