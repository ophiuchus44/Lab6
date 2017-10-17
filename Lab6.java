import java.util.*;

public class Lab6{
	
public static void main(String [] args){

	Scanner inScan = new Scanner(System.in);

	System.out.println("How many items will be entered? ");

	int numItems = inScan.nextInt();

	double [] arrayNum = new double[numItems];

	for (int i=0; i<arrayNum.length; i++){
		System.out.println("Enter item number...");
		double newNumber = inScan.nextDouble();

		arrayNum[i]= newNumber;
	}





	//for (int a=0; a<arrayNum.length; a++){
	//	System.out.println(arrayNum[a]);		
	//}

	System.out.println("max: " + max(arrayNum));

	System.out.println("min: " + min(arrayNum));

	System.out.println("sum: " + sum(arrayNum));

	System.out.println("ave: " + ave(arrayNum));

}




public static double max(double [] data){
	double max = 0;
	for (int i=0; i<data.length; i++){
		if(data[i]>max){
			max = data[i];
		}
	}
	return max;

}   



public static double min(double [] data){
	double min = data[0];
	for (int i=0; i<data.length; i++){
		if(data[i]<min){
			min = data[i];
		}
	}
	return min;

}   

public static double sum(double [] data){
	double total = 0;
	for (int i=0; i<data.length; i++){
		total += data[i];
	}
	return total;

}   


public static double ave(double [] data){
	double total = 0;
	double numNumbers = data.length;
	for (int i=0; i<data.length; i++){
		total += data[i];
	}

	return total/numNumbers;

}   








//public static double sum(double [] data)    // sum the items in the array
                                            // and return the result

//	public static double ave(double [] data)    // call sum to get the sum
                                            // and then return the average



}

