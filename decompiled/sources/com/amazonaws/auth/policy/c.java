package com.amazonaws.auth.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f23462d = "2012-10-17";

    /* renamed from: a, reason: collision with root package name */
    private String f23463a;

    /* renamed from: b, reason: collision with root package name */
    private String f23464b;

    /* renamed from: c, reason: collision with root package name */
    private List<Statement> f23465c;

    public c() {
        this.f23464b = f23462d;
        this.f23465c = new ArrayList();
    }

    private void a() {
        HashSet hashSet = new HashSet();
        for (Statement statement : this.f23465c) {
            if (statement.d() != null) {
                hashSet.add(statement.d());
            }
        }
        int i4 = 0;
        for (Statement statement2 : this.f23465c) {
            if (statement2.d() == null) {
                do {
                    i4++;
                } while (hashSet.contains(Integer.toString(i4)));
                statement2.j(Integer.toString(i4));
            }
        }
    }

    public static c b(String str) {
        return new com.amazonaws.auth.policy.internal.b().d(str);
    }

    public String c() {
        return this.f23463a;
    }

    public Collection<Statement> d() {
        return this.f23465c;
    }

    public String e() {
        return this.f23464b;
    }

    public void f(String str) {
        this.f23463a = str;
    }

    public void g(Collection<Statement> collection) {
        this.f23465c = new ArrayList(collection);
        a();
    }

    public String h() {
        return new com.amazonaws.auth.policy.internal.c().m(this);
    }

    public c i(String str) {
        f(str);
        return this;
    }

    public c j(Statement... statementArr) {
        g(Arrays.asList(statementArr));
        return this;
    }

    public c(String str) {
        this.f23464b = f23462d;
        this.f23465c = new ArrayList();
        this.f23463a = str;
    }

    public c(String str, Collection<Statement> collection) {
        this(str);
        g(collection);
    }
}
