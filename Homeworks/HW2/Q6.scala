object Q6{
	def main(args: Array[String]): Unit=//main method
	{
	
	}
	def pivotSort(l: List[Int], x: Int): List[Int]=
	{
		l match{
			case Nil => List(x)//base case
			case hd::rest if hd<=x => hd::pivotSort(rest, x) //moves elements smaller than x to the left
			case hd::rest if hd>x => pivotSort(rest, x):::List(hd) //moves elements bigger than x to the right
		}
	}
	def quickSort(lst: List[Int]): List[Int]=
	{
		lst match{
			case Nil => Nil //base case for when pivot is in first or last position
			case hd::Nil => List(hd) //base case for when pivot is in second or second last position
			case hd::rest if rest==List(hd) =>lst //base case for when elements repeat 
			case hd::rest => quickSort((pivotSort(lst.init, lst.last)).splitAt(pivotSort(lst.init, lst.last).indexOf(lst.last))._1):::quickSort((pivotSort(lst.init, lst.last)).splitAt(pivotSort(lst.init, lst.last).indexOf(lst.last))._2)
		}
	}
}
