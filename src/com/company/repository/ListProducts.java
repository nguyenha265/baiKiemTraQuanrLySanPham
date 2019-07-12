package com.company.repository;

import com.company.model.Product;

public class ListProducts implements GeneralRepository {
    Product[] listProducts = new Product[100];

    {
        listProducts[0] = new Product("samsung", 1, 300, "điện thoại");
        listProducts[1] = new Product("sony", 2, 700, "điện thoại");
        listProducts[2] = new Product("nokia", 3, 600, "điện thoại");
    }

    public Product[] showListProducts() {
        return listProducts;
    }

    public void addProducts(String name, int id, int price, String description) {
        for (int i = 0; i < listProducts.length; i++) {
            if (listProducts[i] == null) {
                listProducts[i] = new Product(name, id, price, description);
                break;
            }
        }
    }

    public void upDateProDuct(int name, String newName, int id, int price, String description) {
        for (int i = 0; i < listProducts.length && listProducts[i] != null; i++) {
            if (listProducts[i].getId() == name) {
                listProducts[i].setName(newName);
                listProducts[i].setId(id);
                listProducts[i].setPrice(price);
                listProducts[i].setDescription(description);
            }
        }
    }

    @Override
    public void deleteProDuct(int id) {
        for (int i = 0; i < listProducts.length && listProducts[i] != null; i++) {
            if (listProducts[i].getId() == id) {
                for (int j = id; j > listProducts.length - 1; j++) {
                    listProducts[i] = listProducts[j + 1];

                }
            }
        }
    }

    @Override
    public int seachProDuct(int id) {
        int index = 0;
        for (int i = 0; i < listProducts.length && listProducts[i] != null; i++) {
            if (listProducts[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Product[] sortProducts() {
        for (int i = 0; i < listProducts.length && listProducts[i] != null; i++) {
            for (int j = i; j < listProducts.length&&listProducts[j]!= null; j++) {
                if (listProducts[i].getPrice() < listProducts[j].getPrice()) {
                    Product temp=listProducts[i];
                    listProducts[i] = listProducts[j];
                    listProducts[j]=temp;
                }
            }
        }
        return listProducts;
    }
}


