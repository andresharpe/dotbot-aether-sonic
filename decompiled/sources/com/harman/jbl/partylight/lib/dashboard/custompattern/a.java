package com.harman.jbl.partylight.lib.dashboard.custompattern;

import com.google.firebase.remoteconfig.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import l3.d;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final ArrayList<a<T>.C0409a> f46325a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @d
    private final Random f46326b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private double f46327c;

    /* renamed from: com.harman.jbl.partylight.lib.dashboard.custompattern.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private final class C0409a {

        /* renamed from: a, reason: collision with root package name */
        private final T f46328a;

        /* renamed from: b, reason: collision with root package name */
        private final double f46329b;

        public C0409a(T t3, double d4) {
            this.f46328a = t3;
            this.f46329b = d4;
        }

        public final T a() {
            return this.f46328a;
        }

        public final double b() {
            return this.f46329b;
        }
    }

    public final void a(T t3, double d4) {
        this.f46325a.add(new C0409a(t3, d4));
        this.f46327c += d4;
    }

    public final void b() {
        this.f46325a.clear();
        this.f46327c = l.f37524n;
    }

    public final T c() {
        double nextDouble = this.f46326b.nextDouble() * this.f46327c;
        Iterator<a<T>.C0409a> it = this.f46325a.iterator();
        while (it.hasNext()) {
            a<T>.C0409a next = it.next();
            nextDouble -= next.b();
            if (nextDouble < l.f37524n) {
                return next.a();
            }
        }
        return this.f46325a.get(r0.size() - 1).a();
    }
}
