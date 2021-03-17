
public class OrderRepair {
      private String modelName;
      private String accessory;
      
	public OrderRepair(String modelName, String accessory) {
		super();
		this.modelName = modelName;
		this.accessory = accessory;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getAccessory() {
		return accessory;
	}
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
      
}
