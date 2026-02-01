package androidx.lifecycle;

import android.app.Application;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;

@Deprecated
/* loaded from: classes.dex */
public class o0 {

    @Deprecated
    /* loaded from: classes.dex */
    public static class a extends m0.a {
        @Deprecated
        public a(@androidx.annotation.N Application application) {
            super(application);
        }
    }

    @Deprecated
    public o0() {
    }

    @androidx.annotation.N
    @androidx.annotation.K
    @Deprecated
    public static m0 a(@androidx.annotation.N Fragment fragment) {
        return new m0(fragment);
    }

    @androidx.annotation.N
    @androidx.annotation.K
    @Deprecated
    public static m0 b(@androidx.annotation.N Fragment fragment, @androidx.annotation.P m0.b bVar) {
        if (bVar == null) {
            bVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new m0(fragment.getViewModelStore(), bVar);
    }

    @androidx.annotation.N
    @androidx.annotation.K
    @Deprecated
    public static m0 c(@androidx.annotation.N ActivityC0889g activityC0889g) {
        return new m0(activityC0889g);
    }

    @androidx.annotation.N
    @androidx.annotation.K
    @Deprecated
    public static m0 d(@androidx.annotation.N ActivityC0889g activityC0889g, @androidx.annotation.P m0.b bVar) {
        if (bVar == null) {
            bVar = activityC0889g.getDefaultViewModelProviderFactory();
        }
        return new m0(activityC0889g.getViewModelStore(), bVar);
    }
}
