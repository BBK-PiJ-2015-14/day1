println "Groovy Class 1.6: DIVISION"
println "Enter two numbers. 1st one will be divided by 2nd (no / or % used)"

print "1st number please: "
String sNr1 = System.console().readLine()
int iNr1 = Integer.parseInt(sNr1)

print "2st number please: "
String sNr2 = System.console().readLine()
int iNr2 = Integer.parseInt(sNr2)

int divider = 0
int testProduct = 0 
int remainer = 0
int product = 0

while (testProduct <= iNr1){
    divider++;	
	testProduct = divider * iNr2

	
	if (testProduct == iNr1) {
		divider = divider 
		break;
	}
	else if (testProduct > iNr1){
		divider = divider - 1 //compensate for current failed iteration
		break;	    
	}
	
	println "divider: " + divider + " Nr2: " + iNr2 + " prodct: " + testProduct
}
product = divider * iNr2
remainer = iNr1 - product
println "ANSWER: " + iNr1 + " divided by " + iNr2 + " = " + divider + " remainer " + remainer