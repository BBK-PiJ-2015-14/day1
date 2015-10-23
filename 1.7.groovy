//this is somewhat different from assignment
//double checking if I remember correctly bubble sort
//this will work with not 3 but a larger sequence of numbers

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


boolean isOrdered = false
while (!isOrdered){
    //false set check at each iteration
	isOrdered = true
	
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
				
                //make sure check only happens once per iteration
				if (isOrdered){
					isOrdered = false
				}
		    }
	    }
    }
}

println "Repeating Initial sequence..."
for (Integer element : toSortOriginal) {
   System.out.println(element)
}
println ""

println "Displaying bubble-sorted sequence..."
for (Integer element : toSort) {
   System.out.println(element)
}
println ""

println "Double checking using list.sort()..."
toSortOriginal.sort()
for (Integer element : toSortOriginal) {
   System.out.println(element)
}
println ""

