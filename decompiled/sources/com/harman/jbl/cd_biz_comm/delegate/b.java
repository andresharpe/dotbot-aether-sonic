package com.harman.jbl.cd_biz_comm.delegate;

import X2.l;
import android.view.View;
import androidx.fragment.app.Fragment;
import i0.InterfaceC2066b;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class b {
    @d
    public static final <T extends InterfaceC2066b> FragmentViewBindingDelegate<T> a(@d Fragment fragment, @d l<? super View, ? extends T> viewBindingFactory) {
        F.p(fragment, "<this>");
        F.p(viewBindingFactory, "viewBindingFactory");
        return new FragmentViewBindingDelegate<>(fragment, viewBindingFactory);
    }
}
