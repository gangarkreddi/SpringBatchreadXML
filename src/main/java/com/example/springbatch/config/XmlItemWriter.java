package com.example.springbatch.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbatch.model.VolPayHubAlertNotification1;
import com.example.springbatch.repo.VolPayHubAlertNotification1Repo;

@Component
public class XmlItemWriter implements ItemWriter<VolPayHubAlertNotification1> {

	@Autowired
	VolPayHubAlertNotification1Repo repo;

	@Override
	public void write(List<? extends VolPayHubAlertNotification1> items) throws Exception {
		items.forEach(person -> System.out.println(person.toString()));
		repo.save(items.get(0));

	}

}
