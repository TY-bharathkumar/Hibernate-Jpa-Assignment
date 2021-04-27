package com.tyss.manytomany.practise.ManytoManyEx;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Entity
@Data
@Table(name="Author_info")
public class Author {
	@Id
	@Column
	private int authorId;
	@Column
	private String authorname;

	@Exclude
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="Books")
	@JoinTable(name="Author_Books_info",joinColumns=@JoinColumn(name="id", referencedColumnName="authorId"),inverseJoinColumns=@JoinColumn(name="bid", referencedColumnName="book_id"))
	private List<Books> books;



}
