package a;

class Pet {
private String name;

Pet(){
	System.out.println("Pet");
}



public String getName( ) {
return name;
}
public void setName(String petName) {
name = petName;
}
public String speak( ) {
return "I'm your cuddly little pet.";
}


protected String deneme() {
	return "";
}
}
