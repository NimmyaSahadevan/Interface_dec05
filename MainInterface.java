import java.util.Scanner;
public class MainInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		InheritedInterface i=new InheritedInterface();
		i.add(a,b);
		i.sub(a,b);
		i.mul(a,b);
		i.div(a,b);
				
	}

}
