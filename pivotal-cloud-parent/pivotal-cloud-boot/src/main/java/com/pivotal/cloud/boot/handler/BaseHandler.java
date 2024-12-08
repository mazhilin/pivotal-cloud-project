package com.pivotal.cloud.boot.handler;

import com.pivotal.cloud.boot.Handler;
import com.pivotal.cloud.boot.constant.Constants;

/**
 * @className: com.pivotal.cloud.boot.handler.BaseHandler
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-BaseHandler类，主要位于统一基础操作类型接口模块
 * @content: BaseHandler-统一基础操作类型接口
 * @author: Powered by Marklin
 * @datetime: 2024-12-08 15:43
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
public interface BaseHandler extends Handler {

    /**
     * 索引-index
     *
     * @return desc
     */
    default Integer index() {
        return Constants.DEFAULT;
    }

    /**
     * 编码-code
     *
     * @return code
     */
    default String code() {
        return Constants.EMPTY;
    }

    /**
     * 名称-name
     *
     * @return name
     */
    default String name() {
        return Constants.EMPTY;
    }

    /**
     * 标题-title
     *
     * @return title
     */
    default String title() {
        return Constants.EMPTY;
    }

    /**
     * 码值-value
     *
     * @return value
     */
    default Integer value() {
        return Constants.DEFAULT;
    }

    /**
     * 描述-desc
     *
     * @return desc
     */
    default String desc() {
        return Constants.EMPTY;
    }

    /**
     * 实例名称-instance
     *
     * @return instance
     */
    default String instance() {
        return Constants.EMPTY;
    }

    /**
     * 来源/类型-source
     *
     * @return source
     */
    default Integer source() {
        return Constants.DEFAULT;
    }

    /**
     * 前缀-prefix
     *
     * @return prefix
     */
    default String prefix() {
        return Constants.EMPTY;
    }

    /**
     * 后缀-suffix
     *
     * @return suffix
     */
    default String suffix() {
        return Constants.EMPTY;
    }

    /**
     * 长度-prefix
     *
     * @return prefix
     */
    default Integer length() {
        return Constants.DEFAULT;
    }

    /**
     * 应用信息-message
     *
     * @return message
     */
    default String message() {
        return Constants.EMPTY;
    }

    /**
     * 签名-negate
     *
     * @return negate
     */
    default Boolean negate() {
        return Boolean.FALSE;
    }

    /**
     * 单位-unit
     *
     * @return unit
     */
    default String unit() {
        return Constants.EMPTY;
    }

    /**
     * 组-group
     *
     * @return group
     */
    default String group() {
        return Constants.EMPTY;
    }

    /**
     * URL地址-urls
     *
     * @return urls
     */
    default String urls() {
        return Constants.EMPTY;
    }

    /**
     * 路径-path
     *
     * @return path
     */
    default String path() {
        return Constants.EMPTY;
    }

    /**
     * 图标-icon
     *
     * @return icon
     */
    default String icon() {
        return Constants.EMPTY;
    }

    /**
     * 背景图-image
     *
     * @return image
     */
    default String image() {
        return Constants.EMPTY;
    }

    /**
     * 元数据-meta
     *
     * @return meta
     */
    default String meta() {
        return Constants.EMPTY;
    }

    /**
     * 颜色-color
     *
     * @return color
     */
    default String color() {
        return Constants.EMPTY;
    }
}
