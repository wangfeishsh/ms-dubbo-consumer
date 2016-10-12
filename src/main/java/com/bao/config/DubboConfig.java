package com.bao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resources;

/**
 * Created by baochunyu on 2016/6/22.
 */
//@Order(100)
@Configuration
//@ImportResource({"classpath:application-dubbo-action.xml","classpath:application-dubbo-consumer.xml"})
@ImportResource({"classpath:application-dubbo-action.xml","classpath:application-dubbo-consumer.xml"})
public class DubboConfig {
}
