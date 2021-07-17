package com.tsys.billings.paymenthistory.currentpaymenthistory.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.History;

@Repository
public class PaymentHistoryDao {

	/* mocking up the dao implementaion
	 * with list of customer history
	 * 
	*/
	public List<History> getHistories(String customerId, String fromDate, String toDate, String limit, String offset) throws SQLException{
		List<History> histories = new ArrayList<History>();
		History history1  = new History("1001", "CC", "1001001001", "2021-07-05", "13:11:10.23436", "43.56", "Macy's");
		History history2  = new History("1002", "CC", "1001001001", "2021-07-09", "14:11:10.23436", "101.56", "Target");
		History history3  = new History("1003", "CC", "1001001001", "2021-07-10", "19:11:10.23436", "15.00", "MacDonald's");
		History history4  = new History("1004", "CC", "1001001001", "2021-07-11", "20:11:10.23436", "25.00", "Lowes");
		History history5  = new History("1005", "CC", "1001001001", "2021-07-12", "20:11:10.23436", "35.00", "HomeDepot");
		histories.add(history1);
		histories.add(history2);
		histories.add(history3);
		histories.add(history4);
		histories.add(history5);
		return histories;
	}
}
