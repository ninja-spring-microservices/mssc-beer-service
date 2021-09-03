package balaji.springframweork.msscbeerservice.web.mapper;

import balaji.springframweork.msscbeerservice.domain.Beer;
import balaji.springframweork.msscbeerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDTOToBeer(BeerDTO beerDTO);

    BeerDTO beerToBeerDTO(Beer beer);

}
