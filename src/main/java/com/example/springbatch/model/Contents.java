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
@Table(name = "Contents")
public class Contents {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contentId")
	private long contentId;
	@Column(name = "messageSubject")
	private String messageSubject;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paymentControl_Id", referencedColumnName = "paymentControlId")
	private PaymentControlDataNo PaymentControlDataNo;
	/*
	 * @OneToOne(targetEntity = VolPayHubAlertNotification1.class ,cascade =
	 * CascadeType.ALL)
	 * 
	 * @JoinColumn(name="UniqueReference_Id",referencedColumnName=
	 * "UniqueReferenceId") private VolPayHubAlertNotification1
	 * volPayHubAlertNotification1 ;
	 */

	public String getMessageSubject() {
		return messageSubject;
	}

	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	public long getContentId() {
		return contentId;
	}

	public void setContentId(long contentId) {
		this.contentId = contentId;
	}

	public PaymentControlDataNo getPaymentControlDataNo() {
		return PaymentControlDataNo;
	}

	public void setPaymentControlDataNo(PaymentControlDataNo paymentControlDataNo) {
		this.PaymentControlDataNo = paymentControlDataNo;
	}

	/*
	 * public VolPayHubAlertNotification1 getVolPayHubAlertNotification1() { return
	 * volPayHubAlertNotification1; }
	 * 
	 * public void setVolPayHubAlertNotification1(VolPayHubAlertNotification1
	 * volPayHubAlertNotification1) { this.volPayHubAlertNotification1 =
	 * volPayHubAlertNotification1; }
	 */

	/*
	 * public PaymentControlDataNo getPaymentControlDataNo() { return
	 * paymentControlDataNo; }
	 * 
	 * public void setPaymentControlDataNo(PaymentControlDataNo
	 * paymentControlDataNo) { this.paymentControlDataNo = paymentControlDataNo; }
	 */
}
