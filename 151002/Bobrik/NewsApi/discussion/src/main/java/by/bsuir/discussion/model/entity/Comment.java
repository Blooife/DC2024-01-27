package by.bsuir.discussion.model.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter
@Table("tbl_comment")
public class Comment {
    @PrimaryKey
    private CommentKey key;

    @Column("content")
    private String content;

    @Column("state")
    @CassandraType(type = CassandraType.Name.VARCHAR)
    private CommentState state;
}