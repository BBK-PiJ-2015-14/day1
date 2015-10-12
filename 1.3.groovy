String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
    i++;
    String str1	= System.console().readLine()
    int j = Integer.parseInt(str1)
    if (j == 0) {
        break;
    } else if (j != 1) {
        println j;
    }
}
System.out.println("finished");