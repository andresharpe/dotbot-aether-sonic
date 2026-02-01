package com.harman.sdk.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class c<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<T> f47743a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f47744b;

    /* renamed from: c, reason: collision with root package name */
    private Collection<T> f47745c;

    public c() {
        this((Comparator) null);
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized Collection<T> a() {
        try {
            if (this.f47745c == null) {
                this.f47745c = Collections.unmodifiableCollection(new ArrayList(this.f47743a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47745c;
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized int add(T t3) {
        try {
            if (!this.f47743a.contains(t3)) {
                this.f47743a.add(t3);
                Comparator<? super T> comparator = this.f47744b;
                if (comparator != null) {
                    Collections.sort(this.f47743a, comparator);
                }
                this.f47745c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47743a.size();
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized void clear() {
        this.f47743a.clear();
        this.f47745c = null;
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized boolean contains(Object obj) {
        return this.f47743a.contains(obj);
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized int remove(Object obj) {
        try {
            if (this.f47743a.remove(obj)) {
                this.f47745c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47743a.size();
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized T replace(Object obj, T t3) {
        T t4;
        try {
            int indexOf = this.f47743a.indexOf(obj);
            t4 = null;
            if (indexOf >= 0 && !this.f47743a.contains(t3)) {
                T t5 = this.f47743a.set(indexOf, t3);
                Comparator<? super T> comparator = this.f47744b;
                if (comparator != null) {
                    Collections.sort(this.f47743a, comparator);
                }
                this.f47745c = null;
                t4 = t5;
            }
        } catch (Throwable th) {
            throw th;
        }
        return t4;
    }

    @Override // com.harman.sdk.concurrent.d
    public synchronized int size() {
        return this.f47743a.size();
    }

    public c(int i4) {
        this(i4, null);
    }

    public c(Comparator<? super T> comparator) {
        this(0, comparator);
    }

    public c(int i4, Comparator<? super T> comparator) {
        this.f47743a = new ArrayList<>(i4);
        this.f47744b = comparator;
    }
}
