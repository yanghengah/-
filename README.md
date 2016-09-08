> ##用户信息打印

* 定义User类:

	 ```java
public class User{
	String Name;
	int Age;
	String Gender;
	String Tel;
	String Email;
	String Company;
}
```
* 定义构造函数:

	 ```java
public User(String Name,int Age,String Gender,String Tel,String Email,String Company){
		this.Name = Name;
		this.Age = Age;
		this.Gender = Gender;
		this.Tel = Tel;
		this.Email = Email;
		this.Company = Company;
	
	}
```
*  定义ToString()方法:

	 ```java
public String ToString(){
		return "    姓名："+Name+"\n    年龄："+Age+"\n    性别："+Gender+"\n联系电话："+Tel+"\n邮件地址："+Email+"\n公司名称："+Company;
	}
```
* 定义main()方法:

	```java
public static void main(String[] args){
		User user = new User("杨恒",20,"男","13710295382","yanghengah@163.com","广州骏域网络");
		System.out.println(user.ToString());
	}
```
* 运行效果

	![cmd截图](https://i.bohan.co/AJMpqA4K.jpg "cmd截图")
