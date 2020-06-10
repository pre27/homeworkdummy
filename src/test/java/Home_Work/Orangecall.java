package Home_Work;

import java.io.IOException;

public class Orangecall {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WrapperMethod oc = new WrapperMethod();
		
		
		oc.Logininfo("https://opensource-demo.orangehrmlive.com/");
		oc.Xpathinfo("//*[@id='txtUsername']", "Admin");
		oc.Xpathinfo("//*[@id='txtPassword']", "admin123");
		oc.Buttoninfo("//*[@id='btnLogin']");
		oc.Buttoninfo("//*[@id='menu_recruitment_viewRecruitmentModule']/b");
		oc.Buttoninfo("//*[@id=\"menu_recruitment_viewCandidates\"]");
		oc.Dropdown("//*[@id=\"candidateSearch_status\"]", "INTERVIEW PASSED");
		oc.Screenshot("C:\\Tools\\Selenium\\screenorg.png");
		
		
	}

}
