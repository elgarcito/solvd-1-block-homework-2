import abstract_classes.Product;

import java.util.Objects;

public class GasProduct extends Product {
    private String typeOfGas;// compressed gas or natural gas
    private double gasPressure;// max gas pressure for that product

    private String gasId;// the unique id for that product


    //Constructor

    public GasProduct(String productName,String productDescription){
        super(productName,productDescription);
        this.setGasId();
    }
    //End constructor

    //Getter and setters

    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public double getGasPressure() {
        return gasPressure;
    }

    public void setGasPressure(double gasPressure) {
        this.gasPressure = gasPressure;
    }

    public String getGasId() {
        return gasId;
    }

    public void setGasId() {
        this.gasId= "GS"+this.hashCode();
    }

    //end Getter and setters

    //Override equal, hashcode and toString methods.
    @Override
    public int hashCode(){
        int code= Objects.hash(getProductName(),getProductDescription());
        if (code<0){
            return code=code*-1;
        }
        return code;
    }

    @Override
    public String toString(){
        return  "The resume name of the product is:\n"+this.getProductName()
                +"\nThe full description is:\n"+this.getProductDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GasProduct)) return false;
        GasProduct that = (GasProduct) o;
        return Objects.equals(gasId, that.gasId);
    }
    //End Override equal, hashcode and toString methods.

}
