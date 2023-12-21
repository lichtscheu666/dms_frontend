package de.annette.dms.frontend.action;

import java.util.concurrent.TimeUnit;

import com.opensymphony.xwork2.ActionSupport;

public class ExecAndWaitTestAction extends ActionSupport {

	public String test() throws InterruptedException {
		TimeUnit.SECONDS.sleep(15);
		return SUCCESS;
	}

}
