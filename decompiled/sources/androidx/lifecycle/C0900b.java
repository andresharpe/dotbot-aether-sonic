package androidx.lifecycle;

import android.app.Application;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0900b extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final Application f15568H;

    public C0900b(@l3.d Application application) {
        kotlin.jvm.internal.F.p(application, "application");
        this.f15568H = application;
    }

    @l3.d
    public <T extends Application> T u() {
        T t3 = (T) this.f15568H;
        kotlin.jvm.internal.F.n(t3, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t3;
    }
}
