package StayAbroad.Persistence;

import StayAbroad.Family.Family;
import java.sql.SQLException;
import java.util.List;

public class FamilyDAO extends DAO {

    public void listFamily(List families, String sql) throws Exception {
        try {
            queryBase(sql);
            Family family;
            while (result.next()) {
                family = new Family();
                family.setId_family(result.getInt(1));
                family.setName(result.getString(2));
                family.setMin_age(result.getInt(3));
                family.setMax_age(result.getInt(4));
                family.setNum_children(result.getInt(5));
                family.setEmail(result.getString(6));
                family.setId_family_house(result.getInt(7));
                families.add(family);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public void saveFamily(Family family) throws Exception {
        try {
            if (family == null) {
                throw new Exception("Wrong or empty family!");
            }
            String sql = "INSERT INTO families (name, min_age, max_age, num_children, email) VALUES ('"
                    + family.getName() + "' , '" + family.getMin_age() + "' , '" + family.getMax_age()
                    + "' , '" + family.getNum_children() + "' , '" + family.getEmail();
            insertModifyDelete(sql);
        } catch (SQLException e) {
            throw e;
        }
    }

    public void queryFamily(List qFam, String data) throws Exception {
        try {
            String sql = "SELECT * FROM families WHERE " + data;
            listFamily(qFam, sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
