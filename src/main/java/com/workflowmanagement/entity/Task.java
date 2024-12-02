package com.workflowmanagement.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.workflowmanagement.util.Priority;
import com.workflowmanagement.util.Status;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String title;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false, unique = true)
	private Priority priority;
	
	@ManyToOne
	@JoinColumn(name = "assignedTo_id", nullable = false)
	private User assignedTo;
	
	@ManyToOne
	@JoinColumn(name = "createdBy_id", nullable = false)
	private User createdBy;
	
	@Column(nullable = false, unique = true)
	private Status status;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@CreationTimestamp
	private LocalDateTime updatedAt;
	
}

