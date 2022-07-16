package com.tgt.rysetii.learningresourcesapimanassa.repository;
import com.tgt.rysetii.learningresourcesapimanassa.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer> {
}
