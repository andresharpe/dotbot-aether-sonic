package com.harman.jbl.partybox.ui.delegate;

import X2.l;
import android.view.LayoutInflater;
import androidx.appcompat.app.ActivityC0587e;
import i0.InterfaceC2066b;
import kotlin.A;
import kotlin.C;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class ActivityViewBindingKt {
    @d
    public static final <T extends InterfaceC2066b> A<T> a(@d final ActivityC0587e activityC0587e, @d final l<? super LayoutInflater, ? extends T> bindingInflater) {
        A<T> c4;
        F.p(activityC0587e, "<this>");
        F.p(bindingInflater, "bindingInflater");
        c4 = C.c(LazyThreadSafetyMode.NONE, new X2.a<T>() { // from class: com.harman.jbl.partybox.ui.delegate.ActivityViewBindingKt$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2066b n() {
                l<LayoutInflater, T> lVar = bindingInflater;
                LayoutInflater layoutInflater = activityC0587e.getLayoutInflater();
                F.o(layoutInflater, "getLayoutInflater(...)");
                return (InterfaceC2066b) lVar.C(layoutInflater);
            }
        });
        return c4;
    }
}
