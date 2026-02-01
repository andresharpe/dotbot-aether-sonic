package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class v extends ByteArrayInputStream {

    /* renamed from: E, reason: collision with root package name */
    private final String f24364E;

    public v(String str) throws UnsupportedEncodingException {
        super(str.getBytes(w.f24366b));
        this.f24364E = str;
    }

    public String a() {
        return this.f24364E;
    }
}
