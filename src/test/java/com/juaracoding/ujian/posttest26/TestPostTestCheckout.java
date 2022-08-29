package com.juaracoding.ujian.posttest26;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import com.juaracoding.ujian.mingguke4.CheckOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPostTestCheckout {
	WebDriver driver;

	private CheckOut check = new CheckOut();

	public TestPostTestCheckout() {
		driver = HooksPosttest26.driver;
	}

	@When("User input data")
	public void User_input_data() {
		HooksPosttest26.delay(5);
		HooksPosttest26.scroll(300);
		check.isiCekOut();
		HooksPosttest26.delay(3);
		check.ChkAndBtn();
		System.out.println("memasukan data checkout");
	}

	@And("User click checkout")
	public void User_click_checkout() {
		check.CheckPlaceOrder();
		HooksPosttest26.delay(3);
		HooksPosttest26.scroll(900);
		System.out.println("Click place order");
	}

	@Then("User Your order has been received")
	public void User_Your_order_has_been_received() {
		String x = "Thank you. Your order has been received.";
		assertEquals(check.Succes(), x);
		System.out.println("menerima bukti order");
		System.out.println("Test Berhasil");
	}
}
