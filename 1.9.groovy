boolean isSequenceUp = true
String sNr = ""
Integer iNr = 0
Integer iNrPrev = 0

while (sNr != "-1"){
    println "Please enter an interger. Type '-1' to exit exit >> "  
    sNr = System.console().readLine()
    iNr = Integer.parseInt(sNr)
    
	//make sure fail is saved only once, do not count exit as fail
	if (isSequenceUp && sNr != "-1") {
	    if (iNr <= iNrPrev){
		    isSequenceUp = false
		}	
	}
	
	iNrPrev = iNr
}

if (isSequenceUp) {
    println "Yes"
}
else {
	println "No"
}