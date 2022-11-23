package com.example.springbatch.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.springbatch.model.VolPayHubAlertNotification1;

@Component
public class XmlItemProcessor implements ItemProcessor<VolPayHubAlertNotification1, VolPayHubAlertNotification1> {

	@Override
	public VolPayHubAlertNotification1 process(VolPayHubAlertNotification1 person) throws Exception {
		return person;
	}
}