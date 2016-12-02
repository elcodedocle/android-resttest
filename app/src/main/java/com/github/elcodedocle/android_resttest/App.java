package com.github.elcodedocle.android_resttest;

public class App {

    private static Integer count = 1;
    private Integer id;
    private String category;
    private String title;
    private String description;
    private String developer;
    private String packageName;
    private String iconImageUrl;
    private String bgImageUrl;

    public static void incCount(){
        count++;
    }

    public static Integer getCount(){
        return count;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getPackageName() {
        return packageName;
    }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    public String getIconImageUrl() {
        return iconImageUrl;
    }
    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }
    public String getBgImageUrl() {
        return bgImageUrl;
    }
    public void setBgImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

}
