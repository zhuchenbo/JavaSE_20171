package java1702.javase.oop;

import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/15/17 17:01
 */
// 闰年 西元年份除以400余数为0的,或者除以4余数为0且除以100余数不为0的,为闰年
public class Oop1 extends Object {

    @Override
    public String toString() {
//        return super.toString();
        return "test...";
    }

    //    Command + F12
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
//        Oop1 oop1 = new Oop1();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input year: ");
//        int year = scanner.nextInt();
//
//        if (oop1.isLeapYear(year)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
        DefaultClass defaultClass = new DefaultClass();
        System.out.println(defaultClass.toString()); // 隐式调用了 Object 的 toString 方法
//        System.out.println(defaultClass.i);
        defaultClass.method();
    }
}
