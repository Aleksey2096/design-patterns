package com.example.patterns.creational.builder;

import java.util.Date;

public class Form {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;
    private final String address;
    private final Date dob;
    private final String email;
    private final String backupEmail;
    private final String spouseName;
    private final String city;
    private final String state;
    private final String country;
    private final String language;
    private final String passwordHint;
    private final String securityQuestion;
    private final String securityAnswer;

    public static class FormBuilder {

        private final String firstName;
        private final String lastName;
        private final String userName;
        private final String password;
        private String address;
        private Date dob;
        private String email;
        private String backupEmail;
        private String spouseName;
        private String city;
        private String state;
        private String country;
        private String language;
        private String passwordHint;
        private String securityQuestion;
        private String securityAnswer;

        public FormBuilder(final String firstName, final String lastName,
                           final String userName,
                           final String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
        }

        public FormBuilder address(final String address) {
            this.address = address;
            return this;
        }

        public FormBuilder dob(final Date dob) {
            this.dob = dob;
            return this;
        }

        public FormBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public FormBuilder backupEmail(final String backupEmail) {
            this.backupEmail = backupEmail;
            return this;
        }

        public FormBuilder spouseName(final String spouseName) {
            this.spouseName = spouseName;
            return this;
        }

        public FormBuilder city(final String city) {
            this.city = city;
            return this;
        }

        public FormBuilder state(final String state) {
            this.state = state;
            return this;
        }

        public FormBuilder country(final String country) {
            this.country = country;
            return this;
        }

        public FormBuilder language(final String language) {
            this.language = language;
            return this;
        }

        public FormBuilder passwordHint(final String passwordHint) {
            this.passwordHint = passwordHint;
            return this;
        }

        public FormBuilder securityQuestion(final String securityQuestion) {
            this.securityQuestion = securityQuestion;
            return this;
        }

        public FormBuilder securityAnswer(final String securityAnswer) {
            this.securityAnswer = securityAnswer;
            return this;
        }

        public Form build() {
            return new Form(this);
        }
    }

    private Form(final FormBuilder formBuilder) {

        this.firstName = formBuilder.firstName;
        this.lastName = formBuilder.lastName;
        this.userName = formBuilder.userName;
        this.password = formBuilder.password;
        this.address = formBuilder.address;
        this.dob = formBuilder.dob;
        this.email = formBuilder.email;
        this.backupEmail = formBuilder.backupEmail;
        this.spouseName = formBuilder.spouseName;
        this.city = formBuilder.city;
        this.state = formBuilder.state;
        this.country = formBuilder.country;
        this.language = formBuilder.language;
        this.passwordHint = formBuilder.passwordHint;
        this.securityQuestion = formBuilder.securityQuestion;
        this.securityAnswer = formBuilder.securityAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" First Name: ");
        sb.append(firstName);
        sb.append("\n Last Name: ");
        sb.append(lastName);
        sb.append("\n User Name: ");
        sb.append(userName);
        sb.append("\n Password: ");
        sb.append(password);

        if (this.address != null) {
            sb.append("\n Address: ");
            sb.append(address);
        }
        if (this.dob != null) {
            sb.append("\n DOB: ");
            sb.append(dob);
        }
        if (this.email != null) {
            sb.append("\n Email: ");
            sb.append(email);
        }
        if (this.backupEmail != null) {
            sb.append("\n Backup Email: ");
            sb.append(backupEmail);
        }
        if (this.spouseName != null) {
            sb.append("\n Spouse Name: ");
            sb.append(spouseName);
        }
        if (this.city != null) {
            sb.append("\n City: ");
            sb.append(city);
        }
        if (this.state != null) {
            sb.append("\n State: ");
            sb.append(state);
        }
        if (this.country != null) {
            sb.append("\n Country: ");
            sb.append(country);
        }
        if (this.language != null) {
            sb.append("\n Language: ");
            sb.append(language);
        }
        if (this.passwordHint != null) {
            sb.append("\n Password Hint: ");
            sb.append(passwordHint);
        }
        if (this.securityQuestion != null) {
            sb.append("\n Security Question: ");
            sb.append(securityQuestion);
        }
        if (this.securityAnswer != null) {
            sb.append("\n Security Answer: ");
            sb.append(securityAnswer);
        }
        return sb.toString();
    }

    public static void main(final String[] args) {
        Form form = new FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123")
                .passwordHint("MyName").city("NY").language("English").build();
        System.out.println(form);
    }
}
