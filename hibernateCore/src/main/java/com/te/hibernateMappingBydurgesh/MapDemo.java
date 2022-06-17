package com.te.hibernateMappingBydurgesh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapDemo {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Question question1 = new Question();
		question1.setQuestionId(11);
		question1.setQuestion("What is Java?");
		Answer answer = new Answer();
		answer.setAnswerId(1212);
		answer.setAnswer("high level programming language");
		Question question2 = new Question();
		question2.setQuestionId(21);
		question2.setQuestion("How java is roboust in nature?");
		Answer answer1 = new Answer();
		answer1.setAnswerId(1212);
		answer1.setAnswer("Memory managament of java provides gc collector ");
		question1.setAnswer(answer);
		entityTransaction.begin();
		entityManager.persist(question1);
		entityManager.persist(question2);
		entityTransaction.commit();

	}
}
