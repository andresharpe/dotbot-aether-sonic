package com.harman.jbl.partybox.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.P;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private P<Boolean> f46189a = new P<>();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private Toast f46190b;

    public final void a() {
        Toast toast = this.f46190b;
        if (toast != null) {
            if (toast != null) {
                toast.cancel();
            }
            this.f46190b = null;
        }
    }

    @l3.d
    public final P<Boolean> b() {
        return this.f46189a;
    }

    @l3.e
    public final Toast c() {
        return this.f46190b;
    }

    public final void d(@l3.d P<Boolean> p4) {
        F.p(p4, "<set-?>");
        this.f46189a = p4;
    }

    public final void e(@l3.e Toast toast) {
        this.f46190b = toast;
    }

    public final void f(@l3.d Context context, @l3.d String text) {
        F.p(context, "context");
        F.p(text, "text");
        Object systemService = context.getSystemService("layout_inflater");
        F.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(j.i.f41461X2, (ViewGroup) null);
        Toast toast = this.f46190b;
        if (toast != null) {
            if (toast != null) {
                toast.cancel();
            }
            this.f46190b = null;
        }
        Toast toast2 = new Toast(context);
        this.f46190b = toast2;
        toast2.setGravity(8388695, 0, 0);
        Toast toast3 = this.f46190b;
        if (toast3 != null) {
            toast3.setDuration(1);
        }
        Toast toast4 = this.f46190b;
        if (toast4 != null) {
            toast4.setView(inflate);
        }
        Toast toast5 = this.f46190b;
        if (toast5 != null) {
            toast5.show();
        }
        View findViewById = inflate.findViewById(j.h.kh);
        F.n(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(text);
    }
}
