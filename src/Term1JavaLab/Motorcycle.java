/*
 * @author Rustom Trayvilla
 * @since May 28, 2025
 * @version 1.0
 */
package Term1JavaLab;

/**
 * This class represents the Motorcycle information 
 * such as the VIN, Invoice Price and Engine Size
 */
public class Motorcycle {

	private String VIN;
	private int engineSize;
	private Double invoicePrice;
	
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String VIN) {
		this.VIN = VIN;
	}
	
	public int getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
		
		
	}
	
	public Double getInvoicePrice(){
		return invoicePrice;
	}
	
	public void setInvoicePrice(Double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	
	public String toString() {
		
		return "Engine Size: "+engineSize+", Invoice Price: $"+getInvoicePrice()+", VIN: "+ getVIN();
	}
}


/**
 * I have recoded this Lab01 assignment all by my self.
 * I was able to execute and produce a result, however I miss many 
 * task, such as Invoice to 2-decimal and engine size round up.
 * 
 * Never the less I can come back to this and fix some issue. 
 */



