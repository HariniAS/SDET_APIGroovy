package exercise

class ex7_FileRegexOps {
	static void main(def args) {
		File file = new File("C:\\Users\\XMT5NJV\\Documents\\Harini\\Auto\\LEARNINGS\\SDET Reskill\\Groovy\\ex7.txt")
		file.createNewFile();
		file.write("A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever aftrr")
		file.append("\nTh12\$ 1\$ v3ry c0nfus1ng er")
		
//		Print the line that has Cow at the end of the line
//		Print the line that start with capital letter 'J'
//		Print the line that has two numbers one after the other
//		Print the string(s) that match the pattern '\S+er'
//		Print the string(s) that match the patter '\S*\d\W'
		
		println ("Match Operations: ")
		file.eachLine() {line ->
			if ( line ==~ /.*Cow$/) { //$ means at the end
				println "Line that ends with 'Cow' is: $line"
			}
		}
		file.eachLine() {line ->
			if (line ==~ /^J.*/){  //.* means everything before or after, ^ is at the beginning
				println "Line that starts with 'J' is: $line"
			}
		}
		file.eachLine() {line ->
			if (line ==~ /.*\d\d.*/){
				println "Line that has two adjacent numbers: $line"
			}
		}
		// file.each & file.eachLine are the same
		file.eachLine() {line ->
			if (line =~ /\S+er/){    // same as if (line ==~ /.*\S+er.*/)
				println "Line that has S+er: $line"
			}
		}
		println "\n\nFind Operations:"
        def match1 = file.getText() =~ /\S+er/
        println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
		
		def match2 = file.getText() ==~ /.*\S.*\d\W.*/
		println "String(s) matching '\\S*\\d\\W' are: ${match2.findAll()}"	
		
		def match3 = file.getText() =~ /\S*\d\W/
		println "String(s) matching '\\S*\\d\\W' are: ${match3.findAll()}"

	}
}