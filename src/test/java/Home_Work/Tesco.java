package Home_Work;

public class Tesco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WrapperMethod oc = new WrapperMethod();


		
		oc.Logininfo("https://www.tesco.com/groceries/en-GB/");
		oc.Buttoninfo("//*[@id='utility-header-login-link']/span");
		oc.Xpathinfo("//*[@id=\"username\"]", "mpre26@yahoo.co.in");
		oc.Xpathinfo("//*[@id='password']", "Nannupriya4*"); 	
		oc.Buttoninfo("//*[@id=\"sign-in-form\"]/button/span");
		oc.Buttoninfo("//*[@id=\"content\"]/div/div/div[1]/div/header/div[2]/div/div/div[2]/a");
		oc.Buttoninfo("//*[@id=\"main\"]/div[1]/div/div[1]/div[2]/div/div/div[1]/a");
		oc.Buttoninfo("//*[@id=\"slot-matrix\"]/div[3]/div[2]/div/div/div[1]/div[2]/div/p");
		

	
		

	}

}
