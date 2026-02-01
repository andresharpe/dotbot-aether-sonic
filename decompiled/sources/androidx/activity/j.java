package androidx.activity;

import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.S;
import androidx.core.os.C0738a;
import androidx.core.util.InterfaceC0764e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4499a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f4500b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0764e<Boolean> f4501c;

    public j(boolean z3) {
        this.f4499a = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(@N c cVar) {
        this.f4500b.add(cVar);
    }

    @K
    public abstract void e();

    @K
    public final boolean f() {
        return this.f4499a;
    }

    @K
    public final void g() {
        Iterator<c> it = this.f4500b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(@N c cVar) {
        this.f4500b.remove(cVar);
    }

    @K
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public final void i(boolean z3) {
        this.f4499a = z3;
        InterfaceC0764e<Boolean> interfaceC0764e = this.f4501c;
        if (interfaceC0764e != null) {
            interfaceC0764e.accept(Boolean.valueOf(z3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(@P InterfaceC0764e<Boolean> interfaceC0764e) {
        this.f4501c = interfaceC0764e;
    }
}
