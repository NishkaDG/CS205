object Q3{
	def main(args: Array[String]): Unit=
	{
	}	
	def sortInsert(l: List[Int], x: Int): List[Int]=
	{
		l match{
			case Nil => List(x)
			case  hd::rest if x<=hd => x::l
			case hd::rest if x>hd => hd::sortInsert(rest, x)
			}
		}
}
