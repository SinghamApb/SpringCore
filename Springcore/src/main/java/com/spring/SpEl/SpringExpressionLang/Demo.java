package com.spring.SpEl.SpringExpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+33}")// Its a expression #{ you can write any expression inside this}
	private int x;
	@Value("#{10+20}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")// Expression to invoke static method T(class).method(param)
	private double sq;
	
	@Value("#{ T(java.lang.Math).PI }")// Expression to invoke variable T(class).variable
	private double e;
	@Value("#{new java.lang.String('Tushar') }")// Expression to create object new Object(value)
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getSq() {
		return sq;
	}
	public void setSq(double sq) {
		this.sq = sq;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", sq=" + sq + ", e=" + e + ", name=" + name + "]";
	}
	

}
