package com.facebook.facebook.repositories;

//import org.hibernate.annot
import com.facebook.facebook.entities.Commentfac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<Commentfac,Long > {
}
