package com.walker.graphql.test;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

    @Test
    public void testMoney() {
        String str = "1.0";
        String pattern = "^([1-9][0-9]*)+(\\.[0-9]{1,2})?$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

    @Test
    public void testSpecifyString() {
        String goal = "The hackerrank team a team";
        String regex = "\\bteam\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(goal);
        if (matcher.find()) {
            System.err.println(matcher.group(0));
        }
    }

    @Test
    public void testUrl() {
        String str = "http://www.runoob.com:80/html/html-tutorial.html";
        String regex = "(\\w+)://([^/:]+)(:\\d*)?([^# ]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.err.println(matcher.group(0));
            System.err.println(matcher.group(1));
            System.err.println(matcher.group(2));
            System.err.println(matcher.group(3));
            System.err.println(matcher.group(4));
        }
    }
}
