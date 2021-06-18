package com.asesoftware.semilla.turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftware.semilla.turnos.dto.ComerciosDTO;
import com.asesoftware.semilla.turnos.entity.ComerciosEntity;

@Mapper(componentModel = "spring")
public interface IComerciosMapper {
	
	@Mappings({@Mapping(source = "id", target = "num_identificador")}) //en el Entity se muestra como el source y en el DTO el target
	public ComerciosDTO entityToDTO(ComerciosEntity comerciosEntity); //Conversión de un archivo Entity a DTO
	
	@Mappings({@Mapping(source = "num_identificador", target = "id")}) //en el Entity se muestra como el target y en el DTO el source
	public ComerciosEntity dtoToEntity(ComerciosDTO comerciosDTO); //Conversión de un archivo DTO a Entity
	
	public List<ComerciosDTO> listEntityToDto(List<ComerciosEntity> comerciosEntity); //Toma una lista de entity y la pasa a DTO
	
	public List<ComerciosEntity> listDtoToEntity(List<ComerciosDTO> comerciosDto); //Toma una lista de dto y la pasa a entity

}
