package bashmachenkov.gr313.lab13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;
    String url;
    String mera = "rad";
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch radordeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = "https://olejojek.pythonanywhere.com/";
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
        radordeg = findViewById(R.id.rad_or_deg);
    }

    public void rad_deg_Change(View v)
    {
        if(radordeg.isChecked())
            mera = "deg";
        else
            mera = "rad";
    }


    public void but_add_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "+" + num2);
    }

    public void but_div_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + ":" + num2);
    }

    public void but_sub_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "-" + num2);
    }

    public void but_mul_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "*" + num2);
    }

    public void but_sqrt_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + " sqrt " + num2);
    }

    public void but_pow_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "**" + num2);
    }

    public void but_CelDiv_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "::" + num2);
    }

    public void but_ost_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "primary_functions/" + num1 + "!" + num2);
    }

    public void but_sin_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "sin " + num1 + " " + mera);
    }

    public void but_cos_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "cos " + num1 + " " + mera);
    }

    public void but_tg_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "tg " + num1 + " " + mera);
    }

    public void but_asin_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "asin " + num1 + " " + mera);
    }

    public void but_acos_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "acos " + num1 + " " + mera);
    }

    public void but_ctg_click(View v)
    {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        HttpRequest r = new HttpRequest(this)
        {
            @Override
            public void on_request_complete(String response)
            {
                Log.e("Result",response);
                result.setText(response);
            }
        };
        r.make_request(url + "trigonometry_functions/" + "ctg " + num1 + " " + mera);
    }
}