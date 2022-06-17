package comparator;

import java.util.Comparator;

public class Product{
private Integer productId;
private String productName;
private Double productPrice;
private int productRating;
public Product(Integer productId, String productName, Double productPrice, int productRating) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productRating = productRating;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ ", productRating=" + productRating + "]";
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getProductPrice() {
	return productPrice;
}
public void setProductPrice(Double productPrice) {
	this.productPrice = productPrice;
}
public int getProductRating() {
	return productRating;
}
public void setProductRating(int productRating) {
	this.productRating = productRating;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((productId == null) ? 0 : productId.hashCode());
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
	result = prime * result + productRating;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (productId == null) {
		if (other.productId != null)
			return false;
	} else if (!productId.equals(other.productId))
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (productPrice == null) {
		if (other.productPrice != null)
			return false;
	} else if (!productPrice.equals(other.productPrice))
		return false;
	if (productRating != other.productRating)
		return false;
	return true;
}


}
