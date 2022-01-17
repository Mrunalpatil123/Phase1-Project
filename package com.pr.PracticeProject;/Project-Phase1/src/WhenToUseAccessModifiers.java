//2.

// Public Access Modifier
//When methods, variables, classes, and so on are declared public,
//then we can access them from anywhere.
public class WhenToUseAccessModifiers {
	public static void publicDemo() {
		System.out.println("Public Method,Variable We can access from anywhere ");
	}
    public static void main( String[] args ) {
       publicDemo();
       Logger L1=new Logger(); 
       L1.message();
       Information I=new Information();
       I.main();
       Modifier D=new Modifier();
       D.main();
    }
}
 
 //Default Access Modifier
//	If we do not specify any access modifier for classes, 
//methods, variables, etc, then by default the default access modifier is considered.
//However, if we try to use the  class in another class outside of Package,
//we will get a compilation error.
	class Logger {
	    void message(){
	        System.out.println("This is a message from default method");
	    }
	}

//Private Access Modifier
//When variables and methods are declared private, they cannot be accessed outside of the class.

class Data extends WhenToUseAccessModifiers {
    // private variable
    private String name;
}

 class Information extends Data {
    public static void main(){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
      //  d.name = "Programiz"; compile time error
        System.out.println("Private method,variable Cannot be access outside of class" );
    }
}
 // Protected
 //When methods and data members are declared protected,
 //we can access them within the same package as well as from subclasses.
  class Protected extends Information{
	    // protected method
	    protected void display() {
	        System.out.println("Protected method & We cannot declare classes or interfaces protected in Java");
	        
	    }
	}

	class Modifier extends Protected {
	    public static void main() {

	        // create an object of Dog class
	        Modifier d = new Modifier();
	         // access protected method
	        d.display();
	    }
	
	}
