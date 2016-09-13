object Q8{
	def main(args: Array[String]): Unit=
	{
	
	}
	def permutationGen(l: List[Int]): List[List[Int]]=
	{
		l match{
			case Nil => List(Nil)
			case hd::rest if l.length==2 => List(hd::rest, rest:::List(hd))
			case hd::rest if l.length>2 => List(hd::permutationGen(rest)(0), hd::permutationGen(rest)(1))
		}
	}
}
