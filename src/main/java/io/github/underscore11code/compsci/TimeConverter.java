package io.github.underscore11code.compsci;

/*
* E--- D---
* March 15, 2021
* TimeConverter
* Converts given minutes to hours + minutes
*/

import java.util.Scanner;

public class TimeConverter implements Runnable {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public void run() {
    System.out.print("Enter the time in minutes: ");
    int time = scanner.nextInt();

    String hours = String.valueOf(time / 60);
    String minutes = String.valueOf(time % 60);
    if (minutes.length() == 1) minutes = "0" + minutes;

    System.out.printf("The time is: %s:%s\n", hours, minutes);
  }
}
