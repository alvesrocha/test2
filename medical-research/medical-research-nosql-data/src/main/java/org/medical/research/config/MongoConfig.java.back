package org.medical.research.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {


	@Autowired
	private Environment env;
	
	@Override
	public Mongo mongo() throws Exception {
		MongoCredential credential = MongoCredential.createMongoCRCredential(env.getProperty("mongo.username"), env.getProperty("mongo.db"), env.getProperty("mongo.password").toCharArray());
		return new MongoClient(new ServerAddress(env.getProperty("mongo.address")), Arrays.asList(credential));
	}

	@Override
	protected String getDatabaseName() {
		return env.getProperty("mongo.db");
	}
}
