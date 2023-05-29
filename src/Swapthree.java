
public class Swapthree extends welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20,c=30;
System.out.println( "before swap") ;
System.out.println(a);
System.out.println(b);
System.out.println(c);

a=a+b+c;
c=c-b;
b=a-b-c;
System.out.println("after swap");
System.out.println(a);
System.out.println(b);
System.out.println(c);

	}

}
