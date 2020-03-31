/*
– Извиква метод, който създава и пише върху току що създадената страница
– Добавя даден текст върху страница с определен номер (изтрива
предишния и записва новия)
– Да трие текста от дадена страница
– Да преглежда всички страници (да принтира на конзолата
заглавието и текста)
 */
public interface Notepad {
    /**
     * Creates a new page using the provided parameters in the Notepad
     *
     * @param title the title you want the page to have
     * @param text the text you want the page to have
     */
    void createPage(String title, String text);

    /**
     * Replaces the text of a provided page based on the number
     *
     * @param pageNumber the number of the page you want the text to be replaced
     * @param replaceText the exact text you want to appear after the replace
     */
    void replaceText(int pageNumber, String replaceText) throws NoSuchPageException;

    /**
     * Deletes the whole text of a page with a specific number
     * @param pageNumber the number of the page you want the text to be deleted
     */
    void deleteText(int pageNumber) throws NoSuchPageException;

    /**
     * Lists all the pages with their content on the screen
     */
    void previewAllPages();
}
