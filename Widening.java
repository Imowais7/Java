class Widening
{
	public static void main(String[] args)
	{
		float f=33.01F;
		byte b= (byte)f;
		
		byte num1=50;
		short num2=num1;
		
		int num3=333;
		short num4=(short)num3;

		double num5=52.55d;
		char num6=(char)num5;

		char num7='A';
		float num8=num7;
		System.out.println(num2);
		System.out.println(num4);
		System.out.println(num6);
		System.out.println(num8);
	}
}


