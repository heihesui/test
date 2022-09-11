package upgrade.nullp;

/*我们都知道空指针，它的发明者开玩笑似的，称它是一个价值 10 亿美元的错误；
同时呢，他还称 C 语言的 get 方法是一个价值 100 亿美元的错误。*/
public sealed interface Returned<T> {
    Returned.Undefined UNDEFINED = new Undefined();

    record ReturnValue<T>(T returnValue) implements Returned {
    }

    record Undefined() implements Returned {
    }

    record ErrorCode(Integer errorCode) implements Returned{

    }
}
