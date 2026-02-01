package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;

@I0.a
/* loaded from: classes.dex */
public interface e {
    @I0.a
    void a();

    @I0.a
    void b();

    @I0.a
    void c();

    @I0.a
    void d();

    @I0.a
    void e();

    @I0.a
    void f(@N Activity activity, @N Bundle bundle, @P Bundle bundle2);

    @I0.a
    @N
    View g(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle);

    @I0.a
    void h(@N Bundle bundle);

    @I0.a
    void i();

    @I0.a
    void j(@P Bundle bundle);

    @I0.a
    void onLowMemory();
}
