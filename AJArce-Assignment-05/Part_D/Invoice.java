package AssignmentPartD;

public class Invoice {
    private String invoiceID;
    private Guest guest;
    private double amountDue;
    private boolean paymentStatus;

    public Invoice(String invoiceID, Guest guest, double amountDue, boolean paymentStatus) {
        this.invoiceID = invoiceID;
        this.guest = guest;
        this.amountDue = amountDue;
        this.paymentStatus = paymentStatus;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void markAsPaid() {
        paymentStatus = true;
        System.out.println("Invoice " + invoiceID + " has been marked as paid.");
    }

    public void generateInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Amount Due: $" + amountDue);
        System.out.println("Payment Status: " + (paymentStatus ? "Paid" : "Unpaid"));
    }
}
