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
@Table(name = "VolPayHubAlertNotification1")
public class VolPayHubAlertNotification1 {

	@Id	
	@Column(name = "UniqueReferenceId")
	private String UniqueReferenceId;
	@Column(name = "EventID")
	private String EventID;
	@Column(name = "SourceSystemId")
	private String SourceSystemId;
	//@OneToOne(targetEntity = Contents.class , mappedBy = "volPayHubAlertNotification1",cascade = CascadeType.ALL)	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "content_id", referencedColumnName = "contentId")
	private Contents Contents;

	public Contents getContents() {
		return Contents;
	}

	public void setContents(Contents contents) {
		this.Contents = contents;
	}	
	

	public String getUniqueReferenceId() {
		return UniqueReferenceId;
	}

	public void setUniqueReferenceId(String uniqueReferenceId) {
		this.UniqueReferenceId = uniqueReferenceId;
	}

	public String getEventID() {
		return EventID;
	}

	public void setEventID(String eventID) {
		this.EventID = eventID;
	}

	public String getSourceSystemId() {
		return SourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.SourceSystemId = sourceSystemId;
	}

	@Override
	public String toString() {
		return "VolPayHubAlertNotification1 [ UniqueReferenceId=" + UniqueReferenceId + ", EventID="
				+ EventID + ", SourceSystemId=" + SourceSystemId + ", Contents=" + Contents + "]";
	}
	
}
