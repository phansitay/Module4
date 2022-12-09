package codegym.email.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="email")
public class Email {
    @Id
    @Column(name ="id")
    private int id;
    @Column(name = "language")
    private String language;
    @Column(name = "size")
    private int sizePage;
    @Column(name = "spam")
    private boolean spam;
    @Column(name ="signature")
    private String signature;

    public Email() {
    }

    public Email(int id, String language, int sizePage, boolean spam, String signature) {
        this.id = id;
        this.language = language;
        this.sizePage = sizePage;
        this.spam = spam;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSizePage() {
        return sizePage;
    }

    public void setSizePage(int sizePage) {
        this.sizePage = sizePage;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
