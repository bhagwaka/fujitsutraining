package day7;

public class PrimeMethod {

	public static void main(String[] args) {
		String str = (args[0]);
		
		int num = Integer.parseInt(str);
		//int num=10;
		int flag = 0;
		
		for(int i = 2; i <=num/2; i++)
		{
			if(num%i==0)
			{
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is Prime");
		}
		else{
			System.out.println(num+" is not prime");
		}
		
	}

}
