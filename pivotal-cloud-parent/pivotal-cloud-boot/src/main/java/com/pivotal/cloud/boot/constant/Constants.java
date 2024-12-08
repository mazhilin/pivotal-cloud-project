package com.pivotal.cloud.boot.constant;

/**
 * @className: com.pivotal.cloud.boot.constant.Constants
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-Constants类，主要位于全局统一常量模块
 * @content: Constants-全局统一常量
 * @author: Powered by Marklin
 * @datetime: 2024-11-26 01:02
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
public interface Constants {
    /**
     * UTF-8
     */
    String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    String GBK = "GBK";

    /**
     * 符号常量
     */
    interface Symbol {
        /**
         * 感叹号：!
         */
        String SIGH = "!";

        /**
         * 符号：@
         */
        String AT = "@";

        /**
         * 井号：#
         */
        String WELL = "#";

        /**
         * 美元符：$
         */
        String DOLLAR = "$";

        /**
         * 人民币符号：￥
         */
        String RMB = "￥";

        /**
         * 空格：
         */
        String SPACE = " ";

        /**
         * 换行符：\r\n
         */
        String LB = System.getProperty("line.separator");

        /**
         * 百分号：%
         */
        String PERCENTAGE = "%";

        /**
         * 符号：&amp;
         */
        String AND = "&";

        /**
         * 星号
         */
        String STAR = "*";

        /**
         * 中横线：-
         */
        String MIDDLE_LINE = "-";

        /**
         * 下划线：_
         */
        String LOWER_LINE = "_";

        /**
         * 等号：=
         */
        String EQUAL = "=";

        /**
         * 加号：+
         */
        String PLUS = "+";

        /**
         * 冒号：:
         */
        String COLON = ":";

        /**
         * 分号：;
         */
        String SEMICOLON = ";";

        /**
         * 逗号：,
         */
        String COMMA = ",";

        /**
         * 点号：.
         */
        String POINT = ".";

        /**
         * 斜杠：/
         */
        String SLASH = "/";

        /**
         * 竖杠：|
         */
        String VERTICAL_BAR = "|";

        /**
         * 双斜杠：//
         */
        String DOUBLE_SLASH = "//";

        /**
         * 反斜杠
         */
        String BACKSLASH = "\\";

        /**
         * 问号：?
         */
        String QUESTION = "?";

        /**
         * 左花括号：{
         */
        String LEFT_BIG_BRACE = "{";

        /**
         * 右花括号：}
         */
        String RIGHT_BIG_BRACE = "}";

        /**
         * 左中括号：[
         */
        String LEFT_MIDDLE_BRACE = "[";

        /**
         * 右中括号：[
         */
        String RIGHT_MIDDLE_BRACE = "]";

        /**
         * 反引号：`
         */
        String BACKQUOTE = "`";
    }
}
