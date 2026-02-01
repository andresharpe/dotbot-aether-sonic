package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.D;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private Context f19816a;

    /* renamed from: b, reason: collision with root package name */
    private int f19817b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f19818c;

    /* renamed from: d, reason: collision with root package name */
    private View f19819d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f19820e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f19821f;

    public F(@androidx.annotation.N ViewGroup viewGroup) {
        this.f19817b = -1;
        this.f19818c = viewGroup;
    }

    @androidx.annotation.P
    public static F c(@androidx.annotation.N ViewGroup viewGroup) {
        return (F) viewGroup.getTag(D.g.f19185R1);
    }

    @androidx.annotation.N
    public static F d(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.I int i4, @androidx.annotation.N Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(D.g.f19194U1);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(D.g.f19194U1, sparseArray);
        }
        F f4 = (F) sparseArray.get(i4);
        if (f4 != null) {
            return f4;
        }
        F f5 = new F(viewGroup, i4, context);
        sparseArray.put(i4, f5);
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P F f4) {
        viewGroup.setTag(D.g.f19185R1, f4);
    }

    public void a() {
        if (this.f19817b > 0 || this.f19819d != null) {
            e().removeAllViews();
            if (this.f19817b > 0) {
                LayoutInflater.from(this.f19816a).inflate(this.f19817b, this.f19818c);
            } else {
                this.f19818c.addView(this.f19819d);
            }
        }
        Runnable runnable = this.f19820e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f19818c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f19818c) == this && (runnable = this.f19821f) != null) {
            runnable.run();
        }
    }

    @androidx.annotation.N
    public ViewGroup e() {
        return this.f19818c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (this.f19817b > 0) {
            return true;
        }
        return false;
    }

    public void h(@androidx.annotation.P Runnable runnable) {
        this.f19820e = runnable;
    }

    public void i(@androidx.annotation.P Runnable runnable) {
        this.f19821f = runnable;
    }

    private F(ViewGroup viewGroup, int i4, Context context) {
        this.f19816a = context;
        this.f19818c = viewGroup;
        this.f19817b = i4;
    }

    public F(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N View view) {
        this.f19817b = -1;
        this.f19818c = viewGroup;
        this.f19819d = view;
    }
}
