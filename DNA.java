// A program that determines whether there is a protein in a strand of DNA

public class DNA {
  
  public static void main(String[] args) {     
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
    // DNA samples:
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;
    System.out.println("Length: " + dna.length());

    // Start codon:
    int start = dna.indexOf("ATG");
    System.out.println("Start codon: " + start);
    
    // Stop codon:
    int stop = dna.indexOf("TGA");
    System.out.println("Stop codon: " + stop);

    // Deteremine if the DNA strand contains protein
    if (start > -1 && stop > -1 && dna.length() % 3 == 0) {
      String protein = dna.substring(start, stop + 3);
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein.");
    }
  }
}
