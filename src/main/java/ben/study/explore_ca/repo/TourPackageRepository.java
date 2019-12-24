package ben.study.explore_ca.repo;

import ben.study.explore_ca.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
}

