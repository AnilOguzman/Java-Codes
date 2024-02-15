package g;

public class c {
c(int a){
System.out.println("1.");	
}
c(String name,int a){
this(a);
System.out.println("2.");
}
c(String name,int a,int b){
	this(name,a);
	System.out.println("3.");

 


}


b deneme() {
	return new b();
}
}
