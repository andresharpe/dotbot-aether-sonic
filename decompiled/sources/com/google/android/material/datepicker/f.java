package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.d0;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface f<S> extends Parcelable {
    @d0
    int A(Context context);

    boolean F();

    @N
    Collection<Long> H();

    @P
    S V();

    void a0(long j4);

    @N
    String f(Context context);

    @N
    Collection<androidx.core.util.q<Long, Long>> j();

    void k(@N S s4);

    @N
    View p(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle, @N a aVar, @N p<S> pVar);

    @c0
    int t();
}
