package Controllers;

import Entities.Insurance;
import assets.MysqlConnection;
import assets.SqlAction;
import assets.SqlQueryType;
import assets.SqlResult;
import boundary.costumerDetailsBoundary;
import javafx.application.Platform;

import java.util.ArrayList;

public class costumerDetailsController {

    private costumerDetailsBoundary myBoundary;
    private static MysqlConnection sqlConnection = new MysqlConnection();

    public costumerDetailsController(costumerDetailsBoundary myBoundary) {
        this.myBoundary = myBoundary;
    }


    public void setInsuranceIntoDB(Insurance insurance) {
        ArrayList<Object> insuranceTableArray = new ArrayList<>();
        insuranceTableArray.add(insurance.getName());
        insuranceTableArray.add(insurance.getFamilyName());
        insuranceTableArray.add(insurance.getDate());
        insuranceTableArray.add(insurance.getRemarks());
        insuranceTableArray.add(insurance.getType());

        SqlAction sqlAction = new SqlAction(SqlQueryType.INSERT_NEW_INSURANCE, insuranceTableArray);
        sqlConnection.getResult(sqlAction);
    }


}
