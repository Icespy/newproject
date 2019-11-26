
public class main1 {
	
	public static void main(String[] args) {
		int a, b ,c=2;
		String firstName = "Ice Spy";
		System.out.println("hello");
		System.out.println("hello "+firstName);
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(firstName + " " + (i+1));
		}
		
		int[] number = {1,2,3,4,5};
		int[] even = new int[5];
		String[] animal = {"pig","ann","cat","bird"};
		
		for(int i=0 ; i<3 ; i++) {
			System.out.println("================");
		}
		
		/*for(int i=0 ; i<animal.length ; i++) {
			System.out.println("Animal = "+ animal[i]);
		}*/
		System.out.println("SizeAnimal = "+ animal.length);
		System.out.println("SizeEven = "+ even.length);
	
		// for-each loop
		for(String f : animal)
			System.out.println("animal = "+ f);
	
		System.out.println("Name "+firstName.charAt(0));
		
		String[] sp = firstName.split(" ");
		System.out.println("("+sp[0]+")"+sp[1]);
		
		
	}
}