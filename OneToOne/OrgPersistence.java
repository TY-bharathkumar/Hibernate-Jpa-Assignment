package com.tyss.onetoone.practise.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OrgPersistence {
	public static void main(String[] args) {
		EntityManagerFactory entityfactory;
		EntityManager entitymanager;
		EntityTransaction entitytransaction;
		OrgSpectilization os=new OrgSpectilization();
		os.setId(8);
		os.setSpecialized("testing");

		Organization o=new Organization();
		o.setOrg_id(3);
		o.setOrg_name("testyantra");
		o.setQuote("beinglesscomplex");
		o.setOrgspc(os);


		try {
			entityfactory=Persistence.createEntityManagerFactory("OrgDetails");
			entitymanager=entityfactory.createEntityManager();
			entitytransaction=entitymanager.getTransaction();

			entitytransaction.begin();

			//entitymanager.persist(os);
			//entitymanager.persist(o);
			System.out.println("organization details");
			System.out.println(o.getOrg_id());
			System.out.println(o.getOrg_name());
			System.out.println(o.getQuote());
			System.out.println("organisation sepecilization");
			System.out.println(o.getOrgspc().getId());
			System.out.println(o.getOrgspc().getSpecialized());

			entitytransaction.commit();;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
