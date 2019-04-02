package com.xingyun.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.xingyun.properties.KafkaTopicCustomProperties;

/**
 * 配置自定义Properties属性
 * */
@EnableConfigurationProperties({
	KafkaTopicCustomProperties.class
})
@Configuration
public class EnableCustomPropertiesConfig {
	/**
	 * 静态方法是没有办法调用这个配置文件内容的
	 * 
	 * **/
}
