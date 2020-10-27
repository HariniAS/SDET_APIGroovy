package first

class regex_practise {
	static void main(def args){
		def text = "John Jimerboer jingeled happily ever after"
		//Find words starting with "J"
		if (text==~/^J.*/ ) {
			println "There was a match"
		} else {
			println "No match found"
		}
		//Store the result in a variable
		def x = text =~ /\S+er\b/
			
		//find() returns true/false
		println x.find() //true
			
		//findAll returns a list of all matches
		println x.findAll() //[ever, after]
	}
}