package com.asesoftware.semilla.turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftware.semilla.turnos.dto.ServiciosDTO;
import com.asesoftware.semilla.turnos.entity.ServiciosEntity;

@Mapper(componentModel = "spring")
public interface IServiciosMapper {
	@Mappings({@Mapping(source = "id", target = "numero_Servicio"), @Mapping(source = "id_comercio", target = "numero_comercio") }) //en el Entity se muestra como el source y en el DTO el target
	public ServiciosDTO entityToDTO(ServiciosEntity comerciosEntity); //Conversión de un archivo Entity a DTO
	
	@Mappings({@Mapping(source = "numero_Servicio", target = "id"), @Mapping(source = "numero_comercio", target = "id_comercio") }) 
	public ServiciosEntity dtoToEntity(ServiciosDTO serviciosDTO); //Conversión de un archivo DTO a Entity
	
	public List<ServiciosDTO> listEntityToDto(List<ServiciosEntity> serviciosEntity); //Toma una lista de entity y la pasa a DTO
	
	public List<ServiciosEntity> listDtoToEntity(List<ServiciosDTO> serviciosDTO); //Toma una lista de dto y la pasa a entity
}
