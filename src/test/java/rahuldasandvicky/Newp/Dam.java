package rahuldasandvicky.Newp;

public class Dam {

	
	int i = 10 ;
	
	Dam(){
		
		this(66,"Das");
	}
	
	public Dam(int i,String u) {
		
		this.i = i ;
		
		System.out.println(i +"        "+  u);
		
		
		
	}
	
	public void man() {
		
		System.out.println("The Number is : "+i);
	}
	
	
	public static void main(String[] args) {
		
		Dam dew = new Dam();
		
		Dam d = new Dam(70,"Rahul");
		
		dew.man();
		
		//end of program
		
		//Goodbye
	}
}
