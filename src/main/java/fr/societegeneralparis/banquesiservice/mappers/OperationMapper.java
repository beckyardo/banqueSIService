package fr.societegeneralparis.banquesiservice.mappers;

import org.springframework.stereotype.Component;

import fr.societegeneralparis.banquesiservice.dtos.OperationDto;
import fr.societegeneralparis.banquesiservice.entities.Operation;

@Component
public class OperationMapper {

	/*
	 * En utilisant une bibliotheque comme mapStruct cette classe devient une
	 * interface et la conversion se fera en deux lignes.
	 * 
	 * Operation operationDtoToOperationEntity(OperationDto source, @MappingTarget
	 * Operation target);
	 *
	 * OperationDto operationEntityToOperationDto(Operation source, @MappingTarget
	 * OperationDto target);
	 * 
	 * On utilise pour ce KATA une méthode qui sert pas à grand-chose pour juste illustrer le fonctionnement.
	 * 
	 */

	public OperationDto operationEntityToOperationDto(Operation source) {
		OperationDto dto = new OperationDto();
		return dto;
	}
}
