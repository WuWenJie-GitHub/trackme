package com.trackme.webgis.core.init;

import com.trackme.webgis.core.threadpool.ThreadPoolManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * @description 初始化
 * @author: wuwenjie
 */
@Slf4j
@Configuration
public class CommonStartConfig implements InitializingBean, DisposableBean {


    /**
     * 容器销毁执行
     */
    @Override
    public void destroy() throws Exception {
        log.info("---------------容器销毁启动执行---------------");

        //关闭线程池
        ThreadPoolManager.me().shutdown();

        log.info("---------------容器销毁启动执行完成---------------");
    }

    /**
     * spring初始化执行
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("---------------初始化启动执行---------------");
    }
}
