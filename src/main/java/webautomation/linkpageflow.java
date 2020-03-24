package webautomation;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.WebCapabilities;

public class linkpageflow extends WebCapabilities {
	@BeforeClass
	public void check() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority =1)
	public void firsturl() throws Exception{
		logger1 = extent.createTest("GuestPost");
		try {
			Thread.sleep(2000);
			driver.get("https://best.news5cleveland.com/how-to-learn-the-basics-of-sql-databases/");
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://wewsnews.com/how-to-learn-the-basics-of-sql-databases/" );
		logger1.info("verified");
		System.out.println("successfully verified");
		
		//secondurl
		Thread.sleep(2000);
		driver.get("https://best.abc15.com/managed-cloud-services-enable-businesses-to-outsource-their-it-needs/");
	
	String SURL = driver.getCurrentUrl();
	Assert.assertEquals(SURL, "http://www.arizonanewssource.com/managed-cloud-services-enable-businesses-to-outsource-their-it-needs/" );
	logger1.info("verified secondurl successfully");
	System.out.println("successfully verified2");
	
	//third url
	Thread.sleep(2000);
	driver.get("https://best.wmar2news.com/cache-solutions-for-databases/");

String TURL = driver.getCurrentUrl();
Assert.assertEquals(TURL, "https://wmar2baltimore.com/cache-solutions-for-databases/" );
logger1.info("verified third url successfully");
System.out.println("successfully verified3");

//fourth url

Thread.sleep(2000);
driver.get("https://best.kjrh.com/what-is-nosql-used-for/");

String FURL = driver.getCurrentUrl();
Assert.assertEquals(FURL, "http://www.kjrh2tulsa.com/what-is-nosql-used-for/" );
logger1.info("verified fourth url successfully");
System.out.println("successfully verified4");

//fifth url
Thread.sleep(2000);
driver.get("https://best.abcactionnews.com/why-to-use-nosql-in-your-project/");

String FIURL = driver.getCurrentUrl();
Assert.assertEquals(FIURL, "https://tampabayactionnews.com/why-to-use-nosql-in-your-project/" );
logger1.info("verified fifth url successfully");
System.out.println("successfully verified5");

//sixth url

Thread.sleep(2000);
driver.get("https://best.kivitv.com/the-benefits-of-using-cloud-servers-for-businesses/");

String SIXURL = driver.getCurrentUrl();
Assert.assertEquals(SIXURL, "https://www.intelligenceonline.net/the-benefits-of-using-cloud-servers-for-businesses/" );
logger1.info("verified sixth url successfully");
System.out.println("successfully verified6");

//seventh url

Thread.sleep(2000);
			driver.get("https://best.fox4now.com/top-benefits-of-using-a-cloud-storage-platform/");
		
		String SEVENURL = driver.getCurrentUrl();
		Assert.assertEquals(SEVENURL, "https://aimlv.com/top-benefits-of-using-a-cloud-storage-platform/" );
		logger1.info("verified seventh url successfully");
		System.out.println("successfully verified7");
		
		//eighth url
		
		Thread.sleep(2000);
		driver.get("https://best.turnto23.com/what-you-should-know-about-nosql-databases/");
	
	String EIURL = driver.getCurrentUrl();
	Assert.assertEquals(EIURL, "https://www.rftw.com/what-you-should-know-about-nosql-databases/" );
	logger1.info("verified eighth url successfully");
	System.out.println("successfully verified8");
	
	//ninth url
	
	Thread.sleep(2000);
	driver.get("https://best.abcactionnews.com/cloud-servers-how-they-work-and-why-is-it-important-to-your-business");

String NIURL = driver.getCurrentUrl();
Assert.assertEquals(NIURL, "https://tampabayactionnews.com/cloud-servers-how-they-work-and-why-is-it-important-to-your-business/" );
logger1.info("verified ninth url successfully");
System.out.println("successfully verified9");

//tenth url

Thread.sleep(2000);
driver.get("https://best.tmj4.com/how-to-find-quality-server-analytics-services/");

String TENURL = driver.getCurrentUrl();
Assert.assertEquals(TENURL, "http://www.ccnews.net/how-to-find-quality-server-analytics-services/" );
logger1.info("verified tenth url successfully");
System.out.println("successfully verified10");

//eleventh url

Thread.sleep(2000);
driver.get("https://best.kivitv.com/how-to-find-the-best-server-developers/");

String ELEURL = driver.getCurrentUrl();
Assert.assertEquals(ELEURL, "https://www.intelligenceonline.net/how-to-find-the-best-server-developers/" );
logger1.info("verified eleventh url successfully");
System.out.println("successfully verified11");

//12th url

Thread.sleep(2000);
driver.get("https://best.wxyz.com/n1ql-development-combines-sql-and-json/");

String TWEURL = driver.getCurrentUrl();
Assert.assertEquals(TWEURL, "https://www.detroitnews7.com/n1ql-development-combines-sql-and-json/" );
logger1.info("verified twelvth url successfully");
System.out.println("successfully verified12");

//13th url

Thread.sleep(2000);
driver.get("https://best.wcpo.com/overview-of-nosql-databases/");

String THIRTEENURL = driver.getCurrentUrl();
Assert.assertEquals(THIRTEENURL, "https://www.cincinewsnow.com/overview-of-nosql-databases/" );
logger1.info("verified thirteenth url successfully");
System.out.println("successfully verified13");

//14th url

Thread.sleep(2000);
driver.get("https://best.10news.com/scalable-databases-for-your-web-application/");

String FOURTEENURL = driver.getCurrentUrl();
Assert.assertEquals(FOURTEENURL, "https://news10sandiego.com/scalable-databases-for-your-web-application/" );
logger1.info("verified fourteenth url successfully");
System.out.println("successfully verified14");

//15th url

Thread.sleep(2000);
driver.get("https://best.3newsnow.com/benefits-of-agile-development/");

String FIFTEENURL = driver.getCurrentUrl();
Assert.assertEquals(FIFTEENURL, "http://newsigdigital.com/benefits-of-agile-development/" );
logger1.info("verified fifteenth url successfully");
System.out.println("successfully verified15");

//16th url

Thread.sleep(2000);
driver.get("https://best.news5cleveland.com/the-benefits-of-cloud-databases-for-businesses/");

String SIXTEENURL = driver.getCurrentUrl();
Assert.assertEquals(SIXTEENURL, "https://wewsnews.com/the-benefits-of-cloud-databases-for-businesses/" );
logger1.info("verified sixteenth url successfully");
System.out.println("successfully verified16");


//17th url

Thread.sleep(2000);
driver.get("https://best.abc15.com/benefits-of-using-cloud-servers/");

String SEVENTEENURL = driver.getCurrentUrl();
Assert.assertEquals(SEVENTEENURL, "http://www.arizonanewssource.com/benefits-of-using-cloud-servers/" );
logger1.info("verified seventeenth url successfully");
System.out.println("successfully verified17");

//18th url

Thread.sleep(2000);
driver.get("https://best.tv20detroit.com/top-4-easy-web-management-servers/");

String EIGTEENURL = driver.getCurrentUrl();
Assert.assertEquals(EIGTEENURL, "http://www.detroit20.com/top-4-easy-web-management-servers/" );
logger1.info("verified eighteenth url successfully");
System.out.println("successfully verified18");


//19th url

Thread.sleep(2000);
driver.get("https://best.fox47news.com/top-4-scalable-servers/");

String NURL = driver.getCurrentUrl();
Assert.assertEquals(NURL, "https://www.brandnamenews.com/top-4-scalable-servers/" );
logger1.info("verified ninteenth url successfully");
System.out.println("successfully verified19");

//20th url

Thread.sleep(2000);
driver.get("https://best.kgun9.com/an-insight-into-memcached/");

String TYURL = driver.getCurrentUrl();
Assert.assertEquals(TYURL, "http://tucson9news.com/an-insight-into-memcached/" );
logger1.info("verified twentieth url successfully");
System.out.println("successfully verified20");

//21st url

Thread.sleep(2000);
driver.get("https://best.tv20detroit.com/top-things-you-need-to-understand-about-memcached/");

String TFURL = driver.getCurrentUrl();
Assert.assertEquals(TFURL, "http://www.detroit20.com/top-things-you-need-to-understand-about-memcached/" );
logger1.info("verified twentyfirst url successfully");
System.out.println("successfully verified21");


//22nd url

Thread.sleep(2000);
driver.get("https://best.news5cleveland.com/memcached-system-architecture/");

String TSURL = driver.getCurrentUrl();
Assert.assertEquals(TSURL, "https://wewsnews.com/memcached-system-architecture/" );
logger1.info("verified twentysecond url successfully");
System.out.println("successfully verified22");

//23rd url

Thread.sleep(2000);
driver.get("https://best.news5cleveland.com/using-memcached-to-speed-up-your-python-applications/");

String TTURL = driver.getCurrentUrl();
Assert.assertEquals(TTURL, "https://wewsnews.com/using-memcached-to-speed-up-your-python-applications/" );
logger1.info("verified twentythird url successfully");
System.out.println("successfully verified23");


//24th url

Thread.sleep(2000);
driver.get("https://best.abc15.com/useful-guide-on-finding-effective-memcached-services/");

String TFOURL = driver.getCurrentUrl();
Assert.assertEquals(TFOURL, "http://www.arizonanewssource.com/useful-guide-on-finding-effective-memcached-services/" );
logger1.info("verified twentyfourth url successfully");
System.out.println("successfully verified24");

//25th url
Thread.sleep(2000);
driver.get("https://best.theindychannel.com/what-are-cloud-servers-and-how-do-they-work/");

String TFIURL = driver.getCurrentUrl();
Assert.assertEquals(TFIURL, "http://rtv6indy.com/what-are-cloud-servers-and-how-do-they-work/" );
logger1.info("verified twentyfifth url successfully");
System.out.println("successfully verified25");

//26th url

Thread.sleep(2000);
driver.get("https://best.wxyz.com/nosql-memcached-server-pros-and-cons-of-non-relational-databases/");

String TSIXURL = driver.getCurrentUrl();
Assert.assertEquals(TSIXURL, "https://www.detroitnews7.com/nosql-memcached-server-pros-and-cons-of-non-relational-databases/" );
logger1.info("verified twentySixth url successfully");
System.out.println("successfully verified26");

//27th url
Thread.sleep(2000);
driver.get("https://best.wcpo.com/the-benefits-and-drawbacks-of-nosql-databases/");

String TSEVEURL = driver.getCurrentUrl();
Assert.assertEquals(TSEVEURL, "https://www.cincinewsnow.com/the-benefits-and-drawbacks-of-nosql-databases/" );
logger1.info("verified twentySeventh url successfully");
System.out.println("successfully verified27");

//28th url
Thread.sleep(2000);
driver.get("https://best.turnto23.com/the-benefits-of-using-server-analytics-to-track-website-visitors/");

String TEEURL = driver.getCurrentUrl();
Assert.assertEquals(TEEURL, "https://www.rftw.com/the-benefits-of-using-server-analytics-to-track-website-visitors/" );
logger1.info("verified twentyEighth url successfully");
System.out.println("successfully verified28");

//29TH URL

Thread.sleep(2000);
driver.get("https://best.fox47news.com/reasons-why-business-should-consider-cloud-servers-over-dedicated-servers/");

String TNIURL = driver.getCurrentUrl();
Assert.assertEquals(TNIURL, "https://www.brandnamenews.com/reasons-why-business-should-consider-cloud-servers-over-dedicated-servers/" );
logger1.info("verified twentyNinth url successfully");
System.out.println("successfully verified29");

//30TH URL
Thread.sleep(2000);
driver.get("https://best.tmj4.com/making-improvements-with-agile-development/");

String THHURL = driver.getCurrentUrl();
Assert.assertEquals(THHURL, "http://www.ccnews.net/making-improvements-with-agile-development/" );
logger1.info("verified Thirtieth url successfully");
System.out.println("successfully verified30");

//31st url
Thread.sleep(2000);
driver.get("https://best.3newsnow.com/guide-on-finding-easy-web-management-servers/");

String THFIURL = driver.getCurrentUrl();
Assert.assertEquals(THFIURL, "http://newsigdigital.com/guide-on-finding-easy-web-management-servers/" );
logger1.info("verified Thirtyfirst url successfully");
System.out.println("successfully verified31");

//32ND URL
Thread.sleep(2000);
driver.get("https://best.wxyz.com/understanding-memcached-python/");

String THSEURL = driver.getCurrentUrl();
Assert.assertEquals(THSEURL, "https://www.detroitnews7.com/understanding-memcached-python/" );
logger1.info("verified Thirtysecond url successfully");
System.out.println("successfully verified32");

//33rd URL
Thread.sleep(2000);
driver.get("https://best.wcpo.com/using-memcached-servers-to-speed-up-your-applications/");

String THTHURL = driver.getCurrentUrl();
Assert.assertEquals(THTHURL, "https://www.cincinewsnow.com/using-memcached-servers-to-speed-up-your-applications/" );
logger1.info("verified Thirtythird url successfully");
System.out.println("successfully verified33");

		
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		Thread.sleep(3000);

		logger1.pass("Testcase  linkpageflow is Passed");
		
	}
	/*
	@Test(priority = 2)
	public void secondurl() throws Exception{
		logger1 = extent.createTest("linkpage");
		try {
			Thread.sleep(2000);
			driver.get("https://best.abc15.com/managed-cloud-services-enable-businesses-to-outsource-their-it-needs/");
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://www.arizonanewssource.com/managed-cloud-services-enable-businesses-to-outsource-their-it-needs/" );
		logger1.info("verified secondurl successfully");
		System.out.println("successfully verified2");
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		
		
	}

@Test(priority = 3)
	public void thirdurl() throws Exception{
		logger1 = extent.createTest("linkpage");
		try {
			Thread.sleep(2000);
			driver.get("https://best.wmar2news.com/cache-solutions-for-databases/");
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://wmar2baltimore.com/cache-solutions-for-databases/" );
		logger1.info("verified third url successfully");
		System.out.println("successfully verified3");
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		
		
	}

@Test(priority = 4)
	public void fourthurl() throws Exception{
		logger1 = extent.createTest("linkpage");
		try {
			Thread.sleep(2000);
			driver.get("https://best.kjrh.com/what-is-nosql-used-for/");
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://www.kjrh2tulsa.com/what-is-nosql-used-for/" );
		logger1.info("verified fourth url successfully");
		System.out.println("successfully verified4");
		}
		catch(Exception e) {
			logger1.fail(e);                           
			throw e;
		}
		
		
	}*/
}
