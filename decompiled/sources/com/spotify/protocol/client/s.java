package com.spotify.protocol.client;

import G2.b;
import com.spotify.protocol.types.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class s implements b.c, b.InterfaceC0009b {

    /* renamed from: n, reason: collision with root package name */
    private final Set<b.a> f48909n = Collections.newSetFromMap(new ConcurrentHashMap());

    private void d(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().j(message.c(1), message.d(2));
        }
    }

    private void e(G2.c message) {
        for (b.a aVar : this.f48909n) {
            int b4 = message.b(1);
            if (b4 != 32) {
                if (b4 != 34) {
                    if (b4 == 48) {
                        aVar.a(b.a.a(message.b(2)), message.c(3), message.d(4));
                    }
                } else {
                    aVar.i(b.a.a(message.b(2)), message.c(3), message.d(4));
                }
            } else {
                aVar.c(b.a.a(message.b(2)), message.c(3), message.d(4));
            }
        }
    }

    private void f(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().d(b.C0436b.a(message.b(1)), message.b(2), message.c(5));
        }
    }

    private void g(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().b(message.c(1), message.d(2));
        }
    }

    private void h(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().e(b.a.a(message.b(1)), message.c(2), message.c(3), message.c(4));
        }
    }

    private void i(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().g(b.a.a(message.b(1)), b.C0436b.a(message.b(2)));
        }
    }

    private void j(G2.c message) {
        Iterator<b.a> it = this.f48909n.iterator();
        while (it.hasNext()) {
            it.next().f(message.b(1), message.c(2));
        }
    }

    @Override // G2.b.c
    public boolean a(G2.c message) {
        int a4 = message.a();
        if (a4 != 2) {
            if (a4 != 3) {
                if (a4 != 6) {
                    if (a4 != 8) {
                        if (a4 != 33) {
                            if (a4 != 36) {
                                if (a4 != 50) {
                                    return false;
                                }
                                h(message);
                                return true;
                            }
                            f(message);
                            return true;
                        }
                        i(message);
                        return true;
                    }
                    e(message);
                    return true;
                }
                g(message);
                return true;
            }
            d(message);
            return true;
        }
        j(message);
        return true;
    }

    @Override // G2.b.c
    public void b(b.a receiver) {
        this.f48909n.add(receiver);
    }

    @Override // G2.b.c
    public void c(b.a receiver) {
        this.f48909n.remove(receiver);
    }
}
