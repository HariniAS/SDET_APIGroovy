package first

class closure_practise {
	def static sampleFn (fnClosure) {
		fnClosure("Inner")
	}
	static void main(def args) {
		def str1 = "Hello"
		def sampleClosure = {def a -> println "$str1 $a" }
		
		sampleClosure("World")
		
		str1 = "Hey"
		sampleClosure("World")
		
		closure_practise.sampleFn(sampleClosure)
	}
}
