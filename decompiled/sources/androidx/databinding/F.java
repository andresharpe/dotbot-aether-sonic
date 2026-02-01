package androidx.databinding;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class F<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a, reason: collision with root package name */
    private final y<T> f13951a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f13952b;

    /* renamed from: c, reason: collision with root package name */
    private T f13953c;

    public F(ViewDataBinding viewDataBinding, int i4, y<T> yVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f13952b = i4;
        this.f13951a = yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @P
    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f13953c;
    }

    public void c(androidx.lifecycle.E e4) {
        this.f13951a.b(e4);
    }

    public void d(T t3) {
        e();
        this.f13953c = t3;
        if (t3 != null) {
            this.f13951a.e(t3);
        }
    }

    public boolean e() {
        boolean z3;
        T t3 = this.f13953c;
        if (t3 != null) {
            this.f13951a.d(t3);
            z3 = true;
        } else {
            z3 = false;
        }
        this.f13953c = null;
        return z3;
    }
}
