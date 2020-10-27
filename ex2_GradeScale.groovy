package exercise

class ex2_GradeScale {
	static void main (def args) {
		def marks = [99 , 80 , 50 , 25 , 72]
		def sum=0
		def len = marks.size()
		
		println "Maximum marks in the class is "+ marks.max()
		println "Maximum marks in the class is "+ marks.min()
		
		marks.each { sum=sum+it }
		int avg=sum/len;
		println ("Average marks = "+avg)
		switch (avg) {
			case 0..49:
				println ("Average is <50%")
				break
			case 50..69:
				println ("Average is between 50% and 70%")
				break
			case 70..79:
				println ("Average is between 70% and 80%")
				break
			case 80..89:
				println ("Average is between 80% and 90%")
				break
			case 90..100:
				println ("Average is between 90% and 100%")
				break
			default:
				println ("Incorrect average")
		}
		
	}
}
