public class Demo {

    public static void main(String[] args) {
//        Notepad electronicNotepad = new ElectronicSecuredNotepad("parola");
//        ((ElectronicDevice)electronicNotepad).start();

        // alternatively
        ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("parola");
        electronicNotepad.start();

        electronicNotepad.createPage("Title1", "Text1");
        electronicNotepad.createPage("Title2", "Text2");
        electronicNotepad.createPage("Title3", "Text3");
        electronicNotepad.createPage("Title4", "Text4");

        electronicNotepad.previewAllPages();

//        Notepad belejnik = new SimpleNotepad();
//        belejnik.createPage("Title1", "Text1");
//        belejnik.createPage("Title2", "Text2");
//        belejnik.createPage("Title3", "Text3");
//        belejnik.createPage("Title4", "Text4");
//
//        try {
//            belejnik.replaceText(33, "Bla");
//        } catch (NoSuchPageException e) {
//            e.printStackTrace();
//            System.out.println("THere is no page with such number, try again.");
//        }
//
//        belejnik.previewAllPages();
//        System.out.println("==================================================");
//        try {
//            belejnik.deleteText(2);
//        } catch (NoSuchPageException e) {
//            e.printStackTrace();
//            System.out.println("THere is no page with such number, try again");
//        }
//
//        belejnik.previewAllPages();
//=============================================================================================================================================
//        Notepad belejnik = new SecuredNotepad("parola");
//        belejnik.createPage("Title1", "Text1");
//        belejnik.createPage("Title2", "Text2");
//        belejnik.createPage("Title3", "Text3");
//        belejnik.createPage("Title4", "Text4");
//
//        belejnik.replaceText(3, "Bla");
//
//        belejnik.previewAllPages();
//        System.out.println("==================================================");
//        belejnik.deleteText(2);
//
//        belejnik.previewAllPages();

    }
}
