package com.tsys.billings.paymenthistory.currentpaymenthistory.services;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tsys.billings.paymenthistory.currentpaymenthistory.dao.PaymentHistoryDao;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Error;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Errors;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.History;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Output;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Response;
import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Results;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentHistoryService {
	
	@Autowired
	PaymentHistoryDao paymentHistoryDao;

	public Response getCurrentHistory(String customerId, String fromDate, String toDate, String limit, String offset) {
		Response response = new Response();
		Output output = new Output();
		Results histResult = new Results();
		Errors errors = new Errors();
		List<History> histories = Collections.emptyList();
		List<Error> errorlist = Collections.emptyList();
		try {
			histories = paymentHistoryDao.getHistories(customerId, fromDate, toDate, limit, offset);
		}catch(SQLException exception) {
			com.tsys.billings.paymenthistory.currentpaymenthistory.model.Error error = new Error();
			error.setErrorCode("4000");
			error.setErrorCode("SQL Error");
			errorlist.add(error);
			log.error("database error");
		}catch(Exception exception) {
			Error error = new Error();
			error.setErrorCode("5000");
			error.setErrorCode("Generic Error");
			errorlist.add(error);
			log.error("Generic Error");
		}
		histResult.setList(histories);
		output.setResult(histResult);
		errors.setList(errorlist);
		response.setOutput(output);
		return response;
	}

}
