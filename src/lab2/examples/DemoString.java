package lab2.examples;

public class DemoString {
	public static void main(String[] args) {
		char s[] = { 'J', 'a', 'v', 'a' };
		int i = 2;
		// Comment contents code execution result
		String str = new String(s);// str = "Java"
		System.out.println("str = " + str);
		i = str.length();// i = 4
		System.out.println("i = " + i);
		String num = String.valueOf(2);// num = 2
		System.out.println("num =  " + num);
		str = str.toUpperCase();// str = "JAVA"
		System.out.println("str = " + str);
		num = str.concat(num);// num = "Java2"
		System.out.println("num = " + num);
		str = str + "C";// str = "JavaC"
		System.out.println("str = " + str);
		char ch = str.charAt(2);// ch = 'V'
		System.out.println("ch = " + ch);
		i = str.lastIndexOf('A');// i = 3(-1 if missed)
		System.out.println("i = " + i);
		num = num.replace('2', 'H');// num = "JavaH"
		System.out.println("num = " + num);
		i = num.compareTo(str);// i = 5 (between characters 'H' & 'C')
		System.out.println("i = " + i);
		str.substring(0, 3).toLowerCase();// java
		System.out.println("str = " + str);
	}
}
