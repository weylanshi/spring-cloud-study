package com.loc.study.springboot.app.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by weylan on 2017/12/14.
 */
public class GracefulShutdown implements TomcatConnectorCustomizer,ApplicationListener<ContextClosedEvent> {

    private volatile Connector connector;


    @Override
    public void customize(Connector connector) {
        this.connector =connector;
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        try {
            Thread.sleep(30000);
            connector.pause();//这时tomcat不会再接受新的外部的请求，
            Executor executor = connector.getProtocolHandler().getExecutor();//可以监控到内部运行的线程池
            if(executor instanceof ThreadPoolExecutor){
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executor;
                threadPoolExecutor.shutdown();
                threadPoolExecutor.awaitTermination(10, TimeUnit.SECONDS);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
