package com.te.hibernateMappingBydurgesh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Question {
	@Id
	@Column(name = "question_Id")
	private int questionId;
	private String question;
	private Answer answer;

}
