package lab1tsk2;

import java.util.*;

public class Reader {
	int i;
	int k;

	public void Scan() {
		System.out.println("Insert fitst number");
		Scanner scn1 = new Scanner(System.in);
		i = scn1.nextInt();
		System.out.println("Insert second number");
		Scanner scn2 = new Scanner(System.in);
		k = scn2.nextInt();
	}
}
