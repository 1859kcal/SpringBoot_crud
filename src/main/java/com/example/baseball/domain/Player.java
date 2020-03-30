package com.example.baseball.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity		//DBのテーブルと紐づける(前提；SpringBootとJPAを使用している)
public class Player {
	@Id		//付けた変数がプライマリーキーになる
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//連番が自動で振られる
	private Long id;
	private String name;
	private Integer age;
	private String team;
	private String position;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + ", position=" + position + "]";
	}

}
