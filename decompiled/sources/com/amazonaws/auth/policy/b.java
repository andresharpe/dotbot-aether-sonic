package com.amazonaws.auth.policy;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected String f23459a;

    /* renamed from: b, reason: collision with root package name */
    protected String f23460b;

    /* renamed from: c, reason: collision with root package name */
    protected List<String> f23461c;

    public String a() {
        return this.f23460b;
    }

    public String b() {
        return this.f23459a;
    }

    public List<String> c() {
        return this.f23461c;
    }

    public void d(String str) {
        this.f23460b = str;
    }

    public void e(String str) {
        this.f23459a = str;
    }

    public void f(List<String> list) {
        this.f23461c = list;
    }

    public b g(String str) {
        d(str);
        return this;
    }

    public b h(String str) {
        e(str);
        return this;
    }

    public b i(List<String> list) {
        f(list);
        return this;
    }

    public b j(String... strArr) {
        f(Arrays.asList(strArr));
        return this;
    }
}
