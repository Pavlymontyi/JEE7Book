package entities;

import com.kraynov.javaee7.contraints.ChronologicalDates;

import java.util.Date;
import java.util.List;

@ChronologicalDates
public class Order {
    private String orderId;
    private Double totalAmount;
    private Date creationDate;
    private Date paymentDate;
    private Date deliveryDate;
    private List orderLines;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
