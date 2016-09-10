object Q4{
	def main(args: Array[String]): Unit=
	{
	
	}
	def sortInsert(x: Int, l: List[Int]): List[Int]=
	{
		l match{
			case Nil => List(x)
			case  hd::rest if x<=hd => x::l
			case hd::rest if x>hd => hd::sortInsert(x, rest)
			}
	}	
	def InsertionSort(lst: List[Int]): List[Int]=
	{
		lst match{
			case hd::rest => sortInsert(hd, InsertionSort(rest))
			case _ => lst
		}
	}
}
