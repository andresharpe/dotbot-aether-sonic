package com.harman.jbl.partylight.lib.dashboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.x0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import com.harman.jbl.partylight.lib.biz.AuracastMode;
import com.harman.jbl.partylight.lib.dashboard.p;
import com.harman.jbl.partylight.lib.g;

/* loaded from: classes2.dex */
public class MenuPartyBoxSwitchView extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private TextView f46442p0;

    /* renamed from: q0, reason: collision with root package name */
    private TextView f46443q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView f46444r0;

    /* renamed from: s0, reason: collision with root package name */
    private ImageView f46445s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f46446t0;

    /* renamed from: u0, reason: collision with root package name */
    private a f46447u0;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z3);

        void b(View view);
    }

    public MenuPartyBoxSwitchView(@N Context context) {
        this(context, null);
    }

    public static String L(String str) {
        SpeakerDevice a4 = p.a();
        if (!TextUtils.isEmpty(str) && a4 != null && str.equalsIgnoreCase(com.harman.jbl.cd_biz_comm.utils.d.f(a4.g()))) {
            return a4.c();
        }
        return x0.d(g.l.f47093R) + " PartyBox";
    }

    private void setSwitchDescColor(int i4) {
        TextView textView = this.f46443q0;
        textView.setTextColor(textView.getResources().getColor(i4));
    }

    private void setSwitchValue(boolean z3) {
        if (this.f46446t0 != z3) {
            this.f46446t0 = z3;
            if (z3) {
                this.f46444r0.setImageResource(g.e.f46789e);
            } else {
                this.f46444r0.setImageResource(g.e.f46788d);
            }
        }
    }

    public void M(AuracastMode auracastMode, @P String str) {
        boolean z3;
        boolean z4 = false;
        if (auracastMode != AuracastMode.OFF) {
            z3 = true;
        } else {
            z3 = false;
        }
        setSwitchValue(z3);
        if (z3) {
            if (auracastMode == AuracastMode.ON_LINKED) {
                z4 = true;
            }
            setSwitchDescColor(g.c.f46641s);
            if (z4) {
                setSwitchDesc(L(str));
                return;
            } else {
                setSwitchDesc(getContext().getString(g.l.f47090O0));
                return;
            }
        }
        setSwitchDescColor(g.c.f46621I);
        setSwitchDesc(getContext().getString(g.l.f47064B0));
    }

    public a getOnSwitchChangedListener() {
        return this.f46447u0;
    }

    public boolean getSwitchValue() {
        return this.f46446t0;
    }

    public void onClick(View view) {
        a aVar;
        if (view.getId() == g.C0418g.f46974u0) {
            boolean z3 = !this.f46446t0;
            setSwitchValue(z3);
            a aVar2 = this.f46447u0;
            if (aVar2 != null) {
                aVar2.a(z3);
                return;
            }
            return;
        }
        if (view.getId() == g.C0418g.f46977v0 && (aVar = this.f46447u0) != null) {
            aVar.b(view);
        }
    }

    public void setOnSwitchChangedListener(a aVar) {
        this.f46447u0 = aVar;
    }

    public void setSwitchDesc(String str) {
        this.f46443q0.setText(str);
    }

    public void setSwitchTitle(String str) {
        this.f46442p0.setText(str);
    }

    public MenuPartyBoxSwitchView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuPartyBoxSwitchView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46446t0 = false;
        LayoutInflater.from(context).inflate(g.h.f46996F, this);
        this.f46442p0 = (TextView) findViewById(g.C0418g.f46945m2);
        this.f46443q0 = (TextView) findViewById(g.C0418g.f46941l2);
        ImageView imageView = (ImageView) findViewById(g.C0418g.f46974u0);
        this.f46444r0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuPartyBoxSwitchView.this.onClick(view);
            }
        });
        ImageView imageView2 = (ImageView) findViewById(g.C0418g.f46977v0);
        this.f46445s0 = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuPartyBoxSwitchView.this.onClick(view);
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.n.f47210y);
        setSwitchTitle(obtainStyledAttributes.getString(g.n.f47167A));
        setSwitchDesc(obtainStyledAttributes.getString(g.n.f47211z));
        setSwitchValue(obtainStyledAttributes.getBoolean(g.n.f47168B, false));
        obtainStyledAttributes.recycle();
    }
}
