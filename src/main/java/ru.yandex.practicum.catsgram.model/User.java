package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import java.time.LocalDate;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String email;
    private String username;
    private String login;
    private String name;
    private LocalDate birthday;
    private Date registrationDate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() { // Добавляем метод getUsername
        return username;
    }

    public void setUsername(String username) { // Добавляем метод setUsername
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
