package com.pivotal.cloud.boot;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * @className: com.pivotal.cloud.boot.Aspect
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-Aspect类，主要位于应用切面抽象父类接口模块
 * @content: Aspect-应用切面抽象父类接口
 * @author: Powered by Marklin
 * @datetime: 2024-11-24 00:56
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
public interface Aspect extends Ordered {
    Logger logger = LoggerFactory.getLogger(Aspect.class);

    /**
     * 切面环绕通知-@Around
     *
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    default Object aspectAround(ProceedingJoinPoint point) throws Throwable {
        return null;
    }

    /**
     * 切面切入之前-@Before
     *
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    default void aspectBefore(JoinPoint point) throws Throwable {
    }

    /**
     * 切面切入之后(返回)-@AfterReturning
     *
     * @param object 返回对象
     */
    default void aspectReturn(Object object) {
    }

    /**
     * 切面切入之后(错误)-@AfterThrowing
     *
     * @param exception 返回对象
     */
    default void aspectError(Throwable exception) {
    }

    /**
     * 切面切入之后-@After
     *
     * @throws Throwable 异常消息
     */
    default void aspectAfter() throws Throwable {
    }
}
