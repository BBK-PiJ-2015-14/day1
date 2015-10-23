//assignment 1.9

boolean isSequenceUp = true
String sNr = ""
Integer iNr = 0
Integer iNrPrev = 0

while (sNr != "-1"){
    println "Please enter an interger. Type '-1' to exit exit >> "  
    sNr = System.console().readLine()
    iNr = Integer.parseInt(sNr)
    
	//make sure fail is saved only once, do not count exit as fail, skip check when no previous value
	if (isSequenceUp && sNr != "-1" && iNrPrev > 0) {
	    if (iNrPrev+1 != iNr){
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