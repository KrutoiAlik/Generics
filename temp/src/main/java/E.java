import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {

    public static void main(String[] args) {
        String s = "<div>Из геометрии известно, в окружность можно вписать семь малых равных окружностей, одна располагается в центре. " +
                "Поместим вместо окружностей на рисунке 1, разнополярные частицы субстанции (разнополярные частицы вещества электромагнитного поля) и увидим истинную структуру первичного коллапсара.</div>\n" +
                "<div><img width=\"567\" vspace=\"8\" height=\"213\" align=\"absMiddle\" alt=\"\" src=\"./Новая фундаментальная физика (Статья А.Н. Ховалкина)_files/pic1.jpg\"></div>\n" +
                "<p>Рис. 1&nbsp;&nbsp; Слева, на рисунке 1 показаны силы притяжения (коллапс) между разнополярными зарядами частиц субстанции (частицами вещества электромагнитного поля), силы противодействующие бесконечному сжатию (коллапсу) показаны на рисунке справа. " +
                "В центре (Рис. 1) показано равновесие сил сжатия и сил противодействующих бесконечному сжатию в геометрической семёрке – коллапсаре. Расстояния между разнополярными зарядами в коллапсаре (Рис. 1) меньше расстояний между однополярными зарядами частиц субстанции и " +
                "поэтому силы противодействия сжатию между однополярными зарядами разрешают коллапс, но запрещают бесконечное сжатие (описание дано в книге).</p>\n";

        String text = "test a=\"1\" b=\"2\" c=\"3\" bar d=\"4\" e=\"5\"";
        System.out.println(text + "\n");
        Matcher m1 = Pattern.compile("<img[^>]* src=\\\"([^\\\"]*)\\\"[^>]*>")
                .matcher(s);

        while (m1.find()) {
            System.out.println(m1.group());
            System.out.println(m1.group(1));
            Matcher m2 = Pattern.compile("([a-z])=\"([0-9])\"").matcher(
                    m1.group(2));
            while (m2.find()) {
                System.out.println(" " + m2.group(1) + " -> " +
                        m2.group(2));
            }
        }
    }
}
