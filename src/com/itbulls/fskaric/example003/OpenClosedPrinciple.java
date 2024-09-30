package com.itbulls.fskaric.example003;

import java.math.BigDecimal;

public class OpenClosedPrinciple {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		cus.cusId = BigDecimal.ZERO;
		cus.cusTypId = BigDecimal.valueOf(2021);
		cus.cusSubTypId = BigDecimal.valueOf(1);
		cus.birthCouId = BigDecimal.valueOf(2);
		
		if (cus.cusTypId.equals(BigDecimal.valueOf(2021))) {

			if ( cus.cusSubTypId.equals(BigDecimal.valueOf(2021)) &&
					cus.birthCouId.equals(BigDecimal.valueOf(2))) {
				
				//some logic
			} else if ( cus.birthCouId.equals(BigDecimal.valueOf(3))) {
				
				//some logic
			} 
//			else if ( checkIsCusIdActive(cus.cusId)) {
//				
//				//some logic
//			}
		} else if (cus.cusTypId.equals(BigDecimal.valueOf(4021))) {
			//some other logic
		}
	}
}
