object Q3{
	def main(args: Array[String]): Unit= //main function
	{
		
	}	
	def sortInsert(l: List[Int], x: Int): List[Int]=
	{
		l match{
			case Nil => List(x) //base case for if x is bigger than all elements
			case  hd::rest if x<=hd => x::l //base case for if x is smaller than some elements
			case hd::rest if x>hd => hd::sortInsert(rest, x)
			}
		}
}
