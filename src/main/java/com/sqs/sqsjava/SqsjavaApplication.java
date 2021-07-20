package com.sqs.sqsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SqsjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsjavaApplication.class, args);
	}

    @Bean
    public AmazonSQS createSQSClient() {
        return AmazonSQSClient.builder()
                .withCredentials(new ProfileCredentialsProvider())
                .withRegion(Regions.US_EAST_1)
                .build();
    }
}
