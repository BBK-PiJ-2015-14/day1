println "Groovy Class 1.6: DIVISION"
println "Enter two numbers. 1st one will be divided by 2nd (no / or % used)"

print "1st number please: "
String sNr1 = System.console().readLine()
int iNr1 = Integer.parseInt(sNr1)

print "2st number please: "
String sNr2 = System.console().readLine()
int iNr2 = Integer.parseInt(sNr2)

int divider = 1
int product = 0 
int remainer = 0

while (product <= iNr1){

	product = divider * iNr2
	println "divider: " + divider + " Nr2: " + iNr2 + " prodct: " + product
	
	if (product >= iNr1) {
		remainer = iNr2 - divider
		break;
	}
    divider++;		
}
println iNr1 + " divided by " + iNr2 + " equals " + divider + " remainer " + remainer