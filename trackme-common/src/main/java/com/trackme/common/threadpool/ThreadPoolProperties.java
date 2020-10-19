package com.trackme.common.threadpool;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @title ThreadPoolProperties.java
 * @description 
		  线程池参数维护
*/

@ConfigurationProperties(prefix = "thread.pool")
@Configuration
@ConditionalOnProperty(prefix="thread.pool",value={"corePoolSize", "maxPoolSize", "queueCapacity", "keepAliveSeconds"}, matchIfMissing=false)
@Getter
@Setter
public class ThreadPoolProperties {
	
	private int corePoolSize;
	
	private int maxPoolSize;
	
	private int queueCapacity;
	
	private int keepAliveSeconds;
	
}
