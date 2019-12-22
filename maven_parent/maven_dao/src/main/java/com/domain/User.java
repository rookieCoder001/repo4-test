package com.domain;

public class User {

    private Integer id;
    private Integer age;
    private String username;
    private String PASSWORD;
    private String email;
    private String sex;

    public User() {
    }

    public User(Integer id, Integer age, String username, String PASSWORD, String email, String sex) {
        this.id = id;
        this.age = age;
        this.username = username;
        this.PASSWORD = PASSWORD;
        this.email = email;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
