package pl.sda.tasks.weekend2.encapsulation.task.items;

public class ItemUtil {
    public static String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}