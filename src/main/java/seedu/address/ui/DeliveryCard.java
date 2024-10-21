package seedu.address.ui;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.delivery.Delivery;

/**
 * An UI component that displays information of a {@code Delivery}.
 */
public class DeliveryCard extends UiPart<Region> {

    private static final String FXML = "DeliveryListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Delivery delivery;

    @javafx.fxml.FXML
    private HBox cardPane;
    @FXML
    private Label id;
    @FXML
    private Label deliveryId;
    @FXML
    private Label itemName;
    @FXML
    private Label address;
    @FXML
    private Label cost;
    @FXML
    private Label date;
    @FXML
    private Label time;
    @FXML
    private Label eta;
    @FXML
    private Label status;

    /**
     * Creates a {@code DeliveryCard} with the given {@code Delivery} and index to display.
     */
    public DeliveryCard(Delivery delivery, int displayedIndex) {
        super(FXML);
        this.delivery = delivery;
        id.setText(displayedIndex + ". ");
        deliveryId.setText(delivery.getDeliveryId().toString());
        address.setText(delivery.getAddress().toString());
        itemName.setText(delivery.getItemName().toString());
        cost.setText(delivery.getCost().toString());
        date.setText(delivery.getDate().toString());
        time.setText(delivery.getTime().toString());
        eta.setText(delivery.getEta().toString());
        status.setText(delivery.getStatus().toString());
    }
}
