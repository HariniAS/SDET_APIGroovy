package first

class IO_practise {
	static void main(def args) {
		// write the content of the file to the console
		File file = new File("C:\\Users\\XMT5NJV\\Documents\\Harini\\Auto\\LEARNINGS\\SDET Reskill\\Groovy\\ex7.txt")
		
		//Print each line in the file
		file.eachLine{ line -> println line }
		
		// adds a line number in front of each line to the console
		def lineNumber = 0
		file.eachLine {
			line ->
			lineNumber++
			println "$lineNumber: $line"
		}
//		println file.text
//		println file.getText()
		
		//Prints true if "rando" is a file
		println "File? ${file.isFile()}"
	
		//Prints true if "rando" is a directory
		println "Directory? ${file.isDirectory()}"
	}
}
