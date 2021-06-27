package assets;

/**
 * @author Itay Ziv
 * This enum will represent all the queries in our project
 */
public enum SqlQueryType {

    /* *****************************************
     * ********** Common Queries ****************
     * *****************************************/
    GET_ALL_Insurance_TABLE(SqlExecutionType.EXECUTE_QUERY),
    INSERT_NEW_INSURANCE(SqlExecutionType.UPDATE_QUERY),

    /* DO NOT CHANGE THE LOCATION OF MAX_SQL_QUERY!!! */
    /* DO NOT CHANGE THE LOCATION OF MAX_SQL_QUERY!!! */
    /* DO NOT CHANGE THE LOCATION OF MAX_SQL_QUERY!!! */
    /* DO NOT CHANGE THE LOCATION OF MAX_SQL_QUERY!!! */
    MAX_SQL_QUERY(SqlExecutionType.NOT_QUERY);  /* Number of queries */


    private SqlExecutionType executionType;

    private SqlQueryType(SqlExecutionType executionType) {
        this.executionType = executionType;
    }

    public SqlExecutionType getExecutionType() {
        return executionType;
    }


    public int getCode() {
        return ordinal();
    }

    /**
     * @author Itay Ziv
     * This enum will represent which execution method need to
     * be used EXECUTE QUERY - will represent PreparedStatement ".executeQuery" method
     * Applicable for select queries
     * UPDATE QUERY - will represent PreparedStatement ".updateQuery" method
     * Applicable for delete, update and insert queries
     */

    public enum SqlExecutionType {
        NOT_QUERY, EXECUTE_QUERY, UPDATE_QUERY, INSERT_GET_AUTO_INCREMENT_ID;
    }

}
