package com.tyss.manytomany.practise.ManytoManyEx;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Entity
@Data
@Table(name="books_info")
public class Books {
	@Id
	@Column
	private int book_id;
	@Column
	private  String Books;
	@Exclude
	@ManyToMany (cascade =CascadeType.ALL, mappedBy="Author")
	private List<Author> author;

}
