package Controllers;

import Entities.Insurance;
import assets.MysqlConnection;
import assets.SqlAction;
import assets.SqlQueryType;
import assets.SqlResult;
import boundary.ViewPurchasesBoundary;
import boundary.costumerDetailsBoundary;

import java.time.LocalDate;
import java.util.ArrayList;


public class ViewPurchasesContoller {

    ViewPurchasesBoundary myBoundary;

    public ViewPurchasesContoller(ViewPurchasesBoundary myBoundary) {
        this.myBoundary = myBoundary;
    }


    private ArrayList<Insurance> allInsurances = new ArrayList<>();
    private static MysqlConnection sqlConnection = new MysqlConnection();

    public ArrayList<Insurance> getAllInsurancesFromDB(){
            SqlAction sqlAction = new SqlAction(SqlQueryType.GET_ALL_Insurance_TABLE);
            changeResultToInsurance(sqlConnection.getResult(sqlAction));
            System.out.print(allInsurances);
            return allInsurances;
        }

        private void changeResultToInsurance(SqlResult result) {
            ArrayList<Insurance> resultList = new ArrayList<>();

            for (ArrayList<Object> a : result.getResultData()) {
                Insurance insurance = new Insurance.Builder().setName((String) a.get(0)).setFamilyName((String) a.get(1)).setDate((String) a.get(2)).setRemarks((String) a.get(3)).setType((String) a.get(4)).build();
                resultList.add(insurance);
            }

            allInsurances.addAll(resultList);
        }


}
