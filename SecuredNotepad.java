import java.util.Scanner;

//Създайте бележник SecuredNotepad, който е защитен бележник.
//Всеки един такъв бележник има собствена парола, която се задава при
//създаването му.
//Бележника може да прави същите неща, като нормален бележник (SimpleNotepad),
// но преди извършването на всяка операция на бележника, се изисква от потребителя да въведе паролата на бележника.
// Само ако е въведена правилна парола операцията се извършва, в противен случай операцията не се извършва.
public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Dai parola be: ");
            String enteredPassword = scan.nextLine();
            if(enteredPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void replaceText(int pageNumber, String replaceText) throws NoSuchPageException {
        if(checkPassword()) {
            super.replaceText(pageNumber, replaceText);
        } else {
            System.out.println("Replace text will NOT be done!");
        }
    }

    @Override
    public void createPage(String title, String text) {
        if(checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Create page will NOT be done!");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException {
        if(checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Delete text will NOT be done!");
        }
    }

    @Override
    public void previewAllPages() {
        if(checkPassword() == true) {
            super.previewAllPages();
        } else {
            System.out.println("Preview text will NOT be done!");
        }
    }
}
