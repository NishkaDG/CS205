object Q4{
	def main(args: Array[String]): Unit= //main method
	{
	
	}
	def sortInsert(l: List[Int], x: Int): List[Int]= //to insert each element in its rightful place
	{
		l match{
			case Nil => List(x)
			case  hd::rest if x<=hd => x::l
			case hd::rest if x>hd => hd::sortInsert(rest, x)
			}
	}	
	def InsertionSort(lst: List[Int]): List[Int]=
	{
		lst match{
			/**This will sort the last n-1 elements of the list, where n is the length of the list.
			  *Then it will insert the first element of the list in its rightful place using sortInsert
			  */
			case hd::rest => sortInsert(InsertionSort(rest), hd)
			case _ => lst //base case
		}
	}
}
