package com.harman.jbl.partybox.ui.lightshow.custompattern;

import com.google.firebase.remoteconfig.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import l3.d;

/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final ArrayList<b<T>.a> f44014a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @d
    private final Random f44015b = new Random();

    /* renamed from: c, reason: collision with root package name */
    private double f44016c;

    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final T f44017a;

        /* renamed from: b, reason: collision with root package name */
        private final double f44018b;

        public a(T t3, double d4) {
            this.f44017a = t3;
            this.f44018b = d4;
        }

        public final T a() {
            return this.f44017a;
        }

        public final double b() {
            return this.f44018b;
        }
    }

    public final void a(T t3, double d4) {
        this.f44014a.add(new a(t3, d4));
        this.f44016c += d4;
    }

    public final void b() {
        this.f44014a.clear();
        this.f44016c = l.f37524n;
    }

    public final T c() {
        double nextDouble = this.f44015b.nextDouble() * this.f44016c;
        Iterator<b<T>.a> it = this.f44014a.iterator();
        while (it.hasNext()) {
            b<T>.a next = it.next();
            nextDouble -= next.b();
            if (nextDouble < l.f37524n) {
                return next.a();
            }
        }
        return this.f44014a.get(r0.size() - 1).a();
    }
}
