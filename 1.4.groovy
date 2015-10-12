print "Enter number out if its a prime"
String str = System.console().readLine()
int i = Integer.parseInt(str)
int b = i - 1
int z = 0
Boolean prime = true
while (b > 1) {
	z = i % b
	System.out.println b + "<>" + z
	if (z == 0){
	    System.out.println ("NOT A PRIME. 1st DIVISION FOUND: " + b)
		prime = false
		break;
	}
    b--;
}
if (prime) {
    System.out.println ("PRIME. NO DIVISIONS FOUND!")
}
