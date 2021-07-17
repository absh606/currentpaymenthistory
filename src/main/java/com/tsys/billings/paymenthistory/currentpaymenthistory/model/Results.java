package com.tsys.billings.paymenthistory.currentpaymenthistory.model;

import java.util.ArrayList;
import java.util.List;

public class Results {
	
	List<History> list = new ArrayList<History>();
	
	public List<History> getList() {
		return list;
	}
	
	public void setList(List<History> list) {
		this.list = list;
	}
}
