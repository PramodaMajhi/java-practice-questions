

public class Test {
	
	private String name;
	
	Test(String name) {
		this.name = name ;
	}
	
	

  public static void main(String[] args) {
		
		Test objOne = new Test("Pramod");
		
		Test objTwo = new Test("Pramod");
		
		

		if (objOne.equals(objTwo)) {

			System.out.println("Looks the two object are same 'TRUE'");
		}

		System.out.println("Object One hashcode:" + objOne.hashCode());
		System.out.println("Object two hascode: " + objTwo.hashCode());
		
		//String myString = t1.reverseString("BSC");
		//System.out.println(myString);
	}
  
  
  
  public String reverseString(String s) {
	  StringBuffer strBuffer = new StringBuffer();
	  char c[] = s.toCharArray();
	  
	  int length = c.length;
	  int half = length/2;
	  
	  for(int i=0; i < half ; i++) {
		  char temp = c[i];
			   c[i] = c[length-1-i];
			   c[length - 1 -i] = temp;
		  //strBuffer.append(c);
	  }
	  return new String(c);
	  
  }



/*@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
*/


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Test other = (Test) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

}
