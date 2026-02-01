package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.sdk.message.BatteryInfo;

/* loaded from: classes2.dex */
public class BatteryView extends RelativeLayout {

    /* renamed from: E, reason: collision with root package name */
    private Context f45715E;

    /* renamed from: F, reason: collision with root package name */
    TextView f45716F;

    /* renamed from: G, reason: collision with root package name */
    TextView f45717G;

    /* renamed from: H, reason: collision with root package name */
    ImageView f45718H;

    /* renamed from: I, reason: collision with root package name */
    ProgressBar f45719I;

    /* renamed from: J, reason: collision with root package name */
    ConstraintLayout f45720J;

    public BatteryView(Context context) {
        super(context);
        a(context);
    }

    public void a(Context context) {
        this.f45715E = context;
        View inflate = LayoutInflater.from(context).inflate(j.i.f41572z1, this);
        this.f45716F = (TextView) inflate.findViewById(j.h.Gh);
        this.f45718H = (ImageView) inflate.findViewById(j.h.Z6);
        this.f45719I = (ProgressBar) inflate.findViewById(j.h.id);
        this.f45717G = (TextView) inflate.findViewById(j.h.Dh);
        this.f45720J = (ConstraintLayout) inflate.findViewById(j.h.f41340t1);
    }

    public void b() {
        this.f45716F.setVisibility(8);
        this.f45717G.setText("--");
        this.f45719I.setProgress(0, false);
        this.f45718H.setBackgroundResource(j.f.f41039g);
    }

    public void c(BatteryInfo batteryInfo, String str) {
        com.harman.log.f.a("BatteryView", "setBattery>>> batteryInfo = " + batteryInfo.toString());
        if (TextUtils.isEmpty(str)) {
            this.f45716F.setVisibility(8);
        } else {
            this.f45716F.setVisibility(0);
            this.f45716F.setText(str);
        }
        e.f45933a.a(batteryInfo, this.f45720J, this.f45717G, this.f45719I, this.f45718H);
    }

    public BatteryView(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public BatteryView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context);
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context);
    }
}
