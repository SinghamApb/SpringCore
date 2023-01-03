package com.spring.beanLifeCycle;

public class empl {
	private int empID;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	//Annotation for methods like @PostConstruct
	public void init()
	{
		System.out.println("InIT method called");
	}
	//Annotation for methods like @PreDestroy
	public void destroy() {
		
		System.out.println("DEstroy method called");
		
		
	}
	
	 //Annotation for methods like @PostConstruct and @PreDestroy for method init and for destroy

}
