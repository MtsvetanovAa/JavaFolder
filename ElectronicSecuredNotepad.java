public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice {
    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
    }

    @Override
    public void start() {
        this.isStarted = true;
    }

    @Override
    public void stop() {
        this.isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }

    @Override
    public void replaceText(int pageNumber, String replaceText) throws NoSuchPageException {
        if(isStarted()) {
            super.replaceText(pageNumber, replaceText);
        } else {
            System.out.println("The device is not started");
        }
    }

    @Override
    public void createPage(String title, String text) {
        if(isStarted()) {
            super.createPage(title, text);
        } else {
            System.out.println("The device is not started");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException {
        if(isStarted()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("The device is not started");
        }
    }

    @Override
    public void previewAllPages() {
        if(isStarted()) {
            super.previewAllPages();
        } else {
            System.out.println("The device is not started");
        }
    }
}
