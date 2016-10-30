class Queue(){
	var q: List[Any]=Nil
	def equals(that: Queue): Boolean={
		(this.q, that.q) match{
			case (Nil, Nil) => true
			case (hd1::rest1, hd2::rest2) => (hd1.equals(hd2)) && (rest1.equals(rest2))
			case _ => false
		}
	}
	override def hashCode(): Int={
		var sum: Int=0
		this.q.foreach{
			sum+=_.hashCode()
		}
		sum
	}
	def Enqueue(x: Any): Unit={
		this.q=this.q:::List(x)
	}
	def Dequeue(): Unit={
		this.q match{
			case Nil => this.q=Nil
			case hd::rest => this.q=rest
		}
	}
}
