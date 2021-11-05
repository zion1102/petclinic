package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
