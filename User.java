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
		return "    ������"+Name+"\n    ���䣺"+Age+"\n    �Ա�"+Gender+"\n��ϵ�绰��"+Tel+"\n�ʼ���ַ��"+Email+"\n��˾���ƣ�"+Company;
	}
}