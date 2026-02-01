package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface n {

    /* loaded from: classes.dex */
    public interface a {
        void b(@N g gVar, boolean z3);

        boolean c(@N g gVar);
    }

    void b(g gVar, boolean z3);

    void d(boolean z3);

    boolean e();

    boolean f(g gVar, j jVar);

    boolean g(g gVar, j jVar);

    int getId();

    void h(a aVar);

    void i(Context context, g gVar);

    void j(Parcelable parcelable);

    boolean l(s sVar);

    o m(ViewGroup viewGroup);

    Parcelable n();
}
