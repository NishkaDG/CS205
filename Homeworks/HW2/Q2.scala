object Q2{
	def main(args: Array[String]): Unit= //main function
	{
	
	}
	def Split(l: List[Int]): (List[Int], List[Int])=
	{	
		l match{
			case Nil => (Nil, Nil) //base case for even length list
			case hd::rest if l.length>1 => (hd::Split(rest.init)._1, Split(rest.init)._2:::List(l.last))
			case hd::rest if l.length==1 => (List(hd), Nil) //base case for odd length list
		}
		}
}
