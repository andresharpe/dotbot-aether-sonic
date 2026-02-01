package com.amazonaws.auth.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class Statement {

    /* renamed from: b, reason: collision with root package name */
    private Effect f23454b;

    /* renamed from: e, reason: collision with root package name */
    private List<d> f23457e;

    /* renamed from: c, reason: collision with root package name */
    private List<Principal> f23455c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<a> f23456d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private List<b> f23458f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private String f23453a = null;

    /* loaded from: classes.dex */
    public enum Effect {
        Allow,
        Deny
    }

    public Statement(Effect effect) {
        this.f23454b = effect;
    }

    public List<a> a() {
        return this.f23456d;
    }

    public List<b> b() {
        return this.f23458f;
    }

    public Effect c() {
        return this.f23454b;
    }

    public String d() {
        return this.f23453a;
    }

    public List<Principal> e() {
        return this.f23455c;
    }

    public List<d> f() {
        return this.f23457e;
    }

    public void g(Collection<a> collection) {
        this.f23456d = new ArrayList(collection);
    }

    public void h(List<b> list) {
        this.f23458f = list;
    }

    public void i(Effect effect) {
        this.f23454b = effect;
    }

    public void j(String str) {
        this.f23453a = str;
    }

    public void k(Collection<Principal> collection) {
        this.f23455c = new ArrayList(collection);
    }

    public void l(Principal... principalArr) {
        k(new ArrayList(Arrays.asList(principalArr)));
    }

    public void m(Collection<d> collection) {
        this.f23457e = new ArrayList(collection);
    }

    public Statement n(a... aVarArr) {
        g(Arrays.asList(aVarArr));
        return this;
    }

    public Statement o(b... bVarArr) {
        h(Arrays.asList(bVarArr));
        return this;
    }

    public Statement p(String str) {
        j(str);
        return this;
    }

    public Statement q(Principal... principalArr) {
        l(principalArr);
        return this;
    }

    public Statement r(d... dVarArr) {
        m(Arrays.asList(dVarArr));
        return this;
    }
}
