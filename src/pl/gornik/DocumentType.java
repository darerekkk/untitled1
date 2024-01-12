package pl.gornik;

public enum DocumentType {
    INVOICE("Faktura"),
    CONTRACT("Umowa"),
    NOTARIAL_ACT("Akt notarialny"),
    CERTIFICATE("Certyfikat");

    private String typeName;

    DocumentType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static DocumentType getByName(String name) {
        for (DocumentType type : values()) {
            if (type.getTypeName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        return null;
    }

    public static String getAvailableTypes() {
        StringBuilder types = new StringBuilder();
        for (DocumentType type : values()) {
            types.append(type.getTypeName()).append(", ");
        }
        return types.substring(0, types.length() - 2); // Usuwamy ostatnią przecinkę i spację
    }
}
