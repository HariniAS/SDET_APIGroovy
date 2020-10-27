package exercise

class ex3_Fibonacci {
	static void main (def args) {
		int a=0
		int b=1
		println "$a\n$b"
		println b
		int c=0
		for (def x=2; x<10;x++) {
			c=a+b
			println (c)
			(a,b)=[b,c]
		}
	}
}
