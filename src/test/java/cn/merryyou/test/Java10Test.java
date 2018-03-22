package cn.merryyou.test;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

/**
 * Created on 2018/3/22.
 *
 * @author zlf
 * @since 1.0
 */
public class Java10Test {

    @Test
    public void testLocalVal() {
        var blog = "https://longfeizheng.github.io/";
        System.out.println(blog);

    }

    @Test
    public void testListOf() {
        var blogList = List.of("http://www.merryyou.cn/", "https://longfeizheng.github.io/");
        blogList.forEach(System.out::println);
    }

    @Test
    public void testMapOf() {
        var blogMap = Map.ofEntries(
                entry("merryyou", "http://www.merryyou.cn/"),
                entry("longfeizheng", "https://longfeizheng.github.io/")
        );
        System.out.println(blogMap.get("longfeizheng"));
    }

    @Test
    public void testNonDenotableType() {
        var blogInfo = new Object() {
            String name = "longfeizheng";
            String url = "https://longfeizheng.github.io/";

            public void printInfo() {
                System.out.println("name = " + name + ", url =" + url);
            }
        };

        System.out.println("name = " + blogInfo.name + ", url = " + blogInfo.url);
        blogInfo.printInfo();
    }
}
