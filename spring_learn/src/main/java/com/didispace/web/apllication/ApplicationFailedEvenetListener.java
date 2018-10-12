package com.didispace.web.apllication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by engle on 2018/10/12.
 */
@Slf4j
public class ApplicationFailedEvenetListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        System.out.println("......ApplicationFailedEvenetListener.....");
    }
}
