package com.trackme.common.threadpool;

import com.trackme.common.utils.ApplicationContextUtil;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


/**
 * @description  线程池执行类  单例
 * @author: wuwenjie
 * @data: 2020/5/14 14:56
 */
public class ThreadPoolManager {

    private ThreadPoolManager() {
    }

    private static ThreadPoolManager me = new ThreadPoolManager();

    //返回单例
    public static ThreadPoolManager me() {
        return me;
    }

    //线程池
    private ThreadPoolTaskExecutor threadPoolExecutor = ApplicationContextUtil.getApplicationContext().getBean(ThreadPoolTaskExecutor.class);

    //交给线程池执行
    public void execute(Runnable runnable) {
        threadPoolExecutor.execute(runnable);
    }

    /**
     *  关闭线程池，不再接受新的任务，之前提交的任务等执行结束再关闭线程池
     */
    public void shutdown() {
        threadPoolExecutor.shutdown();
    }
}
