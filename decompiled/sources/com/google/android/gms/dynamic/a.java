package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.internal.Q;
import com.google.android.gms.dynamic.e;
import java.util.LinkedList;

@I0.a
/* loaded from: classes.dex */
public abstract class a<T extends e> {

    /* renamed from: a, reason: collision with root package name */
    private T f29041a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private Bundle f29042b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<p> f29043c;

    /* renamed from: d, reason: collision with root package name */
    private final g<T> f29044d = new i(this);

    @I0.a
    public a() {
    }

    @I0.a
    public static void o(@N FrameLayout frameLayout) {
        C1236h x3 = C1236h.x();
        Context context = frameLayout.getContext();
        int j4 = x3.j(context);
        String d4 = Q.d(context, j4);
        String c4 = Q.c(context, j4);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d4);
        linearLayout.addView(textView);
        Intent e4 = x3.e(context, j4, null);
        if (e4 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c4);
            linearLayout.addView(button);
            button.setOnClickListener(new m(context, e4));
        }
    }

    private final void t(int i4) {
        while (!this.f29043c.isEmpty() && this.f29043c.getLast().b() >= i4) {
            this.f29043c.removeLast();
        }
    }

    private final void u(@P Bundle bundle, p pVar) {
        T t3 = this.f29041a;
        if (t3 != null) {
            pVar.a(t3);
            return;
        }
        if (this.f29043c == null) {
            this.f29043c = new LinkedList<>();
        }
        this.f29043c.add(pVar);
        if (bundle != null) {
            Bundle bundle2 = this.f29042b;
            if (bundle2 == null) {
                this.f29042b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f29044d);
    }

    @I0.a
    protected abstract void a(@N g<T> gVar);

    @I0.a
    @N
    public T b() {
        return this.f29041a;
    }

    @I0.a
    protected void c(@N FrameLayout frameLayout) {
        o(frameLayout);
    }

    @I0.a
    public void d(@P Bundle bundle) {
        u(bundle, new k(this, bundle));
    }

    @I0.a
    @N
    public View e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new l(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f29041a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    @I0.a
    public void f() {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.d();
        } else {
            t(1);
        }
    }

    @I0.a
    public void g() {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.i();
        } else {
            t(2);
        }
    }

    @I0.a
    public void h(@N Activity activity, @N Bundle bundle, @P Bundle bundle2) {
        u(bundle2, new j(this, activity, bundle, bundle2));
    }

    @I0.a
    public void i() {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.onLowMemory();
        }
    }

    @I0.a
    public void j() {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.c();
        } else {
            t(5);
        }
    }

    @I0.a
    public void k() {
        u(null, new o(this));
    }

    @I0.a
    public void l(@N Bundle bundle) {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.h(bundle);
            return;
        }
        Bundle bundle2 = this.f29042b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @I0.a
    public void m() {
        u(null, new n(this));
    }

    @I0.a
    public void n() {
        T t3 = this.f29041a;
        if (t3 != null) {
            t3.a();
        } else {
            t(4);
        }
    }
}
