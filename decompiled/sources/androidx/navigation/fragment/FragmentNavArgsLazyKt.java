package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.K;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0937n;
import androidx.navigation.InterfaceC0936m;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final class FragmentNavArgsLazyKt {
    @K
    public static final /* synthetic */ <Args extends InterfaceC0936m> C0937n<Args> a(final Fragment fragment) {
        F.p(fragment, "<this>");
        F.y(4, "Args");
        return new C0937n<>(N.d(InterfaceC0936m.class), new X2.a<Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt$navArgs$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Bundle n() {
                Bundle arguments = Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
            }
        });
    }
}
