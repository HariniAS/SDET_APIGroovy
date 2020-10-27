package exercise

class ex5_ListOps {
	static void main (def args) {
		def mainList = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def size = mainList.size()
		def strList = []
		def intList = []
		for (def i=0; i< size; i++) {
			def valueType = mainList[i].getClass()
			//println valueType
			if (valueType == java.lang.Integer) {
				intList.add(mainList[i])
			}
			else {
				strList.add(mainList[i])
			}
		}
		println ("New sorted strList is "+ strList.sort())
		println ("New sorted intList is "+ intList.sort())
		
		
		// Practice
		println mainList.getAt(0..3)
		mainList.push("papaya")
		println mainList
		mainList.add("kiwi")
		println mainList
		mainList << [1,2,3]
		println mainList
		mainList << 10
		println mainList
		mainList.add(0, "Add@0")
		println ("Add : " +mainList)
		mainList.putAt(0, "replace@0")
		println ("Replace : "+ mainList)
		mainList.pop()
		println ("Pop : "+ mainList)
		mainList.remove(0)
		println ("Remove : "+ mainList)
		mainList.removeAt(0)
		println ("RemoveAt : "+ mainList)

	}
}
