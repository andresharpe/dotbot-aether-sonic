package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, Integer> f26209a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f26210b;

    /* renamed from: c, reason: collision with root package name */
    private int f26211c;

    /* renamed from: d, reason: collision with root package name */
    private int f26212d;

    public c(Map<d, Integer> map) {
        this.f26209a = map;
        this.f26210b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f26211c += it.next().intValue();
        }
    }

    public int a() {
        return this.f26211c;
    }

    public boolean b() {
        if (this.f26211c == 0) {
            return true;
        }
        return false;
    }

    public d c() {
        int size;
        d dVar = this.f26210b.get(this.f26212d);
        Integer num = this.f26209a.get(dVar);
        if (num.intValue() == 1) {
            this.f26209a.remove(dVar);
            this.f26210b.remove(this.f26212d);
        } else {
            this.f26209a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f26211c--;
        if (this.f26210b.isEmpty()) {
            size = 0;
        } else {
            size = (this.f26212d + 1) % this.f26210b.size();
        }
        this.f26212d = size;
        return dVar;
    }
}
