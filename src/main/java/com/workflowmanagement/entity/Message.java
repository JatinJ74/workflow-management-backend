package com.workflowmanagement.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "sender_id", nullable = false)
	private User senderId;
	
	@ManyToOne
	@JoinColumn(name = "reciever_id", nullable = false)
	private User recieverId;
	
	@Column(nullable = false)
	private String message;
	
	@CreationTimestamp
	private LocalDateTime timeStamp;
	

}
