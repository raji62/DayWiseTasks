package jpademo;
import jakarta.persistence.EntityManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Employee emp1=new Employee("Dustin","Physics",70000);
		em.persist(emp1);
		Employee emp2=em.find(Employee.class,2);
		System.out.println(emp2.getName());
		System.out.println(emp2.getId());
		emp2.setSalary(5000);
		em.merge(emp2);
		
		em.getTransaction().commit();
		em.close();
		JPAUtil.close();
	
	}
}
