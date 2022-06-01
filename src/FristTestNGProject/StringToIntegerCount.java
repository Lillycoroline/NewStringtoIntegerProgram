package FristTestNGProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringToIntegerCount {	
	
	public long sumInteger(String sum) {
	
		
		int size=sum.length();
		
		int count=0;
		
		for (int i = 0; i < size; i++) {
			
			char c=sum.charAt(i);
			
			if(Character.isDigit(c))
					{
				count=count+Character.getNumericValue(c);
			
			
			}
		
			
		}
		System.out.println(count);
		return count;
		

	}
	
	@Test
	
	public void Testcase1() {
		String sum="aa1bc2d3";
		
		Assert.assertEquals(sumInteger(sum) , 6);
	}
	
@Test
	
	public void Testcase2() {
		String sum="chocolate";
		
		Assert.assertEquals(sumInteger(sum) , 0);
	}

}
