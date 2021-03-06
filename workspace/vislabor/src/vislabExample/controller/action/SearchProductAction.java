package vislabExample.controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Product;

public class SearchProductAction extends ActionSupport {

	private static final long serialVersionUID = -2288153561304263539L;

	private Product product;
	private List<Product> productList;

	private String category = "";      // 0
	private String label = "";         // 1
	private String description = "";   // 2
	private String price = "";         // 3
	
	private Long id = 0L;

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		
		if(!category.equals(""))
			this.productList = productManager.search(category, 0);
		else if(!label.equals(""))
			this.productList = productManager.search(label, 1);
		else if(!description.equals(""))
			this.productList = productManager.search(description, 2);
		else
			this.productList = productManager.search(price, 3);

		return SUCCESS;
	}
	
	public String view() throws Exception {
		ProductManager productManager = new ProductManager();
		Product product = productManager.getProductByPrimaryKey(getId());
		
		if(product != null)
		{
			this.product = product;
			return SUCCESS;
		}
		else
		{
			addActionError("Fehler");
			return INPUT;
		}
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
    @Override
    public void validate() {
    	int counter = 0;
    	if(!getLabel().equals(""))
    		counter++;
    	if(!getDescription().equals(""))
    		counter++;
    	if(!getCategory().equals(""))
    		counter++;
    	if(!getPrice().equals(""))
    		counter++;
    	if(counter > 1)
    		addActionError("Bitte nur ein Suchargument angeben!");
    	super.validate();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
