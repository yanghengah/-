public class User{
	String Name;
	int Age;
	String Gender;
	String Tel;
	String Email;
	String Company;
	public User(String Name,int Age,String Gender,String Tel,String Email,String Company){
		this.Name = Name;
		this.Age = Age;
		this.Gender = Gender;
		this.Tel = Tel;
		this.Email = Email;
		this.Company = Company;
	
	}
	public String ToString(){
		return "    姓名："+Name+"\n    年龄："+Age+"\n    性别："+Gender+"\n联系电话："+Tel+"\n邮件地址："+Email+"\n公司名称："+Company;
	}
}