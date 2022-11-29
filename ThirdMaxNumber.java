package ArrayExamples;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		int temp = 0;
		int array[] = {10,20,30,40,11,56,87};
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
			
		}
		System.out.println("Third Maximum Number::"+temp);

	}

}
