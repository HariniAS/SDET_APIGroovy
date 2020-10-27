package first

class FirstGroovy {
	static void main (def args) {
//		def myList = ["1","hello", "world", 2]
//		myList.each { println it }
		
//		5.times { println "Times + $it" } // template string
//		5.times { println "Times + " + it }
//		5.times { println 'Times + $it' }
//		4.upto(5) {  }
		
//		println ("ABCB"-"B")
		
		def str1 = """#1 Hello
This is a multi line
string example
"""
		 
		def str2 = '''#2
This is
Another multi line
string sammple
'''
		 
		def str3 = '#3 This is\
a sample with\
backslash'
		 
		def str4 = '\n#4 Another example\nwith backslash\nand next line'

		println str1
		println str2
		println str3
		println str4
		
		println (str3.substring(1, 5))
		
		def l1= list();
		l1.add("hello");
		
	}
}
