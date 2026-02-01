package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: E, reason: collision with root package name */
    private final List<C1792f<?>> f34870E;

    public DependencyCycleException(List<C1792f<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f34870E = list;
    }

    public List<C1792f<?>> a() {
        return this.f34870E;
    }
}
