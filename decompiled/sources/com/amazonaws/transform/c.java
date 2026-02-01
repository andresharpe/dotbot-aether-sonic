package com.amazonaws.transform;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.util.json.b f24212a;

    /* renamed from: b, reason: collision with root package name */
    private final com.amazonaws.http.l f24213b;

    public c(com.amazonaws.util.json.b bVar) {
        this(bVar, null);
    }

    public String a(String str) {
        com.amazonaws.http.l lVar = this.f24213b;
        if (lVar == null) {
            return null;
        }
        return lVar.c().get(str);
    }

    public com.amazonaws.http.l b() {
        return this.f24213b;
    }

    public com.amazonaws.util.json.b c() {
        return this.f24212a;
    }

    public c(com.amazonaws.util.json.b bVar, com.amazonaws.http.l lVar) {
        this.f24212a = bVar;
        this.f24213b = lVar;
    }
}
