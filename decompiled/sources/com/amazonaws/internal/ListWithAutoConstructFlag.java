package com.amazonaws.internal;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class ListWithAutoConstructFlag<T> extends ArrayList<T> {

    /* renamed from: F, reason: collision with root package name */
    private static final long f23730F = 1;

    /* renamed from: E, reason: collision with root package name */
    private boolean f23731E;

    public ListWithAutoConstructFlag() {
    }

    public boolean b() {
        return this.f23731E;
    }

    public void d(boolean z3) {
        this.f23731E = z3;
    }

    public ListWithAutoConstructFlag(Collection<? extends T> collection) {
        super(collection);
    }

    public ListWithAutoConstructFlag(int i4) {
        super(i4);
    }
}
