package com.xworkz.thing.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CreditCardDto  implements Serializable {

    //CreditCardDTO(10) : type,no,expiryDate:LocalDate,cvv
    //find all creditCardDTO where expiryDate > 2026
    //find all creditCardDTO by type(visa,rupay,master)
    //print all cvv
    //print all no

    private String type;
    private long cardNumber;
    private LocalDate expDate;
    private int cvv;


    public CreditCardDto()
    {

    }

    public CreditCardDto(String type, long cardNumber, LocalDate expDate, int cvv) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCardDto{" +
                "type='" + type + '\'' +
                ", cardNumber=" + cardNumber +
                ", expDate=" + expDate +
                ", cvv=" + cvv +
                '}';
    }
}
