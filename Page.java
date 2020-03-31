public class Page {
    private String title;
    private String text;
    private int pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Using this method you can add text to the existing one
     *
     * @param text the text you want to be added to the current page\
     */
    void addText(String text) {
        this.text = this.text + text;
    }

    /**
     * Deletes the whole text from the page you have invoked it for
     */
    void deleteText() {
        this.text = "";
    }

    String viewPage() {
        return this.title + "\n" + this.text;
    }
}
