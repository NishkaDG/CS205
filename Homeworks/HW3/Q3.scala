object Q3{
	var s: Int=0
	def main(args: Array[String]): Unit={
	}
	def sumList(lst: List[Int]): Int={
		lst match{
			case Nil => 0
			case hd::rest => hd+sumList(rest)
		}
	}
	def doWork(l: List[Int]): Int={
		var orig: List[Int]=l
		var sum: Int=0
		Console.println("Enter the number of threads: ")
		var numThreads: Int=Console.readInt
		var t: List[Thread]=List()
		var lT: Double=(l.length.toDouble)/(numThreads.toDouble)
		var lengthThread: Int=math.ceil(lT).toInt
		for(i <- 1 to numThreads){
			var workOn: List[Int]=orig.take(lengthThread)
			val thread=new Thread(new Runnable {
				override def run(){
					this.synchronized{
						sum=sum+sumList(workOn)
						}
				}
			})
			t=t:::List(thread)
			orig=orig.drop(lengthThread)
		}
		for(th <- t){
			th.start
		}
		sum
	}
	Console.println("sum is "+doWork(List(1,2,3,4,5,6,7,8,9,10)))
}
