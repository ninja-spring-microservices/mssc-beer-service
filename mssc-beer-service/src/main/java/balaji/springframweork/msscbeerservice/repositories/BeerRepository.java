package balaji.springframweork.msscbeerservice.repositories;

import balaji.springframweork.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
