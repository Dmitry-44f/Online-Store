package models;

import java.util.List;

public class Basket {
    private Long userId;
    private List<Product> productsList;
    private double totalCost;

    public Basket() { }

    public Basket(Long userId, List<Product> productsList) {
        this.userId = userId;
        this.productsList = productsList;
        this.totalCost = sumTotalCost(productsList);
    }

    private double sumTotalCost(List<Product> productsList) {
        double totalSum = 0;

        for(Product p: productsList) {
            totalSum = p.getPrice();
        }

        return totalSum;
    }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public List<Product> getProductsList() { return productsList; }
    public void setProductsList(List<Product> productsList) { this.productsList = productsList; }

    public double getTotalCost() { return totalCost; }
}
