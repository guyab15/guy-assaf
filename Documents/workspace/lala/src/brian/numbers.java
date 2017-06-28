package brian;

import javax.print.attribute.standard.NumberOfDocuments;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class numbers {
	
	public static Integer numOfDigth(Integer num){
		Integer counter =0;
		while(num%10 == 0){
			counter++;
			num/=10;
		}
		
		return counter;
	}
	
public static void main(String[] args) {
	numOfDigth(50);	
}

}
