package mmall.com.mmall.models;


public class BaseModel {
	
	@com.lidroid.xutils.db.annotation.Id
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	
}
