package org.jiacheng.teo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// start maximised
		driver.manage().window().maximize();
		driver.get("https://coffee-cart.app/");

		// TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.
		// System.out.printf("Hello and welcome!");
		//
		// for (int i = 1; i <= 5; i++) {
		// 	// TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
		// 	// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
		// 	System.out.println("i = " + i);
		// }
	}
}