package com.sunhome.boot.context.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wangqijia
 * @date 2019/11/18 13:42
 */
@Component
public class ConfigChangeListener implements ApplicationListener<ConfigChangeEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigChangeAnnotationListener.class);


    @Override
    public void onApplicationEvent(ConfigChangeEvent event) {
        System.out.println(" impl ApplicationListener 声明");

        Map<String, Object> configChangeInfo = event.getConfigChangeInfo();
        configChangeInfo.forEach((key, value) -> {
            LOGGER.info("key:{}  value:{}\n", key, value);
        });
    }



}
