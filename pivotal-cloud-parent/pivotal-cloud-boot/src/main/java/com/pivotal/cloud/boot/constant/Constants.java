package com.pivotal.cloud.boot.constant;

import com.pivotal.cloud.boot.utils.StringsUtil;

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
     * 空白格
     */
    String SPACE = StringsUtil.SPACE;

    /**
     * 空字符串
     */
    String EMPTY = StringsUtil.EMPTY;

    /**
     * 空字符串
     */
    Integer DEFAULT = 0;

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

    /**
     * 常用数字
     */
    interface Digital {
        int NEGATIVE_ONE = -1;
        int ZERO = 0;
        int ONE = 1;
        int TWO = 2;
        int FOUR = 4;
        int EIGHT = 8;
        int SIXTEEN = 16;
    }

    /**
     * 日期时间匹配格式
     */
    interface Pattern {
        //
        // 常规模式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyy-MM-dd
         */
        String DATE = "yyyy-MM-dd";
        /**
         * yyyy-MM-dd HH:mm:ss
         */
        String DATETIME = "yyyy-MM-dd HH:mm:ss";
        /**
         * yyyy-MM-dd HH:mm
         */
        String DATETIME_MM = "yyyy-MM-dd HH:mm";
        /**
         * yyyy-MM-dd HH:mm:ss.SSS
         */
        String DATETIME_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
        /**
         * HH:mm
         */
        String TIME = "HH:mm";
        /**
         * HH:mm:ss
         */
        String TIME_SS = "HH:mm:ss";

        //
        // 系统时间格式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyy/MM/dd
         */
        String SYS_DATE = "yyyy/MM/dd";
        /**
         * yyyy/MM/dd HH:mm:ss
         */
        String SYS_DATETIME = "yyyy/MM/dd HH:mm:ss";
        /**
         * yyyy/MM/dd HH:mm
         */
        String SYS_DATETIME_MM = "yyyy/MM/dd HH:mm";
        /**
         * yyyy/MM/dd HH:mm:ss.SSS
         */
        String SYS_DATETIME_SSS = "yyyy/MM/dd HH:mm:ss.SSS";

        //
        // 无连接符模式
        // ----------------------------------------------------------------------------------------------------
        /**
         * yyyyMMdd
         */
        String NONE_DATE = "yyyyMMdd";
        /**
         * yyyyMMddHHmmss
         */
        String NONE_DATETIME = "yyyyMMddHHmmss";
        /**
         * yyyyMMddHHmm
         */
        String NONE_DATETIME_MM = "yyyyMMddHHmm";
        /**
         * yyyyMMddHHmmssSSS
         */
        String NONE_DATETIME_SSS = "yyyyMMddHHmmssSSS";

        /**
         * EEE MMM dd HH:mm:ss 'CST' yyyy
         */
        String CST_DATETIME = "EEE MMM dd HH:mm:ss 'CST' yyyy";

        //
        // 数字格式
        // ------------------------------------------------------------------------------
        /**
         * 无小数位 0
         */
        String NONE_DECIMAL = "0";
        /**
         * 一位小数 0.0
         */
        String ONE_DECIMAL = "0.0";
        /**
         * 两位小数 0.00
         */
        String TWO_DECIMAL = "0.00";
        /**
         * 千分位表示 无小数 #,##0
         */
        String TB_NONE_DECIMAL = "#,##0";
        /**
         * 千分位表示 一位小数 #,##0.0
         */
        String TB_ONE_DECIMAL = "#,##0.0";
        /**
         * 千分位表示 两位小数 #,##0.00
         */
        String TB_TWO_DECIMAL = "#,##0.00";

    }
}
