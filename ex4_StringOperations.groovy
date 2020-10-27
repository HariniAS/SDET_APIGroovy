package exercise

class ex4_StringOperations {
	static void main(def args) {
		def sampleString = "This is a Groovy Language"
		println sampleString.reverse()
		println sampleString.substring(10)
		println sampleString.split(" ")
		println sampleString.minus("Groovy")
		println sampleString.toLowerCase()
		println sampleString.toUpperCase()
		
		println sampleString.matches (".*Groovy.*")
		println sampleString.contains ("Groovy")
		println sampleString.replaceAll("is", "IS")
		println sampleString
	}
}
