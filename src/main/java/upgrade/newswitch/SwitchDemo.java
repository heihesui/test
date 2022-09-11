package upgrade.newswitch;


import upgrade.sealed.Circle;
import upgrade.sealed.Rectangle;
import upgrade.sealed.Shape;
import upgrade.sealed.Square;

import java.util.Calendar;

public class SwitchDemo {
    private boolean isSquare(Shape shape) {
        return switch (shape) {
            case null, Circle c -> false;
            case Square s -> true;
            case Rectangle rectangle -> rectangle.length() == rectangle.width();
        };
    }

    /*1、break 语句的遗漏或者冗余，这样的错误如此得常见，甚至于被单列成了一个常见软件安全漏洞。
    凡是使用 switch 语句的代码，都有可能成为黑客们重点关注的对象。
    由于逻辑的错误和黑客的特殊关照，我们在编写代码的时候，需要十二分的小心；阅读代码的时候，
    也需要反复地查验 break 语句的前后语境。毫无疑问，这增加了代码维护的成本，降低了生产效率。
    2、反复出现的赋值语句。 在上面的代码中，daysInMonth 这个本地变量的变量声明和实际赋值是分开的。
    赋值语句需要反复出现，以适应不同的情景。如果在 switch 语句里，daysInMonth 变量没有被赋值，
    编译器也不会报错，缺省的或者初始的变量值就会被使用。
    CWE（Common Weakness Enumeration通用缺陷枚举）—— 由美国国土安全部国家计算机安全部门资助的软件安全战略性项目*/
    private int getDay1() {
        Calendar today = Calendar.getInstance();
        int month = today.get(Calendar.MONTH);
        int year = today.get(Calendar.YEAR);
        int daysInMonth = 0;
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
                break;
            case Calendar.APRIL:
            case Calendar.JUNE:
            case Calendar.SEPTEMBER:
            case Calendar.NOVEMBER:
                daysInMonth = 30;
                break;
            case Calendar.FEBRUARY:
                if (((year % 4 == 0) && !(year % 100 == 0))
                        || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
        }
        return daysInMonth;
    }

    private int getDay2() {
        Calendar today = Calendar.getInstance();
        int month = today.get(Calendar.MONTH);
        int year = today.get(Calendar.YEAR);
        return switch (month) {
            case Calendar.JANUARY, Calendar.MARCH, Calendar.MAY, Calendar.JULY, Calendar.AUGUST, Calendar.OCTOBER, Calendar.DECEMBER ->
                    31;
            case Calendar.APRIL, Calendar.JUNE, Calendar.SEPTEMBER, Calendar.NOVEMBER -> 30;
            case Calendar.FEBRUARY -> {
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new RuntimeException("Calendar in JDK does not work");
        };
    }
}
