package diff.exceptiondemo;

import lombok.SneakyThrows;

public class ExceptionDemo {
    //反对检查异常的最大论点是，大多数异常无法修复。一个简单的事实是，我们的子系统都是正常的，
    //我们看不到具体实现逻辑，我们对此不负责，也无法修复其中的异常，所以不要往上层抛出可检查异常。
    private void test1() throws Exception {
        throw new Exception();
    }
    private void test2() throws Exception {
        test1();
    }
    @SneakyThrows
    private void test3(){
        test2();
    }
}
