/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Kane
 */
public class UpdateCustomerPriceEvent extends Event{

private String event;
private String priority_id;
private String origin;
private String destination;
private String company;
private String customer_cost_pergram;


    public String getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(String priority_id) {
        this.priority_id = priority_id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCustomer_cost_pergram() {
        return customer_cost_pergram;
    }

    public void setCustomer_cost_pergram(String customer_cost_pergram) {
        this.customer_cost_pergram = customer_cost_pergram;
    }

    public String getCustomer_cost_percc() {
        return customer_cost_percc;
    }

    public void setCustomer_cost_percc(String customer_cost_percc) {
        this.customer_cost_percc = customer_cost_percc;
    }
private String customer_cost_percc;

}

