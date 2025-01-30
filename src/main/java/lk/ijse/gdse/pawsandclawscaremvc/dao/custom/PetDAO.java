package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.PetDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Pet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PetDAO extends CrudDAO<Pet> {
    public String getNextPetId() throws SQLException ;
    public ArrayList<PetDto> getAllPets() throws SQLException ;
    public boolean updatePet(PetDto petDto) throws SQLException;
    public boolean savePet(PetDto petDto) throws SQLException ;
    public boolean deletePet(String petId) throws SQLException;
    public ArrayList<PetDto> searchPetsByNameOrId(String searchText) throws SQLException;
}
