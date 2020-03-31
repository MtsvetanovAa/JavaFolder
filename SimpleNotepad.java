import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements Notepad {
    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }
//Добавя даден текст върху страница с определен номер (изтрива
//предишния и записва новия)


    @Override
    public void createPage(String title, String text) {
        Page curPage = new Page();
        curPage.setText(text);
        curPage.setTitle(title);
        curPage.setPageNumber(this.pages.size()+1);
        this.pages.add(curPage);
    }


//Да трие текста от дадена страница
    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException {
        Page curPage = findPage(pageNumber);
        curPage.deleteText();
    }

    @Override
    public void replaceText(int pageNumber, String replaceText) throws NoSuchPageException {
        Page curPage = findPage(pageNumber);
        curPage.deleteText();
        curPage.addText(replaceText);
    }

    private Page findPage(int pageNumber) throws NoSuchPageException {
        for (Page curPage : pages) {
            if(curPage.getPageNumber() == pageNumber) {
                return curPage;
            }
        }
        throw new NoSuchPageException("There is no page with number: " + pageNumber);
    }

    @Override
    public void previewAllPages() {
        for (Page curPage : pages) {
            System.out.println(curPage.viewPage());
        }
    }
}
