package com.company.service;

public interface GeneratService<T> {
    T[] showListProducts();
    void addProducts(String name, int id, int price, String description);
    void upDateProDuct(int name, String newName, int id, int price, String description);
    void deleteProDuct(int id);
    int seachProDuct(int id);
    T[] sortProducts();
}
