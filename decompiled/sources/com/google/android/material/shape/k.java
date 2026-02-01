package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.N;
import com.google.android.material.internal.E;

/* loaded from: classes2.dex */
public class k {
    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static e a(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return b();
            }
            return new f();
        }
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static e b() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static g c() {
        return new g();
    }

    public static void d(@N View view, float f4) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).n0(f4);
        }
    }

    public static void e(@N View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j) background);
        }
    }

    public static void f(@N View view, @N j jVar) {
        if (jVar.b0()) {
            jVar.s0(E.j(view));
        }
    }
}
