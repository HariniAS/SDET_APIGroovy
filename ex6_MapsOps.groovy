package exercise

class ex6_MapsOps {
	static void main (def args) {
//		def mainMap = [ : ]
//		mainMap.put(1,"JAVA")
//		mainMap.put(2,"SQL")
//		mainMap.put(3,"Python")
		
		def mainMap = [1:"Cats", 2:"Dogs", 3:"Wolves", 4:"Horse", 5:"Donkeys"]
		
		println ("Main Map is ")
		for (def mapKey : mainMap) {
			println (mapKey)
		}
		
		def newMap = mainMap.plus([4:"Groovy", 5:"API"])
		println newMap
		
		println newMap.values().sort()
		println newMap.values().sort{it.length()}
		
	}
}
