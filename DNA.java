public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGTATCGTGA";
        String dna2 = "ATGCGATACGTATCGTAGCTGA";
        String dna3 = "ATGCGATACGTATCGTACTGATG";

        String dna = dna3; //mudando aqui da para ver se tem ou não uma proteina

        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA", startCodon + 3);

        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("Contém uma proteína.");
        } else {
            System.out.println("Sem proteína.");
        }
    }
}