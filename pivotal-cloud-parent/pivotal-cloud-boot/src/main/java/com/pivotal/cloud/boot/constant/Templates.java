package com.pivotal.cloud.boot.constant;

/**
 * @className: com.pivotal.cloud.boot.constant.Templates
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-Templates类，主要位于模板统一常量类模块
 * @content: Templates-模板统一常量类
 * @author: Powered by Marklin
 * @datetime: 2024-11-26 01:04
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
public interface Templates {
    /**
     * 应用编码
     */
    String APP_CODE = "pivotal-cloud";

    /**
     * Calendar
     */
    String CALENDAR = "Calendar";

    /**
     * DateTimes
     */
    String DATETIMES = "DateTimes";

    /**
     * DateTimes
     */
    String STRINGS = "Strings";


    interface Engine {
        /**
         * Freemarker模板
         */
        String FREEMARKER = "freemarker";

        /**
         * Velocity模板
         */
        String VELOCITY = "velocity";

        /**
         * Thymeleaf模板
         */
        String THYMELEAF = "thymeleaf";
    }
}
