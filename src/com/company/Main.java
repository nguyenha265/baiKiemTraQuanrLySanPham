package com.company;

import com.company.controlle.ProDuctsConTrolle;
import com.company.model.Product;

import java.util.Scanner;

public class Main {
    static ProDuctsConTrolle proDuctsConTrolle = new ProDuctsConTrolle();
    static Scanner scanner = new Scanner(System.in);
    static Product[] products = proDuctsConTrolle.showListProducts();

    public static void main(String[] args) {
        int choice = -1;
        do {
            System.out.println("mời lưa chọn ");
            System.out.println("1 thêm sản phẩm");
            System.out.println("2 sửa sản phẩm");
            System.out.println("3 xóa sản phẩm");
            System.out.println("4 hiện thị chi tiết sản phẩm");
            System.out.println("5 hiện thị toàn bộ sản phẩm");
            System.out.println("6 sắp xếp lại sản phẩm theo giá");
            System.out.println("0 thoát chương trình");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProducts();
                    break;
                case 2:
                    upDateProducts();
                    break;
                case 3:
                    deleteProDuct();
                    break;
                case 4:
                    seachProDuct();
                    break;
                case 5:
                    showProducts();
                    break;
                case 6:
                    sortProducts();
                    break;


            }
        } while (choice != 0);

    }

    private static void upDateProducts() {
        System.out.println("nhập id sản phẩn mốn sửa");
        int upDateProduct = scanner.nextInt();

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == upDateProduct) {
                    scanner.nextLine();
                    System.out.println("nhập lại tên sản phẩm");
                    String upDateNameProduct = scanner.nextLine();
                    System.out.println("nhập lại id ");
                    int upDateIdProduct = scanner.nextInt();
                    System.out.println("nhập lại giá");
                    int upDatePriceProduct = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập lại kiểu");
                    String upDateDescriptionProduct = scanner.nextLine();
                    proDuctsConTrolle.upDateProducts(upDateProduct, upDateNameProduct, upDateIdProduct, upDatePriceProduct, upDateDescriptionProduct);
                    showProducts();
                    break;
                }
            }
        }
    }

    private static void addProducts() {
        scanner.nextLine();
        System.out.println("nhập sản phẩm muốn thêm");
        String nameProduct = scanner.nextLine();
        System.out.println("nhập id cho sản phẩm");
        int idProduct = scanner.nextInt();
        System.out.println("nhập giá sản phẩm");
        int priceProduct = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập kiểu sản phẩm");
        String descriptionProDuct = scanner.nextLine();
        proDuctsConTrolle.addProducts(nameProduct, idProduct, priceProduct, descriptionProDuct);
        showProducts();
    }

    public static void showProducts() {

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
            }
        }
    }

    public static void deleteProDuct() {
        System.out.println("nhập id sản phẩm muốn xóa");
        int deleteProDuct = scanner.nextInt();
        proDuctsConTrolle.deleteProDuct(deleteProDuct);
        showProducts();
    }

    public static void seachProDuct() {
        System.out.println("nhập id sản phẩm muốn xem");
        int seachProDuct = scanner.nextInt();
        int index = proDuctsConTrolle.seachProDuct(seachProDuct);
        System.out.println(products[index]);
    }

    public static void sortProducts() {
        products = proDuctsConTrolle.sortProducts();
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
            }
        }

    }

}
