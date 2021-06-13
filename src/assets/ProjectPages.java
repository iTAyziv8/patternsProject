package assets;

/**
 * Enum that represents all our project boundaries
 *
 * @author Itay Ziv
 */
public enum ProjectPages {

    START_PAGE("/boundary/startScreen.fxml"),
    CUSTOMER_DETAILS_PAGE("/boundary/costumerDetails.fxml"),
    VIEW_PURCHASES_PAGE("/boundary/viewPurchases.fxml");




    private String path;

    private ProjectPages(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}