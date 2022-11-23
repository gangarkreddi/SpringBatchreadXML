package com.example.springbatch.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import com.example.springbatch.model.VolPayHubAlertNotification1;

@Configuration
public class BatchConfig {
	@Autowired
	XmlItemWriter xmlItemWriter;
	@Autowired
	XmlItemProcessor XmlItemProcessor;

	@Bean
	public Job helloWorlJob(JobBuilderFactory jobBuilders, StepBuilderFactory stepBuilders) {
		return jobBuilders.get("xmlob2").start(xmlstep(stepBuilders)).build();
	}

	@Bean
	public Step xmlstep(StepBuilderFactory stepBuilders) {
		return stepBuilders.get("xmlstep").<VolPayHubAlertNotification1, VolPayHubAlertNotification1>chunk(10)
				.reader(xmlItemReader()).processor(XmlItemProcessor).writer(xmlItemWriter).build();
	}

	@Bean
	public StaxEventItemReader<VolPayHubAlertNotification1> xmlItemReader() {

		StaxEventItemReader<VolPayHubAlertNotification1> reader = new StaxEventItemReader<VolPayHubAlertNotification1>();
		reader.setResource(new ClassPathResource("persons.xml"));
		reader.setFragmentRootElementName("VolPayHubAlertNotification1");

		Map<String, String> aliasesMap = new HashMap<String, String>();
		aliasesMap.put("VolPayHubAlertNotification1", "com.example.springbatch.model.VolPayHubAlertNotification1");
		XStreamMarshaller marshaller = new XStreamMarshaller();
		marshaller.setAliases(aliasesMap);

		reader.setUnmarshaller(marshaller);
		return reader;
	}
}
