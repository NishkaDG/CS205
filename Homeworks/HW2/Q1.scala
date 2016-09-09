object Q1{
	def main(args: Array[String]): Unit=
	{

	}
	def fact(n: Int): Int=
		{
			n match{
				case 0 => 1
				case _ => n*fact(n-1)
				}
		}
		
	}
