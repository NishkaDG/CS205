object Q5{
	def main(args: Array[String]): Unit=//main method
	{
	
	}
	def pivotSort(l: List[Int], x: Int): List[Int]=
	{
		l match{
			case Nil => List(x)//base case
			case hd::rest if hd<=x => hd::pivotSort(rest, x) //moves elements smaller than x to the beginning of the list
			case hd::rest if hd>x => pivotSort(rest, x):::List(hd) //moves elements bigger than x to the end of the list
		}
	}
}
