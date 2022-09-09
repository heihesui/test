package upgrade.text;

public class StringBlock_2 {
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
