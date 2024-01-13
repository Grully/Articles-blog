package org.articlesblog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO{
    int id;
    String title;
    String description;
    String text;
    String author;
    String label;
    String dateCreate;
    String dateChange;
}
