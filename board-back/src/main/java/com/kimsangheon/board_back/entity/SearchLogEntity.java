package com.kimsangheon.board_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "searchLog")
@Table(name = "search_log")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchLogEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sequence;
    private String searchWord;
    private String relationWord;
    private boolean relation;

}
