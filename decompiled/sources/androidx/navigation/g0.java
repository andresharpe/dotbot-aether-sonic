package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.c0;
import com.google.firebase.analytics.FirebaseAnalytics;

@c0.b("NoOp")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/navigation/g0;", "Landroidx/navigation/c0;", "Landroidx/navigation/F;", "a", "()Landroidx/navigation/F;", FirebaseAnalytics.b.f34818z, "Landroid/os/Bundle;", "args", "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "d", "(Landroidx/navigation/F;Landroid/os/Bundle;Landroidx/navigation/T;Landroidx/navigation/c0$a;)Landroidx/navigation/F;", "", "k", "()Z", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g0 extends c0<F> {
    @Override // androidx.navigation.c0
    @l3.d
    public F a() {
        return new F(this);
    }

    @Override // androidx.navigation.c0
    @l3.d
    public F d(@l3.d F destination, @l3.e Bundle bundle, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(destination, "destination");
        return destination;
    }

    @Override // androidx.navigation.c0
    public boolean k() {
        return true;
    }
}
