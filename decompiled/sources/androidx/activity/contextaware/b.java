package androidx.activity.contextaware;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<c> f4491a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f4492b;

    public void a(@N c cVar) {
        if (this.f4492b != null) {
            cVar.a(this.f4492b);
        }
        this.f4491a.add(cVar);
    }

    public void b() {
        this.f4492b = null;
    }

    public void c(@N Context context) {
        this.f4492b = context;
        Iterator<c> it = this.f4491a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @P
    public Context d() {
        return this.f4492b;
    }

    public void e(@N c cVar) {
        this.f4491a.remove(cVar);
    }
}
