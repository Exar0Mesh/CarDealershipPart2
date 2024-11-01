package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTax, recordingFee, processFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, boolean vehicleSold, double totalPrice,
                         double monthlyPayment, double salesTax, double recordingFee, double processFee, boolean finance) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processFee = processFee;
        this.finance = finance;
    }

    @Override
    public double getMonthlyPayment() {
        double salesTax = 0.05;
        if (totalPrice >= 10000) { //probably loop for a certain amount of months
            salesTax = 0.0425;
            return salesTax;
        } else {
            salesTax = 0.0525;
            return salesTax;
        }
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessFee() {
        return processFee;
    }

    public void setProcessFee(double processFee) {
        this.processFee = processFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }
}
