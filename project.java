package vsoftcomanyyy;

public class project {

    public static void main(String[] args) {
        Employee m2 = new Employee("Umakanth", "EM027","Manager");
        Employee ad1 = new Employee("Srihari", "EM001","ADMIN");
        Employee ad2 = new Employee("Srikar", "EM002","ADMIN");
        Employee ad3= new Employee("Srihari", "EM003","ADMIN");
        Employee[] admins={m2,ad1,ad2,ad3};

        Employee m1 = new Employee("Prasad Chakrahari", "EM044","Manager");
        Employee d1 = new Employee("Akhila", "EM004","Developer");
        Employee d2 = new Employee("Mukheed", "EM005","Developer");
        Employee[] digitaldv={m1,d1,d2};

        Employee m3 = new Employee("Raja Shekhar", "EM037","Manager");
        Employee d3 = new Employee("Trinadh", "EM006","Developer");
        Employee d4= new Employee("Harish", "EM007","Developer");
        Employee[] mulesoftdv={m3,d3,d4};

        Employee m4 = new Employee("Ravi Babu", "EM058","Manager");
        Employee d5= new Employee("Hemalatha", "EM008","Developer");
        Employee d6= new Employee("Purnima", "EM009","Developer");
        Employee[] awsdv={m4,d5,d6};

        Employee m7 = new Employee("Ravi Babu", "EM058","Manager");
        Employee d9= new Employee("Shiva", "EM066","Developer");
        Employee d10= new Employee("Shyam", "EM055","Developer");
        Employee[] servicenowdv={m7,d9,d10};

        Employee m5 = new Employee("Srinivas Pabba", "EM065","Manager");
        Employee d7= new Employee("Vamshi", "EM010","Developer");
        Employee d8= new Employee("Shivani", "EM011","Developer");
        Employee[] azuredv={m5,d7,d8};

        Employee m6 = new Employee("Roopaly", "EM076","HR Manager");
        Employee hr1 = new Employee("Elizibeth", "EM012", "HR");
        Employee hr2= new Employee("Deepika", "EM013", "HR");
        Employee hr3= new Employee("Sowjanya", "EM014", "HR");
        Employee[] hrs={m6,hr1,hr2,hr3};

        Department digitaldep=new Department("Digital",digitaldv);
        Department mulesoftdep=new Department("Mulesoft",mulesoftdv);
        Department admindep=new Department("Admin",admins);
        Department hrsdep=new Department("Human Resource",hrs);
        Department awsdep=new Department("AWS",awsdv);
        Department azuredep=new Department("Azure",azuredv);
        Department servicenowdep=new Department("Service-Now",servicenowdv);

        Department[] departmentlist={digitaldep,mulesoftdep,admindep,hrsdep,awsdep,azuredep,servicenowdep};


        Vsoftoraganization vr=new Vsoftoraganization("V-Soft consulting","PURNA VEER",departmentlist);

        vr.getallemployeedetails();
        vr.totalemployees();
        vr.managerscount();
        vr.developercount();


    }
}
class Employee {
    String employeename;
    String designation;
    String empid;
    public Employee(String employeename, String empid,String designation){
        this.employeename=employeename;
        this.empid=empid;
        this.designation=designation;
    }
}
class Department {
    String departmentname;
    Employee[] employee;
    public Department(String departmentname,Employee[] employee){
        this.departmentname=departmentname;
        this.employee=employee;
    }

}



class Vsoftoraganization {
    String organisationname;
    String presidentname;
    Department[] departments;

    public Vsoftoraganization(String organisationname,String presidentname,Department[] departments){
        this.organisationname=organisationname;
        this.presidentname=presidentname;
        this.departments=departments;

    }
    public void getallemployeedetails() {
        for (Department dp : departments) {
            System.out.println("Department: "+dp.departmentname);
            for(Employee em: dp.employee){
                System.out.println("    "+em.empid+":"+em.employeename+"-->"+em.designation);
            }
        }
    }
    public void totalemployees() {
        int employeecount=0;
        for (Department dp : departments) {
            for(Employee em: dp.employee){
                employeecount++;
            }
        }
        System.out.println("Total Employees: "+employeecount);
    }
    public void managerscount(){
        int managerscount=0;
        for (Department dp : departments) {
            managerscount++;
        }
        System.out.println("Total managers: "+managerscount);
    }
    public void developercount() {
        int countdeveloper = 0;
        for (Department dp : departments) {
            for (Employee em : dp.employee) {
                if (em.designation == "Developer") {
                    countdeveloper++;
                }
            }
        }
        System.out.println("Total Developers: " + countdeveloper);
    }

}


