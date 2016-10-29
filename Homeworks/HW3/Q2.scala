object splitlist{
	def main(args: Array[String]): Unit= //main function
	{
	
	}
	def split(lst:List[Int]): (List[Int],List[Int])={
		var lst1: List[Int]=List()
		var lst2: List[Int]=List()
		var orig: List[Int]=lst
		while(!(orig.isEmpty)){
			lst1=lst1:+(orig.head)
			orig=orig.drop(1)
			if(!(orig.isEmpty)){
				lst2=orig.last::lst2
				orig=orig.init
				}
		}
		(lst1, lst2)
}
}
