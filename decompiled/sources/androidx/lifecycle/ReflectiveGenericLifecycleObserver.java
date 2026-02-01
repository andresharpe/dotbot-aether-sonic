package androidx.lifecycle;

import androidx.lifecycle.C0903e;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements A {

    /* renamed from: E, reason: collision with root package name */
    private final Object f15478E;

    /* renamed from: F, reason: collision with root package name */
    private final C0903e.a f15479F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f15478E = obj;
        this.f15479F = C0903e.f15594c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.A
    public void f(@androidx.annotation.N E e4, @androidx.annotation.N Lifecycle.Event event) {
        this.f15479F.a(e4, event, this.f15478E);
    }
}
