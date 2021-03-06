package com.springbootjpa.board.entity;

import com.springbootjpa.board.dto.BoardDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

    private String title;

    private String contents;


    public BoardDto toDto() {

        BoardDto boardDto = BoardDto.builder()
                .id(id)
                .author(author)
                .regDate(regDate)
                .updateDate(updateDate)
                .title(title)
                .contents(contents).build();

        return boardDto;
    }
}
