package th.or.baac.klinkul.prin.baacrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private UserTABLE objUserTABLE;
    private FoodTABLE objFoodTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create & Connect Database
        createAndConnected();

        // Tester Add New Value
        testerAdd();

    } // Main Method

    private void testerAdd() {

        objUserTABLE.addNewUser("testUser", "testPassword", "ทดสอบภาษาไทย");
        objFoodTABLE.addNewFood("ชื่ออาหาร", "testSource", "123");

    }

    private void createAndConnected() {

        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);

    }

} // Main Class
