package com.example.ucgames.Models;

/** Currently this Category class doesn't have many fields. It is supposed to be the parent
 * of the Game class. Some fields and methods here will be abstracted. However, we haven't decided yet
 * as our application is still very simple.
 */

public class Category {

    Integer id;
    Integer imageUrl;
    String categoryName;

    public Category(Integer id, Integer imageUrl, String categoryName) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.categoryName = categoryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
