
public class AccessSpecifier {

	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 
//public access specifier
	public class AccessSpecifier
	{

		public static void main(String[] args)
		{
			//default
			System.out.println("Default Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display(); 

		}
	}
}


//Private

class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class AccessSpecifier2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}


//Protected
class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package

public class AccessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		AccessSpecifiers3 obj = new AccessSpecifiers3 ();   
	       obj.display();  
	}

}



class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}




public class AccessSpecifier4 {

	public static void main(String[] args) {
		
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
        obj.display();  
		
	}
}
