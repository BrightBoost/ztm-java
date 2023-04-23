package controlflow;

public class ExamplesSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch(extension) {
            case "docx":
                System.out.println("This is word document");
                break;
            case "pptx":
                System.out.println("This is presentation");
                break;
            case "pdf":
                System.out.println("This is a pdf file");
                break;
            case "txt":
                System.out.println("This is a txt file");
                break;
            default:
                System.out.println("We do not support this file");
        }

        int month = 3;

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");
                break;
        }

    }
}
