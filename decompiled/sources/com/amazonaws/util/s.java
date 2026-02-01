package com.amazonaws.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final a f24359a;

    /* loaded from: classes.dex */
    private static final class a extends LinkedHashMap<Integer, com.amazonaws.h> {

        /* renamed from: E, reason: collision with root package name */
        private int f24360E;

        public a(int i4) {
            super(i4);
            this.f24360E = i4;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Integer, com.amazonaws.h> entry) {
            if (size() > this.f24360E) {
                return true;
            }
            return false;
        }
    }

    public s(int i4) {
        this.f24359a = new a(i4);
    }

    public synchronized void a(Object obj, com.amazonaws.h hVar) {
        if (obj == null) {
            return;
        }
        this.f24359a.put(Integer.valueOf(System.identityHashCode(obj)), hVar);
    }

    public com.amazonaws.h b(Object obj) {
        return this.f24359a.get(Integer.valueOf(System.identityHashCode(obj)));
    }
}
