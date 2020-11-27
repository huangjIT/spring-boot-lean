package com.hj.learn.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author HJ
 * @date 2020-10-21
 **/
@Component
public class EventListenerConfiguration {

    @EventListener(value = {ApplicationStartedEvent.class})
    public void dealEvent(ApplicationEvent event){
        System.out.println("eventListener:"+event.getClass());
    }

}
