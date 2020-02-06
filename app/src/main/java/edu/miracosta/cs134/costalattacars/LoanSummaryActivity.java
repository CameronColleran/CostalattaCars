package edu.miracosta.cs134.costalattacars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.NumberFormat;
import java.util.Locale;

import edu.miracosta.cs134.costalattacars.model.CarLoan;

public class LoanSummaryActivity extends AppCompatActivity {

    // Instance variable
    CarLoan carLoan;
    private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);

        // Extract the data from the intent
        double carPrice;
        double downPayment;
        int loanTerm;
        Intent intent = getIntent();
        carPrice = intent.getDoubleExtra("CarPrice", 0);
        downPayment = intent.getDoubleExtra("DownPayment", 0);
        loanTerm = intent.getIntExtra("LoanTerm",5);

        // Lets send the data to the model
        carLoan = new CarLoan();

        carLoan.setPrice(carPrice);
        carLoan.setDownPayment(downPayment);
        carLoan.setLoanTerm(loanTerm);

        // Populate text views with the data from the carLoan model object

    }

    // Return to main activity when return button is clicked
    public void returnToMain(View v)
    {
        finish();
    }


}
