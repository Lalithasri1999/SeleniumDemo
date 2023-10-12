package Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.ListenerClass.class)
public class ListenerTestClass {
	@Test
	public void test1() {
		System.out.println("This is test1 method");
	}
	@Test
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("This is test2 method");
	}
	@Test
	public void test3() {
		System.out.println("This is test3 method");
	}
	@Test
	public void test4() {
		System.out.println("This is test4 method");
	}
	@Test
	public void test5() {
		System.out.println("This is test5 method");
	}

}
