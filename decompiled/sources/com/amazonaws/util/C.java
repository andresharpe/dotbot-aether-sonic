package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Stack;

/* loaded from: classes.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final String f24259e = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    /* renamed from: a, reason: collision with root package name */
    private final Writer f24260a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24261b;

    /* renamed from: c, reason: collision with root package name */
    private Stack<String> f24262c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24263d;

    public C(Writer writer) {
        this(writer, null);
    }

    private void a(String str) {
        try {
            this.f24260a.append((CharSequence) str);
        } catch (IOException e4) {
            throw new AmazonClientException("Unable to write XML document", e4);
        }
    }

    private String c(String str) {
        if (str.contains("&")) {
            str = str.replace("&quot;", "\"").replace("&apos;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&");
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public C b() {
        a("</" + this.f24262c.pop() + ">");
        return this;
    }

    public C d(String str) {
        a("<" + str);
        if (this.f24263d && this.f24261b != null) {
            a(" xmlns=\"" + this.f24261b + "\"");
            this.f24263d = false;
        }
        a(">");
        this.f24262c.push(str);
        return this;
    }

    public C e(Object obj) {
        a(c(obj.toString()));
        return this;
    }

    public C f(String str) {
        a(c(str));
        return this;
    }

    public C g(Date date) {
        a(c(w.f(date)));
        return this;
    }

    public C(Writer writer, String str) {
        this.f24262c = new Stack<>();
        this.f24263d = true;
        this.f24260a = writer;
        this.f24261b = str;
        a(f24259e);
    }
}
