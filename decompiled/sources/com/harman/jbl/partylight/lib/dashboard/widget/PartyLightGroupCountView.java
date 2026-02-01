package com.harman.jbl.partylight.lib.dashboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.partylight.lib.g;

/* loaded from: classes2.dex */
public class PartyLightGroupCountView extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    TextView f46464p0;

    /* renamed from: q0, reason: collision with root package name */
    ImageView f46465q0;

    public PartyLightGroupCountView(@N Context context) {
        this(context, null);
    }

    public void L(String str, int i4) {
        if (h.c(str)) {
            this.f46465q0.setBackgroundResource(g.e.f46759B);
        } else if (h.e(str)) {
            this.f46465q0.setBackgroundResource(g.e.f46767J);
        }
        this.f46464p0.setText(String.valueOf(i4));
    }

    public PartyLightGroupCountView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PartyLightGroupCountView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(g.h.f46994D, this);
        this.f46464p0 = (TextView) findViewById(g.C0418g.f46913e2);
        this.f46465q0 = (ImageView) findViewById(g.C0418g.f46943m0);
    }
}
