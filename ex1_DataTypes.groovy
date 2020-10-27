package exercise

class ex1_DataTypes {
	static void main (def args) {
		def x
		int y
		
		def arr = [1 , 2.0, "stringExample", true, x, y]
		
		println arr
		
		arr.each { 
			println "Type for array value "+it +" is " +it.getClass() 
		}
	}
}
