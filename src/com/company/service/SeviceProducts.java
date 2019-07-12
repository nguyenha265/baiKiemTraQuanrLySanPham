package com.company.service;

import com.company.model.Product;
import com.company.repository.ListProducts;

public class SeviceProducts implements GeneratService {
    ListProducts listProducts = new ListProducts();

    public Product[] showListProducts() {
        return listProducts.showListProducts();
    }

    public void addProducts(String name, int id, int price, String description) {
        listProducts.addProducts(name, id, price, description);
    }

    @Override
    public void upDateProDuct(int name, String newName, int id, int price, String description) {
        listProducts.upDateProDuct(name, newName, id, price, description);
    }

    @Override
    public void deleteProDuct(int id) {
        listProducts.deleteProDuct(id);
    }

    @Override
    public int seachProDuct(int id) {
        return listProducts.seachProDuct(id);
    }

    @Override
    public Product[] sortProducts() {
        return listProducts.sortProducts();
    }


}
