package com.example.project.model.DTO;

public class GoodsDTO {
    String name;
    Integer price;
    Long count;
    String brand;
    String category;
    Integer saleprice;
    Integer salepercent;
    String img;
    String option;
    String content;
    String detailimg;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public long getcount() {
        return count;
    }
    public void setCount(long count){
        this.count = count;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public Integer getSaleprice() {
        return saleprice;
    }
    public void setSaleprice(Integer saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getSalepercent() {
        return salepercent;
    }
    public void setSalepercent(Integer salepercent) {
        this.salepercent = salepercent;
    }

    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        this.option = option;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getDetailimg() {
        return detailimg;
    }
    public void setDetailimg(String detailimg) {
        this.detailimg = detailimg;
    }
}
