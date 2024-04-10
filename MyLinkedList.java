package com.om.dsa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyLinkedList {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee(1, "Omkar", 232132.09);
		Employee emp2 = new Employee(2, "Swarnim", 222132.09);
		Employee emp3 = new Employee(3, "Harsh", 212132.09);
		Employee emp4 = new Employee(4, "Anshuk", 242132.09);
		Employee emp5 = new Employee(5, "Abhay", 252132.09);
		
		MyList ls = new MyList();
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.addToBegining(emp4);
		ls.addAfterId(emp5, 2);
		ls.deleteLast();
//		ls.printAll();
		FileOutputStream fs = new FileOutputStream("data.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(emp3);
		os.close();
	      fs.close();
	      
		FileInputStream f = new FileInputStream("data.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Employee emp6 = new Employee();
		emp6 = (Employee)o.readObject();
		o.close();
	      f.close();
	      
	      ls.add(emp6);
	      ls.printAll();
	}
	
}

class MyList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Employee head=null;
	Employee current = null;
	public void add(Employee node) {
		if(head == null) {
			head = node;
			current = node;
		    current.next = null;
		    current.prev = null;
		}
		else {
			current.next = node;
			node.prev = current;
			current = node;
		}
	}
	
	public void printAll() {
		Employee ptr=head;
		while(ptr!=null) {
			System.out.println(ptr);
			ptr = ptr.next;
		}
	}
	
	public void addToBegining(Employee node) {
		node.next = head;
		head = node;
	}
	
	public void addAfterId(Employee node,int empNum) {
		Employee ptr = head;
		Employee finder = null;
		if(head == null) {
			head = node;
			current = node;
		    current.next = null;
		    current.prev = null;
		}
		else {
			while(ptr!=null) {
				if(ptr.getEmpId() == empNum) {
					Employee temp = ptr.next;
					node.next = temp;
					ptr.next=node;
				}
				ptr = ptr.next;
			}
		}
	}
	
	public void deleteAll() {
		Employee ptr = head;
		Employee ptr2 = head;
		while(ptr!=null) {
			ptr = ptr.next;
			
			ptr2.next =null;
			
			
		}
		this.head = null;
		
	}
	
	public void delete(Employee node) {
		Employee ptr = head;
		Employee prevEle = head;
		while(ptr!= null) {
			
			if(ptr ==  node) {
				prevEle.next = ptr.next;
				ptr.next = null;
				
			}
			prevEle = ptr;
			ptr = ptr.next;
		}
	}
	public void deleteFirst() {
		if(head!=null) {
			this.head = this.head.next;			
		}
	}
	public void deleteLast() {
		Employee ptr = head;
//		Employee prevPtr = head;
		if(ptr.next == null) this.head = null;
		while(ptr!=null) {
			if(ptr.next.next==null)ptr.next = null;
			ptr = ptr.next;
		}
//		prevPtr.next  = null;j

		}
	
	public void modify(int id,String name,Double salary) {
		Employee ptr = head;
		while(ptr!=null) {
			if(ptr.getEmpId() == id) {
				ptr.setEmpName(name);
				ptr.setEmpSalary(salary);
			}
		}
	}
	
	
	
}

class Employee implements Serializable{
	private int empId;
	private String empName;
	private Double empSalary;
	
	 Employee next;
	 Employee prev;
	
	public Employee() {
		super();
		
	}

	public Employee(int empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	
	
}
