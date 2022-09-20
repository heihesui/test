package upgrade.text;

public class StringBlock_2 {
    /*文字块由零个或多个内容字符组成，从开始分隔符开始，到结束分隔符结束。
    开始分隔符是由三个双引号字符 (“”“) ，后面跟着的零个或多个空格，以及行结束符组成的序列。
    结束分隔符是一个由三个双引号字符 (”“”) 组成的序列。
    开始分隔符必须单独成行；三个双引号字符后面的空格和换行符都属于开始分隔符。*/
    public static void main(String[] args) {
        String textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>"Hello World!"</h1>
                    </body>
                </html>
                """;
        System.out.println("Here is the text block:\n" + textBlock);


    }
}
