package com.example.springbatch.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "PaymentControlData")
public class PaymentControlDataNo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paymentControlId")
	private long paymentControlId;
	public String officeCode;
	public String branchCode;	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructionData_Id", referencedColumnName = "InstructionDataId")
	private InstructionData InstructionData;
	public long getPaymentControlId() {
		return paymentControlId;
	}

	public void setPaymentControlId(long paymentControlId) {
		this.paymentControlId = paymentControlId;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

}
