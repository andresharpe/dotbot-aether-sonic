package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    private int f13277a;

    /* renamed from: b, reason: collision with root package name */
    private int f13278b;

    public Z(@androidx.annotation.N ViewGroup viewGroup) {
    }

    public int a() {
        return this.f13277a | this.f13278b;
    }

    public void b(@androidx.annotation.N View view, @androidx.annotation.N View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(@androidx.annotation.N View view, @androidx.annotation.N View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f13278b = i4;
        } else {
            this.f13277a = i4;
        }
    }

    public void d(@androidx.annotation.N View view) {
        e(view, 0);
    }

    public void e(@androidx.annotation.N View view, int i4) {
        if (i4 == 1) {
            this.f13278b = 0;
        } else {
            this.f13277a = 0;
        }
    }
}
