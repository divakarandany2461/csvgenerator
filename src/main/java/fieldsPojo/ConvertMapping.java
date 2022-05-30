package fieldsPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConvertMapping{
    @JsonProperty("Contacts") 
    private String contacts;
    @JsonProperty("Deals") 
    private String deals;
    @JsonProperty("Accounts") 
    private String accounts;
    @JsonProperty("Invoices") 
    private String invoices;
    @JsonProperty("Sales_Orders") 
    private String sales_Orders;
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getDeals() {
		return deals;
	}
	public void setDeals(String deals) {
		this.deals = deals;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	public String getInvoices() {
		return invoices;
	}
	public void setInvoices(String invoices) {
		this.invoices = invoices;
	}
	public String getSales_Orders() {
		return sales_Orders;
	}
	public void setSales_Orders(String sales_Orders) {
		this.sales_Orders = sales_Orders;
	}
    
}
