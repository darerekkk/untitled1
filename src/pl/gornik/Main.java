package pl.gornik;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Document> documents = new ArrayList<>();

        documents.add(new Document("Faktura", "1", DocumentType.INVOICE));
        documents.add(new Document("Umowa", "2", DocumentType.CONTRACT));
        documents.add(new Document("Akt notarialny", "3", DocumentType.NOTARIAL_ACT));
        documents.add(new Document("Certyfikat", "4", DocumentType.CERTIFICATE));

        for (Document document : documents) {
            System.out.println(document);
        }

        System.out.println("Wprowadź nowy dokument:");

        System.out.print("Nazwa: ");
        String name = scanner.nextLine();

        System.out.print("Numer: ");
        String number = scanner.nextLine();

        System.out.print("Typ dokumentu (" + DocumentType.getAvailableTypes() + "): ");
        String documentTypeName = scanner.nextLine().toUpperCase();

        DocumentType documentType = DocumentType.getByName(documentTypeName);
        if (isValidDocumentType(documentType)) {
            documents.add(new Document(name, number, documentType));
        } else {
            System.out.println("Wprowadziłeś nieprawidłowy typ dokumentu.");
        }

        for (Document document : documents) {
            System.out.println(document);
        }
    }

    public static boolean isValidDocumentType(DocumentType documentType) {
        return documentType != null;
    }
}
