package Day12customeXpath;

public class Custom_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// html[@attributr='value'];
		////input[@id='input-email']
		////*[@id='input-email']
		
		
		//html[@att1='value'  and @att2='value']
		//button[@class='btn btn-primary btn-lg hidden-xs'  and @type='submit']
		//input[@placeholder='Username' and @type='text']
		
		//Dynamic id 
		/*
		 * <input id ="test_123">
		 * <input id ="test _234">
		 * <input id ="test_789">
		 * in this case every time number going to change that reason we need to use contains 
		*/
		
		//contains()
	    //html[contains(@att,'value')]
		////input[contains(@name,'firstname')]
		
		 // one with contains and one without contains 
		//input[contains(@name,'firstname')and @type='text'] 
		//input[contains(@type,'text') and @name='username']
		//input[contains(@name,'username') or @id='input-username']
		
		
		//text()
		//h3[text()='Register for OpenCart account']
		//(//ul[@class='list-check'])//li[text()='You will be in good hands. More than 350 000+ live stores']
		 //div[contains(@class,'bg-info') and text()='Click or touch the ']
		
		
		//start with 
		////a[starts-with(text(),'Deals')]
		//a[starts-with(text(),'Customer')]
		//a[starts-with(text(),'New Releases')]
		//a[starts-with(text(),'Best')]
		
		// indexing 
		//(//div[@class='navFooterColHead'])[1]
		//(//div[@class='navFooterLinkCol navAccessibility'])[4]
		
		//last()
		//(//div[@class='navFooterLinkCol navAccessibility'])[last()]
		//(//a[@class='nav_a'])[last()]
		
		
		
		
		
		
		
		
	}

}
