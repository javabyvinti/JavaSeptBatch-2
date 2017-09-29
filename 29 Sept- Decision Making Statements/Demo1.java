
public class Demo1 {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		String c = a;
		String d = b;
		
		if(a==c){
			System.out.println("Same");
		} else{
			System.out.println("Not Same");
		}
		
		if(b==d){
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
	}

}
