package com.harman.jbl.partybox.ui.widget;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.sdk.message.BatteryInfo;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final e f45933a = new e();

    private e() {
    }

    public final void a(@l3.e BatteryInfo batteryInfo, @l3.e ConstraintLayout constraintLayout, @l3.e TextView textView, @l3.e ProgressBar progressBar, @l3.e ImageView imageView) {
        Drawable drawable;
        int i4;
        int i5 = 8;
        if (batteryInfo == null) {
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        } else if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        if (textView != null && batteryInfo != null) {
            if (batteryInfo.a()) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            textView.setVisibility(i4);
            int c4 = batteryInfo.c();
            if (c4 > 100) {
                c4 = 100;
            }
            if (c4 >= 0) {
                textView.setText(c4 + "%");
            } else {
                textView.setText("--");
            }
        }
        if (progressBar != null && batteryInfo != null) {
            int intValue = Integer.valueOf(batteryInfo.c()).intValue();
            if (!batteryInfo.d() && !batteryInfo.a()) {
                i5 = 0;
            }
            progressBar.setVisibility(i5);
            if (intValue > 15) {
                drawable = progressBar.getContext().getDrawable(j.f.P9);
            } else {
                drawable = progressBar.getContext().getDrawable(j.f.R9);
            }
            progressBar.setProgressDrawable(drawable);
            progressBar.setProgress(intValue, false);
        }
        if (imageView != null && batteryInfo != null) {
            Drawable drawable2 = null;
            if (batteryInfo.a()) {
                imageView.setImageResource(j.f.f40998X0);
            } else if (batteryInfo.d()) {
                imageView.setImageResource(j.f.f40915C1);
            } else {
                imageView.setImageDrawable(null);
            }
            if (!batteryInfo.a() && !batteryInfo.d()) {
                drawable2 = imageView.getContext().getDrawable(j.f.f41039g);
            }
            imageView.setBackground(drawable2);
        }
    }
}
