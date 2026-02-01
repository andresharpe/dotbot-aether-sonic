package L2;

import J2.a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.sdk.message.BatteryInfo;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f1680a = new b();

    private b() {
    }

    public final void a(@e BatteryInfo batteryInfo, @e ConstraintLayout constraintLayout, @e TextView textView, @e ProgressBar progressBar, @e ImageView imageView) {
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
                drawable = progressBar.getContext().getDrawable(a.c.f1281v);
            } else {
                drawable = progressBar.getContext().getDrawable(a.c.f1282w);
            }
            progressBar.setProgressDrawable(drawable);
            progressBar.setProgress(intValue, false);
        }
        if (imageView != null && batteryInfo != null) {
            Drawable drawable2 = null;
            if (batteryInfo.a()) {
                imageView.setImageResource(a.c.f1276q);
            } else if (batteryInfo.d()) {
                imageView.setImageResource(a.g.f1337h);
            } else {
                imageView.setImageDrawable(null);
            }
            if (!batteryInfo.a() && !batteryInfo.d()) {
                drawable2 = imageView.getContext().getDrawable(a.c.f1269j);
            }
            imageView.setBackground(drawable2);
        }
    }
}
