package campbell.ca.hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    TextView result;
    double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // get a handle to text fields
        etNum1 = (EditText) findViewById(R.id.num1);
        etNum2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }

    public void addNums(View v) {
        if (!readNums())
            return;
        result.setText(Double.toString(num1+num2));
    }
    public void subtrNums(View v) {
        if (!readNums())
            return;
        result.setText(Double.toString(num1-num2));
    }
    public void divNums(View v) {
        if (!readNums())
            return;
        if (num2 ==0 )
            result.setText("Cannot divide by 0");
        else
            result.setText(Double.toString(num1/num2));
    }
    public void multNums(View v) {
        if (!readNums())
            return;
        result.setText(Double.toString(num1*num2));
    }
    public boolean readNums()  {
      if (etNum1.getText().toString().isEmpty() ||  etNum2.getText().toString().isEmpty() ) {
          result.setText("Number(s) input invalid");
          return false;
      }
        // TODO should be checking this ...
        num1 = Double.parseDouble(etNum1.getText().toString());
        num2 = Double.parseDouble(etNum2.getText().toString());
       return true;
    }
}
