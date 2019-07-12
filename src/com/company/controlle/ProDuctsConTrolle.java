package com.company.controlle;

import com.company.model.Product;
import com.company.service.SeviceProducts;

public class ProDuctsConTrolle {
    SeviceProducts seviceProducts = new SeviceProducts();

    public Product[] showListProducts() {
        return seviceProducts.showListProducts();
    }

    public void addProducts(String name, int id, int price, String description) {
        seviceProducts.addProducts(name, id, price, description);
    }

    public void upDateProducts(int name, String newName, int id, int price, String description) {
        seviceProducts.upDateProDuct(name, newName, id, price, description);
    }
    public void deleteProDuct(int id){
        seviceProducts.deleteProDuct(id);
    }
    public int seachProDuct(int id){
        return seviceProducts.seachProDuct(id);
    }
    public Product[] sortProducts(){
        return seviceProducts.sortProducts();
    }
}
