package pl.gornik;

public class Document {
    private String name;
    private String number;
    private DocumentType documentType;

    public Document(String name, String number, DocumentType documentType) {
        this.name = name;
        this.number = number;
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", documentType=" + documentType +
                '}';
    }
}