package com.spring.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterfaceExample implements InitializingBean, DisposableBean{
	
	
	private int pepsiPrice;

	public int getPepsiPrice() {
		return pepsiPrice;
	}

	public void setPepsiPrice(int pepsiPrice) {
		this.pepsiPrice = pepsiPrice;
	}

	@Override
	public String toString() {
		return "UsingInterfaceExample [pepsiPrice=" + pepsiPrice + "]";
	}



	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
