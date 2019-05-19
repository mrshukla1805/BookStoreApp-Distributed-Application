package com.devd.spring.bookstoreaccountservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class OAuthClientRequest {

    @Id
    private Long client_id;
    private String client_secret;
    private String authorized_grant_types;
    private String authorities;

}