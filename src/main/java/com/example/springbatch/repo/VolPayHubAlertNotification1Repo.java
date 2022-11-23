package com.example.springbatch.repo;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springbatch.model.VolPayHubAlertNotification1;

@Repository
public class VolPayHubAlertNotification1Repo {
	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(VolPayHubAlertNotification1 items) {
		System.out.println("save");	
		try{
			entityManager.persist(items);
		}catch(EntityExistsException ex) {
			entityManager.merge(items);
		}
	}
}
