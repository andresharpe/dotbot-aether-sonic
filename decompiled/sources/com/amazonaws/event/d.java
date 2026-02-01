package com.amazonaws.event;

import com.amazonaws.logging.LogFactory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: c, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23594c = LogFactory.c(d.class);

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f23595a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23596b;

    /* loaded from: classes.dex */
    public interface a {
        com.amazonaws.event.a a(com.amazonaws.event.a aVar);
    }

    public d(b... bVarArr) {
        this(null, bVarArr);
    }

    @Override // com.amazonaws.event.b
    public void a(com.amazonaws.event.a aVar) {
        a aVar2 = this.f23596b;
        if (aVar2 != null && (aVar = aVar2.a(aVar)) == null) {
            return;
        }
        Iterator<b> it = this.f23595a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(aVar);
            } catch (RuntimeException e4) {
                f23594c.j("Couldn't update progress listener", e4);
            }
        }
    }

    public synchronized void b(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f23595a.add(bVar);
    }

    protected List<b> c() {
        return this.f23595a;
    }

    public synchronized void d(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f23595a.remove(bVar);
    }

    public d(a aVar, b... bVarArr) {
        this.f23595a = new CopyOnWriteArrayList();
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                b(bVar);
            }
            this.f23596b = aVar;
            return;
        }
        throw new IllegalArgumentException("Progress Listeners cannot be null.");
    }
}
