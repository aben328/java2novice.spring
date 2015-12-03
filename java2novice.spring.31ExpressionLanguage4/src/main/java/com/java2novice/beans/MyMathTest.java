package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myMathTestBean")
public class MyMathTest {

	@Value("#{myNumberBean.no == 1016}")
	private boolean isEqual;

	@Value("#{myNumberBean.no > 300}")
	private boolean isGreaterThan;

	@Value("#{myNumberBean.no != 1015}")
	private boolean isNotEquals;

	@Value("#{myNumberBean.no > 1000 and myNumberBean.no < 2000}")
	private boolean isInBetween;

	@Value("#{myNumberBean.no == 1000 or myNumberBean.no eq 2000}")
	private boolean isEitherOr;

	@Value("#{myNumberBean.no + 2000}")
	private int sumValue;

	@Value("#{myNumberBean.no / 16}")
	private int divisionValue;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("isEqual: ").append(isEqual).append("\n");
		sb.append("isGreaterThan: ").append(isGreaterThan).append("\n");
		sb.append("isNotEquals: ").append(isNotEquals).append("\n");
		sb.append("isInBetween: ").append(isInBetween).append("\n");
		sb.append("isEitherOr: ").append(isEitherOr).append("\n");
		sb.append("sumValue: ").append(sumValue).append("\n");
		sb.append("divisionValue: ").append(divisionValue).append("\n");
		return sb.toString();
	}
}
