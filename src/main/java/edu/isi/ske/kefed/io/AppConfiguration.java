/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.isi.ske.kefed.io;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


/**
 * @author Gully Burns
 *
 * To run with different applicaiton properites, call
 * set the following flag when running the JVM for this application:
 *
 *     -DappConfig=file:/Users/Gully/Desktop/application.properties
 *
 * In the absence of this flag, we'll default to the contained properties file
 * in the classpath.
 *
 */
@Configuration
@PropertySource({"${appConfig:application.properties}"})
@EnableAutoConfiguration
@EnableWebSecurity
public class AppConfiguration {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(AppConfiguration.class);

	@PreDestroy
	public void deleteIndex() {
	}

	@PostConstruct
	public void buildAllFilesAndIndices() throws Exception {
	}


}
