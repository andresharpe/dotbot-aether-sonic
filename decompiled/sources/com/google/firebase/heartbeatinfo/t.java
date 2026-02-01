package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class t implements Comparable<t> {
    public static t e(String str, long j4) {
        return new b(str, j4);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        if (f() < tVar.f()) {
            return -1;
        }
        return 1;
    }

    public abstract long f();

    public abstract String g();
}
