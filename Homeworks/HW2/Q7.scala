object Q7{
	def main(args: Array[String]): Unit=
	{
	
	}
	def fastPower(x: Int, n: Int): Int=
	{
		n match{
			case 2 => x*x
			case _ => fastPower(x,n/2)*fastPower(x,n/2)
		}
	}
}
