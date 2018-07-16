package com.cg.mypaymentapp.repo;

import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.exception.InvalidInputException;

public class WalletRepoImpl implements WalletRepo {

	private Map<String, Customer> data;

	public WalletRepoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}

	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		if (data.containsKey(mobileNo))
			return data.get(mobileNo);

		return null;
	}

	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		if (data.containsKey(customer.getMobileNo())) {
			return false;
		}
		data.put(customer.getMobileNo(), customer);
		return true;
	}

}
