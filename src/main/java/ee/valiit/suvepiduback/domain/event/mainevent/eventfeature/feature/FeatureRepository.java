package ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {


    @Query("select f from Feature f where f.id = :featureId order by f.name")
    List<Feature> findFeaturesAscBy(Integer featureId);


}