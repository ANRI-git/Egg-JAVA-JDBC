package StayAbroad;

import StayAbroad.Family.FamilyService;

public class Main {

    public static void main(String[] args) throws Exception {
        FamilyService fServ = new FamilyService();
        try{
        fServ.menuFamily();
        } catch (Exception e) {
            throw e;
        }
    }

}
