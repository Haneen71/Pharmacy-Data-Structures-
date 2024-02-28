package com.mycompany.projectds;

/**
 * This is a class for Products in the pharmacy.
 */
public class Product {

    //Products infos
    String end_date;
    double price;

    //default constructor to creacte type of product obj.
    public Product() {
    }

    /**
     * Constructor to assign values for the Products information
     *
     * @param end_date the Product Expiry Date .
     * @param price the Product Price .
     */
    public Product(String end_date, double price) {
        this.end_date = end_date;
        this.price = price;
    }

    // @param end_date Setters to set the products values depending on the type of product
    public String details(String ex) {

        switch (ex) {
            case "beautySection":
                return this.end_date = "The expiry will be from 6-12 months after openning the package";
                
            case "careSection":
                return this.end_date = "The expiry will be from 4-6 months after openning the package";
              
            case "medicalSuppliesSection":
                return this.end_date = "The expiry will be from 12-24 months after openning the package";

            case "medicationsSection":
                return this.end_date = "The expiry will be from 12-24 months after openning the package";
               
                
        }//End switch
        return"null" ;
    }//End method

    
    //@param products[] Insertion sort implemention on products array.

    public static void insertionSort(String products[]) {
        String temp;
        int i, j, k;
        for (i = 1; i < products.length; i++) {
            temp = products[i]; //st
            for (j = 0; j < i; j++) {
                if (products[j].compareTo(temp) > 0) { // >0 products[j] First 
                    break;
                }
            }
            for (k = i; k > j; k--) {
                products[k] = products[k - 1];
            }
            products[j] = temp;
        }
        for (i = 0; i < products.length; i++) {

            System.out.println(products[i]);
        }
    }//End method

    //Binary search  
    public static int bSearch(String products[], String searchKey) {
        
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].compareTo(searchKey) == 0) {
                return mid;
            } else {
                if (products[mid].compareTo(searchKey) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }//End method
}// end class 
