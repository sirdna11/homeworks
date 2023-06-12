package io.codelex.oop.summary.exercise2;

import java.text.DecimalFormat;
import java.util.List;

public class Invoice {
    private final List<SellableThing> items;
    private final String invoiceNumber;
    private final double priceWithoutVAT;
    private final double priceWithVAT;
    private InvoiceStatus status = InvoiceStatus.APPROVED;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("The order is empty!");
        }
        this.invoiceNumber = invoiceNumber;
        this.items = order.getItems();

        double total = 0.0;
        for (SellableThing item : items) {
            total += item.getPrice();
        }
        this.priceWithoutVAT = total;
        this.priceWithVAT = total * 1.21;
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    public String getInvoice() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================================\n");
        sb.append("= INVOICE NUMBER: ").append(this.invoiceNumber).append("\n");
        sb.append("= STATUS: ").append(this.status).append("\n");
        int count = 1;
        for (SellableThing item : this.items) {
            sb.append("= ").append(count++).append(". ").append(item.fullInfo()).append("\n");
        }
        DecimalFormat df = new DecimalFormat("0.00");
        sb.append("= SUM: ").append(df.format(this.priceWithoutVAT)).append(" EUR\n");
        sb.append("= VAT (21%): ").append(df.format(this.priceWithVAT - this.priceWithoutVAT)).append(" EUR\n");
        sb.append("= TOTAL: ").append(df.format(this.priceWithVAT)).append(" EUR\n");
        sb.append("===================================================\n");
        return sb.toString();
    }
}
