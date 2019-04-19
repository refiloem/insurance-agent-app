package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.R;


/**
 * Created by toni on 6/22/17.
 */

public class QuotationDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private QuotationDialogListener listener;

    public QuotationDialog(Context context) {
        super(context);
    }

    public QuotationDialog(Context context, int theme) {
        super(context, theme);
    }

    protected QuotationDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_quotation_layout);
        toolbar.setTitle("Add a Quotation");

    }

    @Override
    public View setUpDialog(@LayoutRes int layoutResId,int childLayoutResId) {
        base = (FrameLayout) View.inflate(getContext(), layoutResId, null);
        rootView =  base.findViewById(R.id.parent);

        if (layoutResId != 0) {
            rootView =  (FrameLayout) View.inflate(getContext(), childLayoutResId, rootView);
            setUpViews();
        }

        return base;
    }

    private void setUpViews() {

    }

    public void setQuotationDialogListener(QuotationDialogListener listener) {
        this.listener = listener;
    }

    public interface QuotationDialogListener{
        void addQuotation();
}
}
