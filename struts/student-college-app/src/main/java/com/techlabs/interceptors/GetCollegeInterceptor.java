package com.techlabs.interceptors;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.techlabs.actions.GetCollege;
import com.techlabs.model.College;
import com.techlabs.services.CollegeService;

public class GetCollegeInterceptor extends AbstractInterceptor {
	private CollegeService collegeservice = CollegeService.getInstancesOf();

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		List<College> listOfColleges = collegeservice.getColleges();
		
		Action action = (Action) invocation.getAction();
		if (action instanceof GetCollege) {
			((GetCollege) action).getCollegesForOptions(listOfColleges);
			System.out.println("coming inside getcollegeinterceptor");
		}
		return invocation.invoke();
	}
}
