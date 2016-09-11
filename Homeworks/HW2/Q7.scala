object Q7{
	def main(args: Array[String]): Unit=//main function
	{
	
	}
	def fastPower(x: Int, n: Int): Int= //will work when n is a power of 2
	{
		n match{
			case 2 => x*x //base case
			case _ if (n%2!=0) => x*fastPower(x,(n-1)/2)*fastPower(x,(n-1)/2) //to build up x^n from x^2, where n is odd
			case _ if (n%2==0) => fastPower(x,n/2)*fastPower(x,n/2) //to build up x^n from x^2
		}
	}
}
