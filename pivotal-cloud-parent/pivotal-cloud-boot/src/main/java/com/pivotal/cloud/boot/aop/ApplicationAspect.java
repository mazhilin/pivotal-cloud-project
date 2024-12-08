package com.pivotal.cloud.boot.aop;

import com.pivotal.cloud.boot.Aspect;

/**
 * @className: com.pivotal.cloud.boot.aop.ApplicationAspect
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-ApplicationAspect类，主要位于应用切面抽象接口模块
 * @content: ApplicationAspect-应用切面抽象接口
 * @author: Powered by Marklin
 * @datetime: 2024-12-08 14:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
public interface ApplicationAspect extends Aspect {
    /**
     * aspect切面-切入点
     */
    void aspectPoint();
}
