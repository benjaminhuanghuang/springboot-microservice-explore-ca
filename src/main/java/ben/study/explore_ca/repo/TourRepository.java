package ben.study.explore_ca.repo;

import ben.study.explore_ca.domain.Tour;
import org.springframework.data.repository.CrudRepository;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
