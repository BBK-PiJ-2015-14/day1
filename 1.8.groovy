//this is actually modification of my previous 1.7 example
//in this case we are only interested in a single scan which will
//flip highest number to the last index value of the list

boolean isContinue = true
List<Integer> toSort = new ArrayList<Integer>()
List<Integer> toSortOriginal = new ArrayList<Integer>()

// Collect Numbers
while (isContinue) {
  println "Please add an integer to a list. Type a letter to exit >> "  
  String sNr2 = System.console().readLine()
  try{
     toSort.push (Integer.parseInt(sNr2))  
  }
  catch (all){
	  isContinue = false
  }
}

//make backup of the list
toSortOriginal = toSort.collect()

println "Exiting collection: Total " + toSort.size + " numbers collected!"



	
// My attempt at bubble sort. Not tried in 20 years.
for (x in 0..toSort.size-1) {
    //make sure we only swap if less than last pos
    if (x < toSort.size-1){
        //if current index value is greater then next then swap
        Integer idxThis = toSort[x]
        Integer idxNext = toSort[x+1]
        if (idxThis > idxNext ){
            toSort[x] = idxNext
            toSort[x+1] = idxThis
        }
    }
}

println "Repeating Initial sequence..."
for (Integer element : toSortOriginal) {
   System.out.println(element)
}
println ""

println "Displaying single pass sorted (highest to the end) sequence..."
for (Integer element : toSort) {
   System.out.println(element)
}
println ""

println "Therefore highest entered number is: " + toSort[toSort.size-1]

