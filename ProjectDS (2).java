package com.mycompany.projectds;

public class ProjectDS {

    /**
     * This the main of our DS pharmacy
     *
     * @param args the command line arguments
     * @author Danah Alramadani, Sarah Alqufi, Haneen Almalki, Sara Alfaifi, Tala Aqeel
     * @version 1
     * @since 1
     */
    public static void main(String[] args) {
        //Array of sections in the pharmacy
        String[] sections = {"Beauty", "Care", "Medical Supplies", "Medications"};
        //Array of products in each section
        String[] beautySection = {"Dakeup", "Aails products", "Bair dye", "Cyes lenses"};
        String[] careSection = {"Products for body", "Products for skin care", "Products for hair", "Makeup removers"};
        String[] medicalSuppliesSection = {"First aid materials", "Wheel chairs", "Measuring devices", "Hot&Cold Bags"};
        String[] medicationsSection = {"Prescribed medications", "Non-Prescribed medications", "Sore throat Candies", "Vitamins"};

        //employees objs
        Employees employee1 = new Employees("Omar Ahmad", 1112234560, "Pharmacist", 'M');
        Employees employee2 = new Employees("Anas Turki", 1113325406, "Assistant", 'M');

        //Printing DS pharmacy components
        System.out.println("___________________________________________[Welcome to DS pharmacy]___________________________________________\n");
        System.out.println("Here is a list of our provided products and their sections: \n");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sections: " + sections[0] + ", " + sections[1] + ", " + sections[2] + ", " + sections[3] + ".                                                         |");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Beauty Section has: " + beautySection[0] + ", " + beautySection[1] + ", " + beautySection[2] + ", " + beautySection[3] + ".                                             |\n");
        System.out.println("Care Section has: " + careSection[0] + ", " + careSection[1] + ", " + careSection[2] + ", " + careSection[3] + ".               |\n");
        System.out.println("Medical Supplies Section has: " + medicalSuppliesSection[0] + ", " + medicalSuppliesSection[1] + ", " + medicalSuppliesSection[2] + ", " + medicalSuppliesSection[3] + ".             |\n");
        System.out.println("Medications Section has: " + medicationsSection[0] + ", " + medicationsSection[1] + ", " + medicationsSection[2] + ", " + medicationsSection[3] + ".    |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("Our " + employee1.job + " \"" + employee1.name + "\" AND our " + employee2.job + " \"" + employee2.name + "\" will be happy to serve you!~");

        System.out.println("\n_________________________________________[Implementing sort & search]_________________________________________\n");

        //Implementing insertion sort  algorithm
        System.out.println(" ~~~~~~~~~~~~~~");
        System.out.println("|insertion sort|");
        System.out.println(" ~~~~~~~~~~~~~~");

        System.out.println("~The sections array after sorting: ");
        Product.insertionSort(sections);
        System.out.println("\n~The Beauty Section array after sorting: ");
        Product.insertionSort(beautySection);
        System.out.println("\n~The careSection array after sort: ");
        Product.insertionSort(careSection);
        System.out.println("\n~The medicalSuppliesSection array after sorting: ");
        Product.insertionSort(medicalSuppliesSection);
        System.out.println("\n~The medicationsSection array after sort: ");
        Product.insertionSort(medicationsSection);
        System.out.println("_____________________________\n");

        //Implementing binary search algorithm
        System.out.println(" ~~~~~~~~~~~~~~");
        System.out.println("| binary search |");
        System.out.println(" ~~~~~~~~~~~~~~");
        System.out.println("if exist shows the index, -1 if not");

        System.out.println("\n~Search for \"Snacks\" section: "); //Do we have a snacks section? in which index?
        System.out.println(Product.bSearch(sections, "Snacks"));
        System.out.println("~Search for \"Nails products\" in Beauty section: "); //Do we have nail products? in which index?
        System.out.println(Product.bSearch(beautySection, "Nails products"));
        System.out.println("~Search for \"Products for fitness\" in careSection: ");
        System.out.println(Product.bSearch(careSection, "Products for fitness")); //Do we have products for fitness? in which index?
        System.out.println("~Search for \"First aid materials\" in Medical supplies section: "); //Do we have First aid materials? in which index?
        System.out.println(Product.bSearch(medicalSuppliesSection, "First aid materials"));
        System.out.println("~Search for Non-Prescribed medications in Medications section: "); //Do we have non-Prescribed medications? in which index?
        System.out.println(Product.bSearch(medicationsSection, "Non-Prescribed medications"));
        
        System.out.println("_____________________________\n");
        Product s = new Product();
        System.out.println("If you bought from beautySection");
        System.out.println(s.details("beautySection"));
        System.out.println("\nIf you bought from careSection");
        System.out.println(s.details("careSection"));
        System.out.println("\nIf you bought from medicalSuppliesSection");
        System.out.println(s.details("medicalSuppliesSection"));
        System.out.println("\nIf you bought from medicationsSection");
        System.out.println(s.details("medicationsSection"));
        
    }//End of main
}//End class
