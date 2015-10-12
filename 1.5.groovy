println "Enter two number to multiply (no * symbol used): "

print "1st number please: "
String sNr1 = System.console().readLine()
int iNr1 = Integer.parseInt(sNr1)

print "2st number please: "
String sNr2 = System.console().readLine()
int iNr2 = Integer.parseInt(sNr2)

int i = iNr2 //used for loop
int product_as_sum = 0
while (i > 0 ){
    product_as_sum = product_as_sum + iNr1
	System.out.println ("LOOP: " + i + " CURRENT SUM: " + product_as_sum)
	i--;
}
System.out.println ("FULL PRODUCT OF " + iNr1 + " AND " + iNr2 + " IS " + product_as_sum)