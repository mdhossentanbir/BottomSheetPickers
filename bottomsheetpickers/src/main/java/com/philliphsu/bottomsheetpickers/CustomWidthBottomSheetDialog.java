package com.philliphsu.bottomsheetpickers;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import android.view.ViewGroup;

final class CustomWidthBottomSheetDialog extends BottomSheetDialog {
    public CustomWidthBottomSheetDialog(@NonNull Context context, @StyleRes int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int width = getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_width);
        getWindow().setLayout(width > 0 ? width : ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
