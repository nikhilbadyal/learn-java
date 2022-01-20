import java.util.Objects;

public class Employee {
    String name;
    double pay;
    String empCode;
    String contact;

    Employee(){
        this.name = "";
        this.pay = 0.0;
        this.empCode = "";
        this.contact = "";
    }
    Employee(String empCode){
        this.empCode = empCode;
    }
    Employee(String name , double  pay , String empCode, String contact){
        this.name= name;
        this.contact = contact;
        this.empCode = empCode;
        this.pay = pay;
    }

    //Getters
    String getName(){
        return  this.name;
    }
    double getPay(){
        return this.pay;
    }
    String getEmpCode(){
        return this.empCode;
    }
    String  getContact(){
        return contact;
    }

    //Setters
    void setName(String name){
        this.name = name;
    }
    void setPay(double pay){
        this.pay = pay;
    }
    void setEmpCode(String empCode){
        this.empCode = empCode;
    }
    void setContact(String contact){
        this.contact = contact;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return true;
        }
        /*if(this.getClass() != obj.getClass()){
            return false;
        }*/
        if(!(obj instanceof Employee)){
            return  false;
        }
        Employee emp = (Employee) obj;
        return (Objects.equals(this.name,emp.name) && Objects.equals(this.pay,emp.pay)
                &&Objects.equals(this.contact,emp.contact)&& Objects.equals(this.empCode,emp.empCode));
    }


    @Override
    public String toString() {
        return "\nEmployee Code: "+this.empCode+
                "Name: "+this.name+
                "\nContact: "+this.contact+
                "\nPay: "+this.pay;
    }
}
