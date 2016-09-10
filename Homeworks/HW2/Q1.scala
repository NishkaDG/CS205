object Q1{
	def main(args: Array[String]): Unit= //main function
	{

	}
	def fact(n: Int): Int=
		{
			n match{
				case 0 => 1 //base case
				case _ => n*fact(n-1) //calls itself
				}
		}
		
	}
