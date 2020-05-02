package com.geekahmed;
/*
  By: Ahmed Moustafa
  E-mail: geekahmed1@gmail.com
 */
                    //UML Class Diagram
/***************************************************
 *               Stock                              *
 * ------------------------------------------------ *
 * -symbol: String                                  *
 * -name: String                                    *
 * -previousClosingPrice: double                    *
 * -currentPrice: double                            *
 * +Stock(symbol: String, name: String)             *
 * +getChangePercent(): double                      *
 ***************************************************/

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /previousClosingPrice) * 100;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
