package io.github.underscore11code.compsci;

/*
* E--- D---
* March 15, 2021
* ObjectHeight
* Prints the height of an object, given the formula h=100-4.9*t2
*/

import java.util.Scanner;

public class ObjectHeight implements Runnable {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public void run() {
    System.out.print("Enter a time less than 4.5 seconds: ");
    float time = scanner.nextFloat();
    float height = 100f - 4.9f * time * 2;
    System.out.println("The height of the object is : " + height);
  }
}
